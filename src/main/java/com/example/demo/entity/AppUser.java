package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@Table(name = "App_User", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name")})
public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "User_Id", nullable = false)
    private Long userId;


    @Column(name = "User_Name", length = 36, nullable = false)
    private String userName;

    @Column(name = "Encrypted_Password", length = 128, nullable = false)
    private String encryptedPassword;

    @Column(name = "Enabled", length = 1, nullable = false)
    private boolean enable;

    public AppUser() {
        super();
    }
}
