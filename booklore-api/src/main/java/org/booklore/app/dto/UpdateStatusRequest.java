package org.booklore.app.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.booklore.model.enums.ReadStatus;

@Data
public class UpdateStatusRequest {
  @NotNull(message = "Status is required")
  private ReadStatus status;
}
