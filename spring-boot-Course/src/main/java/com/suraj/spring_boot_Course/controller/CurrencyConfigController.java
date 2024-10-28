package com.suraj.spring_boot_Course.controller;
import com.suraj.spring_boot_Course.CurrencyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    //instance of
    @Autowired
    private CurrencyConfiguration currencyConfiguration;

    //
    @RequestMapping("/currency-config")
    public CurrencyConfiguration getCurrencyConfiguration(){
        return currencyConfiguration;
    }
}
