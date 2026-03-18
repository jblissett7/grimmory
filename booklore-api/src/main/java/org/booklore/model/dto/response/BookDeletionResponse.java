package org.booklore.model.dto.response;

import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDeletionResponse {
  private Set<Long> deleted;
  private List<Long> failedFileDeletions;
}
