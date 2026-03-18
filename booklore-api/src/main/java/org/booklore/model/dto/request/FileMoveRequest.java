package org.booklore.model.dto.request;

import java.util.List;
import java.util.Set;
import lombok.Data;

@Data
public class FileMoveRequest {
  private Set<Long> bookIds;
  private List<Move> moves;

  @Data
  public static class Move {
    private Long bookId;
    private Long targetLibraryId;
    private Long targetLibraryPathId;
  }
}
