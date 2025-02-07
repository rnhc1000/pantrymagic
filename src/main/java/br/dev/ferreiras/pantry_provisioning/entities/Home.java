package br.dev.ferreiras.pantry_provisioning.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_home")
public class Home {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(columnDefinition = "TEXT")
  private String address;

  private String city;
  private String state;
  private String zipCode;
  private String location;

  @CreationTimestamp(source = SourceType.DB)
  private Instant createdAt;

  @UpdateTimestamp(source = SourceType.DB)
  private Instant updateAt;

  @OneToOne
  @MapsId
  private Family family;

  public Home() {
  }

  public Home(Long id, String address, String city, String state, String zipCode, String location, Family family) {
    this.id = id;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.location = location;
    this.family = family;
  }

  public Family getFamily() {
    return family;
  }

  public void setFamily(Family family) {
    this.family = family;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    Home home = (Home) o;
    return Objects.equals(id, home.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
