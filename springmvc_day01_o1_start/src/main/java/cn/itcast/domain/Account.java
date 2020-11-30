package cn.itcast.domain;

import java.io.Serializable;
import java.util.function.DoublePredicate;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 3:34 下午
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

}
