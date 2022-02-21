package com.server.trackr.Service;

import com.server.trackr.Entities.UserProfile;
import com.server.trackr.Repository.AdminRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class AdminServiceImpl implements AdminControlService{
    @Autowired
    AdminRepository repo;

    @Override
    public UserProfile findUserByEmail(String email) {
        UserProfile userProfile = repo.findUserByEmail(email);
        return userProfile;
    }

    @Override
    public UserProfile findUserByID(Integer userID) {
        UserProfile userProfile = repo.findUserByID(userID);
        return userProfile;
    }
}
