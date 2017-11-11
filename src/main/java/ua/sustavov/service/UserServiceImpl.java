package ua.sustavov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sustavov.model.User;
import ua.sustavov.repository.UserRepository;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User get(int id) {
        return repository.get(id);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }
}
