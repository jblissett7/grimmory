package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Data;
import org.booklore.model.enums.MergeMetadataType;

@Data
public class DeleteMetadataRequest {
  @NotNull private MergeMetadataType metadataType;

  @NotEmpty private List<String> valuesToDelete;
}
