package br.dev.ferreiras.pantry_provisioning.entities;

import br.dev.ferreiras.pantry_provisioning.controllers.contracts.AuditableEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_family")
public class Family extends AuditableEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String familyName;

  @Column(unique = true)
  private String contactEmail;

  @Column(unique = true)
  private String contactPhone;

  private Integer numberOfAdults;
  private Integer numberOfKids;


  @OneToMany(mappedBy = "family", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Person> members;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "home_id", referencedColumnName = "id")
  private Home home;

  public Family() {
  }

  public Family(Long id, String familyName, String contactEmail, String contactPhone, Integer numberOfAdults, Integer numberOfKids, Home home) {
    this.id = id;
    this.familyName = familyName;
    this.contactEmail = contactEmail;
    this.contactPhone = contactPhone;
    this.numberOfAdults = numberOfAdults;
    this.numberOfKids = numberOfKids;
    this.home = home;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Integer getNumberOfAdults() {
    return numberOfAdults;
  }

  public void setNumberOfAdults(Integer numberOfAdults) {
    this.numberOfAdults = numberOfAdults;
  }

  public Integer getNumberOfKids() {
    return numberOfKids;
  }

  public void setNumberOfKids(Integer numberOfKids) {
    this.numberOfKids = numberOfKids;
  }

  public Home getHome() {
    return home;
  }

  public void setHome(Home home) {
    this.home = home;
  }

  public List<Person> getMembers() {
    return members;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Family family = (Family) o;
    return Objects.equals(id, family.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}

