package com.zeaho.gcb.controller;

import com.zeaho.gcb.element.form.AccountForm;
import com.zeaho.base.model.tenant.Tenant;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by XHT on 2017/1/29.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    //    @RequestMapping(method = RequestMethod.GET)
//    public String get(@CookieValue("a-cookie") String cookie) {
//        return cookie;
//    }
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "get";
    }
//
//    @RequestMapping(path = "/new", method = RequestMethod.GET)
//    public AccountForm getNewForm(@RequestParam("a") int a, HttpServletResponse response) {
//        response.addCookie(new Cookie("a-cookie", "tenant"));
//        AccountForm accountForm = new AccountForm();
//        accountForm.setAge(a);
//        return accountForm;
//    }

    @RequestMapping(method = RequestMethod.POST)
    public String add(@Valid AccountForm accountForm, Tenant account, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form error:" + bindingResult.getFieldError().toString();
        }

        return account == null ? "tenant null" : account.getName() + account.getAlias();
    }
}
