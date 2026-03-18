package org.booklore.model.dto.request;

import java.util.Set;
import lombok.Data;
import org.booklore.model.enums.Lock;

@Data
public class ToggleAllLockRequest {
  private Set<Long> bookIds;
  private Lock lock;
}
