package com.kenzie.interfaces;

public interface Customer {


    void createProfile (String userID);
    void updateProfile (String userId);
    void login (String userID, String password);

}
