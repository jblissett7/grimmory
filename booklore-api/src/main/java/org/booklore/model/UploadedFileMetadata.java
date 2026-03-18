package org.booklore.model;

import java.util.List;
import lombok.Data;

@Data
public class UploadedFileMetadata {
  private String title;
  private List<String> authors;
}
