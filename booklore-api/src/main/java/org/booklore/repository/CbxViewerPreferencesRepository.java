package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.CbxViewerPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CbxViewerPreferencesRepository
    extends JpaRepository<CbxViewerPreferencesEntity, Long> {

  Optional<CbxViewerPreferencesEntity> findByBookIdAndUserId(long bookId, Long id);
}
