package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
    private Date date;//分隔符是/

    //增加集合类型
    private List<User> list;
    private Map<String, User> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", user=" + user +
                ", date=" + date +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
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
