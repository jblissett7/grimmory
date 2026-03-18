package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.NewPdfViewerPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewPdfViewerPreferencesRepository
    extends JpaRepository<NewPdfViewerPreferencesEntity, Long> {

  Optional<NewPdfViewerPreferencesEntity> findByBookIdAndUserId(long bookId, Long id);
}
