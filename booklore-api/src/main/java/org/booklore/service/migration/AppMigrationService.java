package org.booklore.service.migration;

import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.booklore.model.entity.AppMigrationEntity;
import org.booklore.repository.AppMigrationRepository;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class AppMigrationService {

  private AppMigrationRepository migrationRepository;

  @Transactional
  public void executeMigration(Migration migration) {
    if (migrationRepository.existsById(migration.getKey())) {
      log.debug("Migration '{}' already executed, skipping", migration.getKey());
      return;
    }
    try {
      migration.execute();
      AppMigrationEntity entity =
          new AppMigrationEntity(
              migration.getKey(), LocalDateTime.now(), migration.getDescription());
      migrationRepository.save(entity);

      log.info("Migration '{}' completed successfully", migration.getKey());
    } catch (Exception e) {
      log.error("Migration '{}' failed", migration.getKey(), e);
      throw e;
    }
  }
}
