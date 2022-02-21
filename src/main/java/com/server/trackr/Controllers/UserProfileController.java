package com.server.trackr.Controllers;

import com.server.trackr.Entities.UserProfile;
import com.server.trackr.Service.UserProfileService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
@CrossOrigin(origins = "http://localhost:3000")
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileController {
    @Autowired
    UserProfileService service;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserProfile userProfile) {
        service.saveProfile(userProfile);
        return new ResponseEntity<>("User Profile Created And Saved", HttpStatus.OK);
    }


    @DeleteMapping("/update")
    public ResponseEntity<String> updateProfile(@RequestBody UserProfile userProfile) {
        service.updateProfile(userProfile);
        return new ResponseEntity<>("User Profile Updated", HttpStatus.OK);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteProfile(@RequestBody UserProfile userProfile) {
        service.deleteProfile(userProfile);
        return new ResponseEntity<>("User Profile Deleted", HttpStatus.OK);
    }

}
