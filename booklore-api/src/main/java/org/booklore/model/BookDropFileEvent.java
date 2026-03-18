package org.booklore.model;

import java.nio.file.Path;
import java.nio.file.WatchEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class BookDropFileEvent {
  private final Path file;
  private final WatchEvent.Kind<?> kind;
}
