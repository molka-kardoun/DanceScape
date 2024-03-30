package org.sid.ebankingbackend.services;

import org.sid.ebankingbackend.models.User;
import org.sid.ebankingbackend.payload.request.EditProfileRequest;
import org.sid.ebankingbackend.payload.request.UpdatePasswordRequest;

import java.util.List;

public interface AccountService {

    List<User> listAccounts();



    User getPrincipal(String userName);

    String editProfile(String userName, EditProfileRequest editProfileRequest);

    String updatePassword(String userName, UpdatePasswordRequest updatePasswordRequest);
}
