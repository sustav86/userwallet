package ua.sustavov.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */

public class User extends AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = -7788619177798333712L;

    private String name;

    private List<Wallet> wallets = new ArrayList<>();

    public User() {
    }

    public User(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", wallets=" + wallets +
                '}';
    }
}
