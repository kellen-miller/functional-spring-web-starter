package org.swiftec.projectcar.backend.models;

import io.soabase.recordbuilder.core.RecordBuilder;
import org.springframework.lang.NonNull;

@RecordBuilder
public record Author(
        @NonNull String firstName,
        @NonNull String lastName
) {
}
