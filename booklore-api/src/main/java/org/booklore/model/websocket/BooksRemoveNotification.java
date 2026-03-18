package org.booklore.model.websocket;

import java.util.Set;
import lombok.Data;

@Data
public class BooksRemoveNotification {
  private Set<Long> removedBookIds;
}
