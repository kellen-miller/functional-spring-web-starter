package org.swiftec.projectcar.backend.models;

import io.soabase.recordbuilder.core.RecordBuilder;
import org.springframework.lang.NonNull;

@RecordBuilder
public record Review(
        @NonNull String title,
        String content,
        @NonNull Author author
) {
}
