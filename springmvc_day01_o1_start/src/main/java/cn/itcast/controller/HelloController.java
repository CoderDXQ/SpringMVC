package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/11/29 9:28 下午
 */

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello StringMVC");
        //返回success页面 页面在webapp/WEB-INF/pages
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping", params = {"username=hehe"}, headers = {"Accept"})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解。。。");
        return "success";
    }

    //获得原生API
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了。。。");
        System.out.println(request.toString());
        System.out.println(response.toString());

        HttpSession session = request.getSession();
        System.out.println(session.toString());

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext.toString());

        return "success";
    }
}
