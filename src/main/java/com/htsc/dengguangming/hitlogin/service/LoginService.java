package com.htsc.dengguangming.hitlogin.service;

import com.htsc.dengguangming.hitlogin.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/09/01
 */
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public boolean login(String userName, String password) {
        if (password.equals(loginDao.getPassByName(userName))){
            return true;
        }
        return false;
    }
    public boolean register(String userName,String password){
        return loginDao.register(userName,password);
    }
}
