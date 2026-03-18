package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.PdfViewerPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdfViewerPreferencesRepository
    extends JpaRepository<PdfViewerPreferencesEntity, Long> {

  Optional<PdfViewerPreferencesEntity> findByBookIdAndUserId(long bookId, Long id);
}
