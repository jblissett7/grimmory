package org.booklore.model.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookNoteV2 {
  private Long id;
  private Long userId;
  private Long bookId;
  private String cfi;
  private String selectedText;
  private String noteContent;
  private String color;
  private String chapterTitle;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
