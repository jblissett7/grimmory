package org.booklore.model.dto.request;

import java.util.List;
import lombok.Data;
import org.booklore.model.enums.MergeMetadataType;

@Data
public class MergeMetadataRequest {
  private MergeMetadataType metadataType;
  private List<String> targetValues;
  private List<String> valuesToMerge;
}
