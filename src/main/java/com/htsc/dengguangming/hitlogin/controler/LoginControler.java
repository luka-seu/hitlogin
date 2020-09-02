package com.htsc.dengguangming.hitlogin.controler;

import com.htsc.dengguangming.hitlogin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/09/01
 */
@Controller
@ResponseBody
public class LoginControler {

    @Autowired
    private LoginService loginService;

    @GetMapping("/loginPage")
    public ModelAndView loginHtml(ModelAndView view){
        view.setViewName("loginPage");
        return view;
    }
    @GetMapping("/registerPage")
    public ModelAndView registerHtml(ModelAndView view){
        view.setViewName("registerPage");
        return view;
    }

    @PostMapping("/login")
    public ModelAndView login(ModelAndView view,String userName,String password){
        if (loginService.login(userName,password)){
            view.setViewName("loginSucessssPage");
        }else {
            view.setViewName("loginErrorPage");
        }
        return view;
    }

    @PostMapping("/register")
    public ModelAndView register(ModelAndView view,String userName,String password){
        if (loginService.register(userName,password)){
            view.setViewName("registerSucessssPage");
        }else {
            view.setViewName("registerErrorPage");
        }
        return view;
    }

}
