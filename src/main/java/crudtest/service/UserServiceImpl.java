package crudtest.service;

import crudtest.dao.UserDao;
import crudtest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void removeUser(long id) {
        this.userDao.removeUser(id);
    }

    @Override
    public User getUserById(long id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> listUsers(int page) {
        return this.userDao.listUsers(page);
    }

    @Override
    public List<User> findUser(String name) {
        return this.userDao.findUser(name);
    }
}
