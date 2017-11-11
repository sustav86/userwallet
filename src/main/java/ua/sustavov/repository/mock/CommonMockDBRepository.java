package ua.sustavov.repository.mock;

import org.springframework.stereotype.Repository;
import ua.sustavov.model.User;
import ua.sustavov.model.Wallet;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CommonMockDBRepository {

    private Map<Integer, User> userRepository = new ConcurrentHashMap<>();
    private Map<Integer, Wallet> walletRepository = new ConcurrentHashMap<>();


    {

        User user1 = new User(1, "User1");
        User user2 = new User(2, "User2");
        User user3 = new User(3, "User3");

        Wallet wallet1 = new Wallet(1, "1234-1234-2345-5678", 100.8);
        Wallet wallet2 = new Wallet(1, "1234-0000-2345-9999", 199.8);
        Wallet wallet3 = new Wallet(2, "3333-4567-7899-5678", 12345.6);
        Wallet wallet4 = new Wallet(2, "1234-9876-2345-8888", 123.4);

        user1.addWallet(wallet1);
        user1.addWallet(wallet2);
        user2.addWallet(wallet3);
        user2.addWallet(wallet4);

        userRepository.put(user1.getId(), user1);
        userRepository.put(user2.getId(), user2);
        userRepository.put(user3.getId(), user3);

        walletRepository.put(user1.getId(), wallet1);
        walletRepository.put(user1.getId(), wallet2);
    }

    public User get(Integer id) {
        return userRepository.get(id);
    }

    public User update(Integer id, User user) {
        return  userRepository.put(id, user);
    }


    public Wallet getWallet(Integer id, Integer userId) {
        return walletRepository.get(userId);
    }

    public Wallet getWalletByUserId(Integer userId) {
        return walletRepository.get(userId);
    }

    public Wallet update(Wallet wallet, Integer userId) {
        return  walletRepository.put(userId, wallet);
    }
}
