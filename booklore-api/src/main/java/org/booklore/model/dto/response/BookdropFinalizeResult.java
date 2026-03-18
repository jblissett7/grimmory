package org.booklore.model.dto.response;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookdropFinalizeResult {
  private int totalFiles;
  private int successfullyImported;
  private int failed;
  private Instant processedAt;
  @Builder.Default private List<BookdropFileResult> results = new ArrayList<>();
}
