package org.booklore.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SvgIconBatchRequest {

  @NotEmpty(message = "Icons list cannot be empty")
  @Valid
  private List<SvgIconCreateRequest> icons;
}
