package com.server.trackr.Repository;

import com.server.trackr.Entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<UserProfile, Integer> {
    @Query(value = "Select * FROM USER_PROFILE u where u.email = ?1", nativeQuery = true)
    UserProfile findUserByEmail(String email);

    @Query(value = "SELECT u FROM USER_PROFILE u where u.userID = ?1", nativeQuery = true)
    UserProfile findUserByID(Integer userID);

    @Query(value = "SELECT status FROM USER_PROFILE u where u.status = ?1", nativeQuery = true)
    UserProfile findUserByStatus(Boolean status);

    @Query(value = "SELECT u FROM USER_PROFILE u WHERE u.status = ?1 and u.first_name = ?2", nativeQuery = true)
    UserProfile findUserByStatusAndName(Integer status, String first_name);

}
