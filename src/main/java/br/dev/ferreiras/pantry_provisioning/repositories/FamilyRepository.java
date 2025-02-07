package br.dev.ferreiras.pantry_provisioning.repositories;

import br.dev.ferreiras.pantry_provisioning.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {
}
