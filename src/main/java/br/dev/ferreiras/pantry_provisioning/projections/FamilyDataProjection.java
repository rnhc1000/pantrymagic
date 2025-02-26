package br.dev.ferreiras.pantry_provisioning.projections;

import java.util.List;

public interface FamilyDataProjection {

  Long getId();

  String getFamilyName();

  String getContactEmail();

  String getContactPhone();

  Integer getNumberOfAdults();

  Integer getNumberOfKids();

  String getAddress();

  String getCity();

  String getState();

  String getZipCode();

  String getLocation();

  List<MembersProjection> getMembers();

}

