package org.booklore.service.fileprocessor;

import java.util.List;
import org.booklore.model.FileProcessResult;
import org.booklore.model.dto.settings.LibraryFile;
import org.booklore.model.entity.BookEntity;
import org.booklore.model.entity.BookFileEntity;
import org.booklore.model.enums.BookFileType;

public interface BookFileProcessor {
  List<BookFileType> getSupportedTypes();

  FileProcessResult processFile(LibraryFile libraryFile);

  boolean generateCover(BookEntity bookEntity);

  default boolean generateCover(BookEntity bookEntity, BookFileEntity bookFile) {
    return generateCover(bookEntity);
  }

  default boolean generateAudiobookCover(BookEntity bookEntity) {
    return generateCover(bookEntity);
  }
}
