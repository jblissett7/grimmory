package org.booklore.service.metadata.extractor;

import java.io.File;
import org.booklore.model.dto.BookMetadata;

public interface FileMetadataExtractor {

  BookMetadata extractMetadata(File file);

  byte[] extractCover(File file);
}
