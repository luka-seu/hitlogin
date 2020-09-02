package com.htsc.dengguangming.hitlogin.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/09/01
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public String index() {
        return "welcomePage";
    }

    @RequestMapping("/loginNow")
    public String LoginNow() {
        return "loginPage";
    }
    @RequestMapping("/registerNow")
    public String registerNow() {
        return "registerPage";
    }

}
