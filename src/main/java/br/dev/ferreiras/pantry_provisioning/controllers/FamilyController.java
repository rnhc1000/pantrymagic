package br.dev.ferreiras.pantry_provisioning.controllers;

import br.dev.ferreiras.pantry_provisioning.controllers.contracts.FamilyControllerContract;
import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import br.dev.ferreiras.pantry_provisioning.projections.FamilyDataProjection;
import br.dev.ferreiras.pantry_provisioning.services.FamilyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FamilyController implements FamilyControllerContract {

  private final FamilyService familyService;

  public FamilyController(FamilyService familyService) {
    this.familyService = familyService;
  }

  /**
   *
   * @return all families persisted
   */
  @Override
  public ResponseEntity<List<FamilyDataProjection>> getAllFamilies() {

    return ResponseEntity.ok(familyService.getAllMembers());
  }

  /**
   * @param id - id of a family
   * @return FamilyDTO based on its id
   */
  @Override
  public ResponseEntity<FamilyDataProjection> getFamilyById(Long id) {

    return ResponseEntity.ok(familyService.getFamilyById(id));
  }
}
