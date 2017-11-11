package ua.sustavov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.sustavov.model.Wallet;
import ua.sustavov.repository.WalletRepository;


/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletRepository repository;

    @Autowired
    public WalletServiceImpl(WalletRepository repository) {
        this.repository = repository;
    }

    @Override
    public Wallet get(int id, int userId) {
        return repository.get(id, userId);
    }

    @Override
    public Wallet update(int id, int userId) {
        return null;
    }

    @Override
    public Wallet getByUserId(int userId) {
        return repository.getByUserId(userId);
    }

    @Override
    public Wallet update(Wallet wallet, int userId) {
        return repository.save(wallet, userId);
    }
}
