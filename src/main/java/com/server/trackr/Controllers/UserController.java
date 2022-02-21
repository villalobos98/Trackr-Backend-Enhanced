package com.server.trackr.Controllers;

import com.server.trackr.Service.UserCredentialService;
import com.server.trackr.Entities.Credential;
import com.server.trackr.Entities.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserCredentialService service;

    @GetMapping("/up")
    public ResponseEntity<String> heartBeat(){
        return new ResponseEntity<>("API is UP", HttpStatus.OK);
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody UserProfile userProfile) {
    //        service.saveUser(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserProfile userProfile) {
    //        service.findUserAndPassword(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

    @PostMapping("/forgotPassword")
    public ResponseEntity<String> forgotPassword(@RequestBody Credential credential) {

        return new ResponseEntity<>("Password Reset Email sent", HttpStatus.OK);
    }


    }
