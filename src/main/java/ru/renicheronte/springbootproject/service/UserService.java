package ru.renicheronte.springbootproject.service;


import ru.renicheronte.springbootproject.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void saveUser(User user);
    void removeUserById(int id);
    User showUserById(int id);
    void updateUserById(int id, User user);
}
