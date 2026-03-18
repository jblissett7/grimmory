package org.booklore.repository;

import java.util.List;
import org.booklore.model.entity.TaskHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskHistoryRepository extends JpaRepository<TaskHistoryEntity, String> {

  @Query(
      "SELECT t FROM TaskHistoryEntity t WHERE t.createdAt = "
          + "(SELECT MAX(t2.createdAt) FROM TaskHistoryEntity t2 WHERE t2.type = t.type) "
          + "ORDER BY t.createdAt DESC")
  List<TaskHistoryEntity> findLatestTaskForEachType();
}
