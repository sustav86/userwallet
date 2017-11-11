package ua.sustavov.service;

import ua.sustavov.model.Wallet;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */
public interface WalletService {
    Wallet get(int id, int userId);

    Wallet update(int id, int userId);

    Wallet update(Wallet wallet, int userId);

    Wallet getByUserId(int userId);
}
