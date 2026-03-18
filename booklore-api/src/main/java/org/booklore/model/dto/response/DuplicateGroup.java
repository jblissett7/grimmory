package org.booklore.model.dto.response;

import java.util.List;
import org.booklore.model.dto.Book;

public record DuplicateGroup(Long suggestedTargetBookId, String matchReason, List<Book> books) {}
