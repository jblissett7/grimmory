package org.booklore.repository;

import java.util.List;
import java.util.Optional;
import org.booklore.model.entity.BookLoreUserEntity;
import org.booklore.model.entity.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {
  Optional<RefreshTokenEntity> findByToken(String token);

  List<RefreshTokenEntity> findAllByUserAndRevokedFalse(BookLoreUserEntity user);

  void deleteByUser(BookLoreUserEntity user);
}
