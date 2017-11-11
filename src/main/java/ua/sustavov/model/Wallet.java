package ua.sustavov.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Created by ukr-sustavov
 * on 02.11.2017.
 */
public class Wallet extends AbstractBaseEntity implements Serializable {

    @JsonIgnore
    private User user;
    private String number;
    private Double sum;


    public Wallet() {

    }

    public Wallet(int id, String number, Double sum) {
        this(id, number);
        this.sum = sum;

    }

    public Wallet(int id, String number) {
        super(id);
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "user=" + user +
                ", number=" + number +
                ", sum=" + sum +
                '}';
    }
}
