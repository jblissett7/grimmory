package org.booklore.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.dto.MetadataFetchTask;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetadataTaskDetailsResponse {

  private MetadataFetchTask task;
}
