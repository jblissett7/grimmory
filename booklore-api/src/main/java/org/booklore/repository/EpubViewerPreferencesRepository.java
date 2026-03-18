package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.EpubViewerPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpubViewerPreferencesRepository
    extends JpaRepository<EpubViewerPreferencesEntity, Long> {

  Optional<EpubViewerPreferencesEntity> findByBookIdAndUserId(Long bookId, Long userId);
}
