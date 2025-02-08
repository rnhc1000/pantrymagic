package br.dev.ferreiras.pantry_provisioning.services;

import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import br.dev.ferreiras.pantry_provisioning.entities.Person;
import br.dev.ferreiras.pantry_provisioning.projections.FamilyDataProjection;
import br.dev.ferreiras.pantry_provisioning.repositories.FamilyRepository;
import br.dev.ferreiras.pantry_provisioning.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FamilyService {

  private final FamilyRepository familyRepository;

  public FamilyService(FamilyRepository familyRepository) {
    this.familyRepository = familyRepository;
  }

  public List<FamilyDataDTO> getAllFamilies() {

    List<FamilyDataProjection> families = familyRepository.getFamilyData();

    List<FamilyDataDTO> result = new ArrayList<>();
      for (FamilyDataProjection family : families) {
        result.add(new FamilyDataDTO(
            family.getId(),
            family.getFamilyName(),
            family.getContactEmail(),
            family.getContactPhone(),
            family.getNumberOfAdults(),
            family.getNumberOfKids(),
            family.getAddress(),
            family.getCity(),
            family.getState(),
            family.getZipCode(),
            family.getLocation(),
            family.getPersonList()
            )
        );
      }

      return result;
    }


    public FamilyDataDTO getFamilyById (Long id){

      familyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Family not found!"));
      FamilyDataProjection family = familyRepository.findFamilyDataById(id);
      return new FamilyDataDTO(
          family.getId(),
          family.getFamilyName(),
          family.getContactEmail(),
          family.getContactPhone(),
          family.getNumberOfAdults(),
          family.getNumberOfKids(),
          family.getAddress(),
          family.getCity(),
          family.getState(),
          family.getZipCode(),
          family.getLocation(),
          family.getPersonList()
      );
    }
  }
