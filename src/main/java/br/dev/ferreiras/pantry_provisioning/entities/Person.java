package br.dev.ferreiras.pantry_provisioning.entities;

import br.dev.ferreiras.pantry_provisioning.controllers.contracts.AuditableEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "tb_person")
public class Person extends AuditableEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstName;
  private String lastName;
  private LocalDate dob;
  private String email;
  private Integer calories;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "family_id")
  private Family family;

  public Person() {
  }

  public Person(Long id, String firstName, String lastName, LocalDate dob, String email, Integer calories, Family family) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.email = email;
    this.calories = calories;
    this.family = family;
  }

  public Person(Long id, String firstName, String lastName, LocalDate dob, String email, Integer calories, Long id1) {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDoB() {
    return dob;
  }

  public void setDoB(LocalDate dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getCalories() {
    return calories;
  }

  public void setCalories(Integer calories) {
    this.calories = calories;
  }

  public Family getFamily() {
    return family;
  }

  public void setFamily(Family family) {
    this.family = family;
  }
}
