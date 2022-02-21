package com.server.trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;


@Entity
@Table(name = "USER_CREDENTIAL")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer userID;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASS_WORD")
    private String password;

    @Column(name = "LOGIN_DATE")
    private Instant loginDate = Instant.now();

}
