package com.server.trackr.Service;


import com.server.trackr.Entities.UserProfile;

public interface AdminControlService {
    UserProfile findUserByEmail(String email);
    UserProfile findUserByID(Integer userID);

}
