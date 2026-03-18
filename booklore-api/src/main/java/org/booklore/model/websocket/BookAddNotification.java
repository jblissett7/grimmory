package org.booklore.model.websocket;

import lombok.Data;
import org.booklore.model.dto.Book;

@Data
public class BookAddNotification {
  private Book addedBook;
}
