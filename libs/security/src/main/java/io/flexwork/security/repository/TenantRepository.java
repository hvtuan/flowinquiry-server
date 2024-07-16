package io.flexwork.security.repository;

import io.flexwork.security.domain.Tenant;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
    Optional<Tenant> findByNameIgnoreCase(String name);

    Optional<Tenant> findByDomainContainingIgnoreCase(String domain);
}
