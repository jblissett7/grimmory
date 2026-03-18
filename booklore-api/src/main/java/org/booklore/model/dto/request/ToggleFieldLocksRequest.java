package org.booklore.model.dto.request;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class ToggleFieldLocksRequest {
  private List<Long> bookIds;
  private Map<String, String> fieldActions;
}
