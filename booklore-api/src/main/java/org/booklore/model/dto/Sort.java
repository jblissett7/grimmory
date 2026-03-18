package org.booklore.model.dto;

import lombok.Data;
import org.booklore.model.enums.SortDirection;

@Data
public class Sort {
  private String field;
  private SortDirection direction;
}
