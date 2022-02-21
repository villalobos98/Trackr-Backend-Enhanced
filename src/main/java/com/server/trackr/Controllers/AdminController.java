//package com.server.trackr.Trackr.Controllers;
//
//import com.server.trackr.Trackr.Entities.Admin;
//import com.server.trackr.Trackr.Entities.UserProfile;
//import com.server.trackr.Trackr.Service.AdminControlService;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/admin")
//@NoArgsConstructor
//@AllArgsConstructor
//public class AdminController {
//    @Autowired
//    AdminControlService service;
//
//    Boolean isAdminAuthenticated = Boolean.FALSE;
//
//    //FIND ONE USER BY ID
//    @GetMapping("/find/{user_id}")
//    public ResponseEntity<Object> findUser(@RequestBody Integer userID) {
//        if(!isAdminAuthenticated){
//            return new ResponseEntity<>("ERROR, NOT AUTHENTICATED, USE /AUTHENTICATE ROUTE", HttpStatus.UNAUTHORIZED);
//        }
//
//        UserProfile userProfile = service.findUserByID(userID);
//        return new ResponseEntity<>(userProfile, HttpStatus.OK);
//    }
//    //FIND ONE USER BY EMAIL
//    @GetMapping("/find/user")
//    public ResponseEntity<Object> findEmail(@RequestBody String email) {
//        if(!isAdminAuthenticated){
//            return new ResponseEntity<>("ERROR, NOT AUTHENTICATED, USE /AUTHENTICATE ROUTE", HttpStatus.UNAUTHORIZED);
//        }
//
//        UserProfile userProfile = service.findUserByEmail(email);
//        return new ResponseEntity<>(userProfile, HttpStatus.OK);
//    }
//    //REMOVE ALL USERS
//    @GetMapping("/find/all")
//    public ResponseEntity<Object> findAllUsers(@PathVariable String email) {
//        if(!isAdminAuthenticated){
//            return new ResponseEntity<>("ERROR, NOT AUTHENTICATED, USE /AUTHENTICATE ROUTE", HttpStatus.UNAUTHORIZED);
//        }
//
//        UserProfile userProfile = service.findUserByEmail(email);
//        return new ResponseEntity<>(userProfile, HttpStatus.OK);
//    }
//
//    //AUTHENTICATE AS ADMIN
//    @PostMapping("/authenticate")
//    public ResponseEntity<Object> findAllUsers(@RequestBody Admin admin) {
//        if (admin.getAdminUserName() == "admin" && admin.getAdminPassWord().equals("PASSWORD")){
//            this.isAdminAuthenticated = Boolean.TRUE;
//            return new ResponseEntity<>("AUTHENTICATED, WELCOME ADMIN", HttpStatus.OK);
//        }
//        return new ResponseEntity<>("ERROR, NOT AUTHENTICATED", HttpStatus.OK);
//    }
//}
