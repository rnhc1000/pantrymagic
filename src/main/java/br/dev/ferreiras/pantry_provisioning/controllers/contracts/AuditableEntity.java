package br.dev.ferreiras.pantry_provisioning.controllers.contracts;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity {

  @CreatedDate
  @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
  private Instant createdDate;

  @LastModifiedDate
  @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
  private Instant lastModifiedDate;

  public Instant getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(final Instant createdDate) {
    this.createdDate = createdDate;
  }


  public Instant getLastModifiedDate() {
    return this.lastModifiedDate;
  }

  public void setLastModifiedDate(final Instant lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
}