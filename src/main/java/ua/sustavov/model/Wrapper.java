package ua.sustavov.model;

import java.io.Serializable;

/**
 * Created by ukr-sustavov
 * on 03.11.2017.
 */
public class Wrapper implements Serializable {

    private User user;
    private Wallet wallet;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wrapper() {

    }

    public Wrapper(User user, Wallet wallet) {
        this.user = user;
        this.wallet = wallet;
    }
}
