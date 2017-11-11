package ua.sustavov.repository;

import ua.sustavov.model.User;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */

public interface UserRepository {
    User save(User user);

    User get(int id);

}
