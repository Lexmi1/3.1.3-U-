package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUser(int id);

    User getUserByLogin(String username);

    void save(User user);

    void updateUser(User user);

    void delete(int id);
}
