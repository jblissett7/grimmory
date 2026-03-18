package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;
import lombok.Data;
import org.booklore.model.dto.BookMetadata;

@Data
public class BookdropBulkEditRequest {
  @NotNull private BookMetadata fields;
  @NotNull private Set<String> enabledFields;
  private boolean mergeArrays;
  private boolean selectAll;
  private List<Long> excludedIds;
  private List<Long> selectedIds;
}
