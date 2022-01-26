package com.azure.spring.cloud.example.customers.web;
import com.azure.spring.cloud.example.customers.model.Pet;
import com.azure.spring.cloud.example.customers.model.PetType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PetDetails {
    private long id;
    private String name;
    private String owner;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    private PetType type;

    PetDetails(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.owner = pet.getOwner().getFirstName() + " " + pet.getOwner().getLastName();
        this.birthDate = pet.getBirthDate();
        this.type = pet.getType();
    }
}
