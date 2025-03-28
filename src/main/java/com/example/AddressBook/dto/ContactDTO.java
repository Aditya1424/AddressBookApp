
package com.example.AddressBook.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactDTO {

    String name;

    @Email
    @NotBlank
    String email;

    Long phoneNumber;

    String Address;

    Long id;

    public ContactDTO(String adityaGupta, String mail, long l, String agra) {
    }
}
