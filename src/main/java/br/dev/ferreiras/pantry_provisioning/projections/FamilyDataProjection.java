package br.dev.ferreiras.pantry_provisioning.projections;

public interface FamilyDataProjection {

  public Long getId();
  public String getFamilyName();
  public String getContactEmail();
  public String getContactPhone();
  public Integer getNumberOfAdults();
  public Integer getNumberOfKids();
  public String getAddress();
  public String getCity();
  public String getState();
  public String getZipCode();
  public String getLocation();

}
