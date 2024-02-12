package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;

    public UserDTO(User model) {
        id = model.getId();
        name = model.getName();
        email = model.getEmail();
        phone = model.getPhone();
        birthDate = model.getBirthDate();
        password = model.getPassword();
    }

}
