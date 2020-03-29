package pms.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import pms.api.models.Claim;

@RestResource(exported = false)
public interface ClaimsRepository extends JpaRepository<Claim, Long> {
}
