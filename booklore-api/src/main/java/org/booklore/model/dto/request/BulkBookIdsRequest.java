package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotEmpty;
import java.util.Set;
import lombok.Data;

@Data
public class BulkBookIdsRequest {
  @NotEmpty(message = "At least one book ID is required")
  private Set<Long> bookIds;
}
