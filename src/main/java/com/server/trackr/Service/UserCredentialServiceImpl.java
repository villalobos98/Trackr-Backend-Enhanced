package com.server.trackr.Service;

import com.server.trackr.Entities.Credential;
import com.server.trackr.Entities.UserProfile;
import com.server.trackr.Repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialServiceImpl implements UserCredentialService {

    @Autowired
    UserProfileRepository repo;

    @Override
    public String logoutUser(UserProfile userProfile) {
        Integer userID = userProfile.getUserID();
        UserProfile existingUserProfile = repo.findById(userID).get();
        existingUserProfile.setStatus(false);
        repo.save(userProfile);
        return "USER LOGGED OUT";
    }

    @Override
    public String loginUser(Credential credential) {
        return null;
    }

    @Override
    public String forgetPassword(String email) {
        return null;
    }

}
