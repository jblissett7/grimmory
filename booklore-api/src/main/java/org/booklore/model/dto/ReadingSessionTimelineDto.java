package org.booklore.model.dto;

import java.time.LocalDateTime;
import org.booklore.model.enums.BookFileType;

public interface ReadingSessionTimelineDto {
  Long getBookId();

  String getBookTitle();

  BookFileType getBookFileType();

  LocalDateTime getStartDate();

  LocalDateTime getEndDate();

  Long getTotalSessions();

  Long getTotalDurationSeconds();
}
