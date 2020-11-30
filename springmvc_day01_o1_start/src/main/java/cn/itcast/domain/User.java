package cn.itcast.domain;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.Serializable;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 3:45 下午
 */
public class User implements Serializable {
    private String uname;
    private Integer age;

    public String getUname() {
        return uname;
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

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
