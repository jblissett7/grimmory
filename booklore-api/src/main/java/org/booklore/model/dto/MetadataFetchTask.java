package org.booklore.model.dto;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.booklore.model.enums.MetadataFetchTaskStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetadataFetchTask {
  private String id;
  private MetadataFetchTaskStatus status;
  private int completed;
  private int totalBooks;
  private Instant startedAt;
  private Instant completedAt;
  private Long initiatedBy;
  private List<FetchedProposal> proposals;
}
