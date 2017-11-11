package ua.sustavov.repository;

import ua.sustavov.model.Wallet;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */
public interface WalletRepository {
    Wallet save(Wallet wallet, int userId);

    Wallet get(int id, int userId);

    Wallet getByUserId(int userId);

}
