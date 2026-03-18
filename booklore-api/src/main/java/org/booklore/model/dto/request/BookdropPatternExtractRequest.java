package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import java.util.List;
import lombok.Data;

@Data
public class BookdropPatternExtractRequest {
  @NotBlank private String pattern;
  private Boolean selectAll;
  private List<Long> excludedIds;
  private List<Long> selectedIds;
  private Boolean preview;
}
