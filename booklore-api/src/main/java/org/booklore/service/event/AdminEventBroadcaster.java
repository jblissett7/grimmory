package org.booklore.service.event;

import java.util.List;
import lombok.AllArgsConstructor;
import org.booklore.model.dto.BookLoreUser;
import org.booklore.model.websocket.LogNotification;
import org.booklore.model.websocket.Topic;
import org.booklore.service.user.UserService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AdminEventBroadcaster {

  private final SimpMessagingTemplate messagingTemplate;
  private final UserService userService;

  public void broadcastAdminEvent(String message) {
    List<BookLoreUser> admins =
        userService.getBookLoreUsers().stream().filter(u -> u.getPermissions().isAdmin()).toList();
    for (BookLoreUser admin : admins) {
      messagingTemplate.convertAndSendToUser(
          admin.getUsername(), Topic.LOG.getPath(), LogNotification.info(message));
    }
  }
}
