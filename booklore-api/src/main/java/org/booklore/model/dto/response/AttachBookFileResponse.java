package org.booklore.model.dto.response;

import java.util.List;
import org.booklore.model.dto.Book;

public record AttachBookFileResponse(Book updatedBook, List<Long> deletedSourceBookIds) {}
