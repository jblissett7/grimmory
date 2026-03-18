package org.booklore.model.dto.request;

import java.util.List;
import lombok.Data;

@Data
public class BookdropSelectionRequest {
  private boolean selectAll;
  private List<Long> excludedIds;
  private List<Long> selectedIds;
}
