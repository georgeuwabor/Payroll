package com.example.Payroll;

import java.util.Objects;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "CUSTOMER_ORDER")
class CUSTOMER_ORDER {

  private @Id @GeneratedValue Long id;

  private String description;
  private Status status;

  CUSTOMER_ORDER() {}

  CUSTOMER_ORDER(String description, Status status) {

    this.description = description;
    this.status = status;
  }

  public Long getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof CUSTOMER_ORDER))
      return false;
    CUSTOMER_ORDER order = (CUSTOMER_ORDER) o;
    return Objects.equals(this.id, order.id) && Objects.equals(this.description, order.description)
        && this.status == order.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.description, this.status);
  }

  @Override
  public String toString() {
    return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
  }
}