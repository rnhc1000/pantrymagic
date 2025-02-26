package br.dev.ferreiras.pantry_provisioning.services;

import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import br.dev.ferreiras.pantry_provisioning.entities.Person;
import br.dev.ferreiras.pantry_provisioning.projections.FamilyDataProjection;
import br.dev.ferreiras.pantry_provisioning.repositories.FamilyRepository;
import br.dev.ferreiras.pantry_provisioning.services.exceptions.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class FamilyService {

  private static final Logger logger = LoggerFactory.getLogger(FamilyService.class);
  private final FamilyRepository familyRepository;

  public FamilyService(FamilyRepository familyRepository) {
    this.familyRepository = familyRepository;
  }

  public List<FamilyDataDTO> getAllFamilies() {

    List<FamilyDataProjection> families = familyRepository.getFamilyData();

    for (FamilyDataProjection family : families) {
      System.out.println(family.getMembers());
    }
    List<FamilyDataDTO> result = new ArrayList<>();
//
//      for (FamilyDataProjection family : families) {
//        result.add(new FamilyDataDTO(
//            family.getId(),
//            family.getFamilyName(),
//            family.getContactEmail(),
//            family.getContactPhone(),
//            family.getNumberOfAdults(),
//            family.getNumberOfKids(),
//            family.getAddress(),
//            family.getCity(),
//            family.getState(),
//            family.getZipCode(),
//            family.getMembers()
//
//            )
//        );
//      }

      return result;
    }


    public FamilyDataProjection getFamilyById (Long id){
      familyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Family not found!"));

      return familyRepository.findFamilyDataById(id);
    }

    public List<FamilyDataProjection> getAllMembers() {

    return familyRepository.findAllWithMembers();
    }
  }
