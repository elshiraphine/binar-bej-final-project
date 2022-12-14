package com.binar.flyket.dto.model;

import com.binar.flyket.model.user.ERoles;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String title;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String imgUrl;
    private String phoneNumber;
    private ERoles role;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
