package com.zeaho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by XHT on 2017/1/26.
 */
@RestController
@RequestMapping(value = "/hello", headers = "a=b")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    String hello(HttpServletRequest request) {

        HttpSession session = request.getSession();

        Integer c = (Integer) session.getAttribute("count");

        if (c == null) {
            c = 1;
        } else {

            c += 1;
        }

        session.setAttribute("count", c);

        return c.toString() +  "  b";
    }
}
