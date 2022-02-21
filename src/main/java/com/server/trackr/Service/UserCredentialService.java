package com.server.trackr.Service;


import com.server.trackr.Entities.Credential;
import com.server.trackr.Entities.UserProfile;

public interface UserCredentialService {

    String logoutUser(UserProfile userProfile);

    String loginUser(Credential credential);

    String forgetPassword(String email);

}
