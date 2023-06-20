package service;

import dao.UserDao;
import model.User;

public class UserService {
    UserDao userDao;
    public void addUser(User user)
    {
        userDao.addUser(user);
    }
    public boolean isValid(int id)
    {
        return userDao.isValid(id);
    }
}
