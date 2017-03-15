package crudtest.service;

import crudtest.model.User;

import java.util.List;


public interface UserService {
    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(long id);

    public User getUserById(long id);

    public List<User> listUsers(int page);

    public List<User> findUser(String name);


}
