package org.booklore.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppNotebookEntry {
  private Long id;
  private String type;
  private Long bookId;
  private String text;
  private String note;
  private String color;
  private String style;
  private String chapterTitle;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
