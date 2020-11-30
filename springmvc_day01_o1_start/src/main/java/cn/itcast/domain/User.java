package cn.itcast.domain;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 3:45 下午
 */
public class User implements Serializable {
    private String uname;
    private Integer age;
    private Date date;

    public String getUname() {
        return uname;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
