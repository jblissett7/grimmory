package org.booklore.model.dto.request;

import java.util.List;
import lombok.Data;
import org.booklore.model.dto.BookMetadata;

@Data
public class BookdropFinalizeRequest {
  private Boolean selectAll;
  private List<Long> excludedIds;
  private List<BookdropFinalizeFile> files;
  private Long defaultLibraryId;
  private Long defaultPathId;

  @Data
  public static class BookdropFinalizeFile {
    private Long fileId;
    private Long libraryId;
    private Long pathId;
    private BookMetadata metadata;
  }
}
