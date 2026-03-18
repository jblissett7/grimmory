package org.booklore.model.dto.request;

import lombok.Data;
import org.booklore.model.enums.OpdsSortOrder;

@Data
public class OpdsUserV2CreateRequest {
  private String username;
  private String password;
  private OpdsSortOrder sortOrder;
}
