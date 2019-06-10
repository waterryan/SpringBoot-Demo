package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Transactional
    public User getById(Integer id) {
        Optional<User> op = userRepository.findById(id);
        return op.get();
    }

    @Transactional
    public void update(User user) {
        user.setUsername("testA");
        user.setLoginname("testa");
    }
}
