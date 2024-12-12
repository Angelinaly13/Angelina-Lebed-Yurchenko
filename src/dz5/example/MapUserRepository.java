package dz5.example;

import java.util.concurrent.ConcurrentHashMap;

public class MapUserRepository implements UserRepository {
    private final ConcurrentHashMap<String, User> userStorage = new ConcurrentHashMap<>();

    @Override
    public User getUserByMsisdn(String msisdn) {
        return userStorage.get(msisdn);
    }

    @Override
    public void saveOrUpdateUser(String msisdn, User user) {
        userStorage.put(msisdn, user);
    }
}