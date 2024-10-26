package com.dinesh.accountws.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

// Tell Spring boot that this a JPA Entity
@Entity

// Lombok annotations Create getters and setters
@Getter
@Setter
@ToString
// Lombok annotations Create constructor. One creates a constructor with all fields. Another creates a constructor with no fields
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    // Note even if we do not specify the name, it will be created as customer_id
    // Reason Spring is smart enough to understand that the name of the column is customer_id based on customerId.
    // Similar for others
    // Specifying name is good when we want the name of variable different from the name of the column.
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;

}
