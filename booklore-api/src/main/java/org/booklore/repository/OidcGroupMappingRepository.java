package org.booklore.repository;

import java.util.Collection;
import java.util.List;
import org.booklore.model.entity.OidcGroupMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OidcGroupMappingRepository extends JpaRepository<OidcGroupMappingEntity, Long> {
  List<OidcGroupMappingEntity> findByOidcGroupClaimIn(Collection<String> oidcGroupClaims);
}
