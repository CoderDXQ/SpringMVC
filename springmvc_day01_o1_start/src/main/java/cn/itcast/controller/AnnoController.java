package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/30 8:47 下午
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"msg"})//把msg=美美存入到session域中
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


    /**
     * ModelAttribute注解
     *
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "success";
    }

    //加注解后会先执行 这个方法会先于上面的方法执行 因为这个方法没有返回值 所以在上面的方法中需要使用注解@ModelAttribute("abc")，从map中找键为abc的键值对赋值给user
    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("showUser执行了...");
        // 通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }

    //加注解后会先执行 这个方法有返回值，返回给testModelAttribute()方法
//    @ModelAttribute
//    public User showUser(String uname) {
//        System.out.println("showUser执行了...");
//        // 通过用户查询数据库（模拟）
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

    /**
     * SessionAttributes的注解
     *
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes...");
        // 底层会存储到request域对象中
        model.addAttribute("msg", "美美");
        return "success";
    }

    /**
     * 获取值
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {//ModelMap是Model接口的实现类
        System.out.println("getSessionAttributes...");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 清除
     *
     * @param status
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("getSessionAttributes...");
        status.setComplete();
        return "success";
    }


}
