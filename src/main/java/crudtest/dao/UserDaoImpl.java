package crudtest.dao;


import crudtest.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    private static final int limitPage = 10;

    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void removeUser(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id);
        if (user != null) session.delete(user);
    }

    @Override
    public User getUserById(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, id);
        return user;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers(int page) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("from crudtest.model.User ");
        query.setFirstResult((int)(page - 1) * limitPage);
        query.setMaxResults(limitPage);
        List<User> users = query.list();
        return users;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findUser(String name) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM User E WHERE E.name = name");
        List<User> users = query.list();
        return users;
    }

}
