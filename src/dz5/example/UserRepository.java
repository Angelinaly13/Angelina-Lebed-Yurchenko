package dz5.example;

public record User(String firstName, String lastName) {}

package org.example;

public interface UserRepository {
    User getUserByMsisdn(String msisdn);

    void saveOrUpdateUser(String msisdn, User user);
}