package org.booklore.repository;

import java.util.List;
import java.util.Optional;
import org.booklore.model.entity.TaskCronConfigurationEntity;
import org.booklore.model.enums.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCronConfigurationRepository
    extends JpaRepository<TaskCronConfigurationEntity, Long> {

  Optional<TaskCronConfigurationEntity> findByTaskType(TaskType taskType);

  List<TaskCronConfigurationEntity> findByEnabledTrue();
}
