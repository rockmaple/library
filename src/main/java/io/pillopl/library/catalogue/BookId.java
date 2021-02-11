package io.pillopl.library.catalogue;

import lombok.NonNull;
import lombok.Value;

import java.util.UUID;

/**
 * 值对象
 */
@Value
public class BookId {

    @NonNull
    UUID bookId;
}
