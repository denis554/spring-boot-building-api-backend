package com.example.orm.jpa;

import java.io.Serializable;

/**
 * Interface for entity objects.
 *
 * @param <T> the type of {@link EntityId} that will be used in this entity
 */
public interface Entity<T extends EntityId> {

    T getId();
}
