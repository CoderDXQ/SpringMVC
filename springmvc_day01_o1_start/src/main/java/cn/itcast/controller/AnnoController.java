package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 8:47 下午
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了。。。");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {//这个注解代表要拿整个请求体的内容
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }

    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("执行了。。。");
        System.out.println(id);
        return "success";
    }


    @RequestMapping(value = "testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("执行了。。。");
        System.out.println(header);
        return "success";
    }

    @RequestMapping(value = "testCookieValue")//这个注解是把url路径与方法名进行映射 要求字符完全相同
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }


}
