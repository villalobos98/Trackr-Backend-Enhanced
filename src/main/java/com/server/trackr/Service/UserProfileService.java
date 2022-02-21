package com.server.trackr.Service;


import com.server.trackr.Entities.UserProfile;

public interface UserProfileService {
    String deleteProfile(UserProfile userProfile);

    String saveProfile(UserProfile userProfile);

    String updateProfile(UserProfile userProfile);
}
