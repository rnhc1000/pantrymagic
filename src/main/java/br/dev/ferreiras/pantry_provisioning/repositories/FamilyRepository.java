package br.dev.ferreiras.pantry_provisioning.repositories;

import br.dev.ferreiras.pantry_provisioning.entities.Family;
import br.dev.ferreiras.pantry_provisioning.projections.FamilyDataProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {

  @Query(
      nativeQuery = true,
      value = """
          SELECT t.id, t.family_name, t.contact_email, t.contact_phone,
          t.number_of_adults, t.number_of_kids, h.address, h.city, h.state,
          h.zip_code, h.location from tb_family t INNER JOIN tb_home h ON t.id = h.family_id
          """
  )
  List<FamilyDataProjection> getFamilyData();

  @Query(
      nativeQuery = true,
      value = """
          SELECT t.id, t.family_name, t.contact_email , t.contact_phone,
          t.number_of_adults, t.number_of_kids, h.address, h.city, h.state,
          h.zip_code, h.location from tb_family t INNER JOIN tb_home h ON t.id = h.family_id
          where t.id = :id
          """
  )
  FamilyDataProjection findFamilyDataById(@Param("id") Long id);
}
