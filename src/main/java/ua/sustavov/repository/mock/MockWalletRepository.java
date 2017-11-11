package ua.sustavov.repository.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.sustavov.model.Wallet;
import ua.sustavov.repository.WalletRepository;


/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */

@Repository
public class MockWalletRepository implements WalletRepository {

    @Autowired
    CommonMockDBRepository commonMockDBRepository;

    @Override
    public Wallet save(Wallet wallet, int userId) {
        return commonMockDBRepository.update(wallet, userId);
    }

    @Override
    public Wallet get(int id, int userId) {
        return commonMockDBRepository.getWallet(id, userId);
    }

    @Override
    public Wallet getByUserId(int userId) {
        return commonMockDBRepository.getWalletByUserId(userId);
    }
}
