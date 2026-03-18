package org.booklore.model.dto;

import java.time.Instant;
import lombok.*;
import org.booklore.model.enums.FetchedMetadataProposalStatus;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FetchedProposal {
  private Long proposalId;
  private String taskId;
  private Long bookId;
  private Instant fetchedAt;
  private Instant reviewedAt;
  private String reviewerUserId;
  private FetchedMetadataProposalStatus status;
  private BookMetadata metadataJson;
}
