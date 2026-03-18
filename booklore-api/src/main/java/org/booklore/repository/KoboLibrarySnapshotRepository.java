package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.KoboLibrarySnapshotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KoboLibrarySnapshotRepository
    extends JpaRepository<KoboLibrarySnapshotEntity, String> {

  Optional<KoboLibrarySnapshotEntity> findByIdAndUserId(String id, Long userId);

  Optional<KoboLibrarySnapshotEntity> findTopByUserIdOrderByCreatedDateDesc(Long userId);
}
