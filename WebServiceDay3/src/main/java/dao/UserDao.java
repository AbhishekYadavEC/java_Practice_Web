package dao;

import model.User;

public interface UserDao {
    public void addUser(User user);
     boolean  isValid(int id);
}
