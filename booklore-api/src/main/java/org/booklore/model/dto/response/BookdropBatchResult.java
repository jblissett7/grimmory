package org.booklore.model.dto.response;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookdropBatchResult {
  private int totalFiles;
  private int successfullyImported;
  private int failed;
  private Instant processedAt;
  private List<BookdropFileResult> fileResults;
}
