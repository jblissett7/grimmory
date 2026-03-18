package org.booklore.model.dto;

import lombok.Data;
import org.booklore.model.entity.BookdropFileEntity.Status;

@Data
public class BookdropFile {
  private Long id;
  private String fileName;
  private String filePath;
  private Long fileSize;
  private BookMetadata originalMetadata;
  private BookMetadata fetchedMetadata;
  private String createdAt;
  private String updatedAt;
  private Status status;
}
