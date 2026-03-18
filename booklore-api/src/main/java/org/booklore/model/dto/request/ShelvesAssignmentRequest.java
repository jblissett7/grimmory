package org.booklore.model.dto.request;

import java.util.Set;
import lombok.Data;

@Data
public class ShelvesAssignmentRequest {
  private Set<Long> bookIds;
  private Set<Long> shelvesToAssign;
  private Set<Long> shelvesToUnassign;
}
