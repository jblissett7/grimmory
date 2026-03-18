package org.booklore.model.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BookLoreUserEntityTest {

  @Test
  void builderShouldInitializeCollections() {
    BookLoreUserEntity user = BookLoreUserEntity.builder().isDefaultPassword(false).build();

    assertThat(user.getShelves()).isNotNull().isEmpty();
    assertThat(user.getSettings()).isNotNull().isEmpty();

    assertThat(user.isDefaultPassword()).isFalse();

    BookLoreUserEntity defaultUser = BookLoreUserEntity.builder().isDefaultPassword(false).build();
    assertThat(defaultUser.isDefaultPassword()).isFalse();
  }
}
