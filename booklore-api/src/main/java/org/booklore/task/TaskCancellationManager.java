package org.booklore.task;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class TaskCancellationManager {

  private final Set<String> cancelledTasks = ConcurrentHashMap.newKeySet();

  public void cancelTask(String taskId) {
    cancelledTasks.add(taskId);
  }

  public boolean isTaskCancelled(String taskId) {
    return cancelledTasks.contains(taskId);
  }

  public void clearCancellation(String taskId) {
    cancelledTasks.remove(taskId);
  }
}
