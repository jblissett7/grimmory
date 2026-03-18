package org.booklore.model.dto.request;

import jakarta.validation.constraints.NotNull;
import org.booklore.model.enums.OpdsSortOrder;

public record OpdsUserV2UpdateRequest(
    @NotNull(message = "Sort order is required") OpdsSortOrder sortOrder) {}
