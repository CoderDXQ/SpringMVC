package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 9:36 上午
 */

@Controller
@RequestMapping("/param") //缺省的属性就是value
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("执行了。。。");
        System.out.println("用户名：" + username + " 密码：" + password);
        return "success";
    }
}
