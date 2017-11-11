package ua.sustavov.service;

import ua.sustavov.model.User;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */

public interface UserService {

    User get(int id);

    User update(User user);
}
