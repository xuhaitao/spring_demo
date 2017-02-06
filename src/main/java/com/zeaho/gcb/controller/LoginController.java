package com.zeaho.gcb.controller;

import com.zeaho.gcb.element.form.AccountForm;
import com.zeaho.base.model.tenant.Tenant;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XHT on 2017/1/26.
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/login/{userID}", method = RequestMethod.GET)
    public Tenant getCount(@PathVariable int userID) {
        Tenant count = new Tenant();
        count.setAlias("zeaho@com");
        count.setName("xht");
        count.setId(userID);
        return count;
    }

    @RequestMapping(value = "/login/{userID}/{size}", method = RequestMethod.GET)
    public List<Tenant> getCounts(@PathVariable int size, @PathVariable int userID) {
        List<Tenant> counts = new ArrayList<>();

        Tenant dC = new Tenant();
        dC.setAlias("dzeaho@com");
        dC.setName("dxht");
        dC.setId(userID);
        counts.add(dC);

        for (int i = 0; i < size; i++) {
            Tenant count = new Tenant();
            count.setAlias("zeaho@com");
            count.setName("xht");
            count.setId(i);
            counts.add(count);
        }

        return counts;
    }

    @RequestMapping("/form")
    public String showForm(AccountForm accountForm) {

        return "form";
    }
}
