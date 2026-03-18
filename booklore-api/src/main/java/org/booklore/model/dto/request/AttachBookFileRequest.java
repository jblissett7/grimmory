package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Data;

@Data
public class AttachBookFileRequest {
  @NotNull @NotEmpty private List<Long> sourceBookIds;
  private boolean moveFiles;
}
