package org.booklore.repository;

import java.util.Optional;
import org.booklore.model.entity.PdfAnnotationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PdfAnnotationRepository extends JpaRepository<PdfAnnotationEntity, Long> {

  Optional<PdfAnnotationEntity> findByBookIdAndUserId(Long bookId, Long userId);

  void deleteByBookIdAndUserId(Long bookId, Long userId);
}
