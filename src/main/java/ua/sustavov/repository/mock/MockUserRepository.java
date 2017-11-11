package ua.sustavov.repository.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.sustavov.model.User;
import ua.sustavov.repository.UserRepository;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */
@Repository
public class MockUserRepository implements UserRepository {

    @Autowired
    CommonMockDBRepository commonMockDBRepository;

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public User save(User user) {
        if (user.isNew()) {
            user.setId(counter.incrementAndGet());
        }
        return commonMockDBRepository.update(user.getId(), user);
    }

    @Override
    public User get(int id) {
        return commonMockDBRepository.get(id);
    }
}
