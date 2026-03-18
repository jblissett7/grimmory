package org.booklore.repository;

import java.util.List;
import java.util.Optional;
import org.booklore.model.entity.KoboUserSettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KoboUserSettingsRepository extends JpaRepository<KoboUserSettingsEntity, Long> {

  Optional<KoboUserSettingsEntity> findByUserId(Long userId);

  Optional<KoboUserSettingsEntity> findByToken(String token);

  List<KoboUserSettingsEntity> findByAutoAddToShelfTrueAndSyncEnabledTrue();

  long countByHardcoverSyncEnabledTrue();

  long countByAutoAddToShelfTrue();
}
