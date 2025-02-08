package br.dev.ferreiras.pantry_provisioning.controllers;

import br.dev.ferreiras.pantry_provisioning.controllers.contracts.FamilyControllerContract;
import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import br.dev.ferreiras.pantry_provisioning.services.FamilyService;
import org.apache.coyote.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
  public ResponseEntity<List<FamilyDataDTO>> getAllFamilies() {

    return ResponseEntity.ok(familyService.getAllFamilies());
  }

  /**
   * @param id - id of a family
   * @return FamilyDTO based on its id
   */
  @Override
  public ResponseEntity<FamilyDataDTO> getFamilyById(Long id) {

    return ResponseEntity.ok(familyService.getFamilyById(id));
  }
}
