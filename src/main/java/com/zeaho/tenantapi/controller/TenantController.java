package com.zeaho.tenantapi.controller;

import com.zeaho.base.jsonmodel.GcbJsonCode;
import com.zeaho.base.jsonmodel.GcbJsonModel;
import com.zeaho.base.model.tenant.Tenant;
import com.zeaho.base.model.tenant.TenantRepo;
import com.zeaho.tenant.form.TenantForm;
import com.zeaho.tenantapi.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.sql.Timestamp;

/**
 * Created by xht on 2017/2/5.
 */
@RestController
@RequestMapping(Index.PRE_PATH + "/tenant")
public class TenantController {

    @Autowired
    private TenantRepo tenantRepo;

    @RequestMapping(method = RequestMethod.POST)
    public GcbJsonModel add(@Valid TenantForm tenantForm, Tenant tenant, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new GcbJsonModel(null, GcbJsonCode.INVALID_FORM_DATA);
        }

        tenant.setAddTime(new Timestamp(System.currentTimeMillis()));
        tenant.setModifyTime(tenant.getAddTime());
        try {
            tenant = tenantRepo.save(tenant);

        } catch (Exception e) {
            return new GcbJsonModel(null, GcbJsonCode.INVALID_FORM_DATA, "save to db error");
        }

        return new GcbJsonModel(tenant);
    }
}
