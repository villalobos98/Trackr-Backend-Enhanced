package com.server.trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "USER_PROFILE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userID;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name="GENDER")
    private String gender;

    @Column(name = "CREATED_AT")
    private Instant createdAt = Instant.now();

    @Column(name = "STATUS", columnDefinition = "boolean default True")
    private Boolean status;
}
