package com.htsc.dengguangming.hitlogin.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * desc:
 *
 * @author dengguangming/016852
 * @date 2020/09/01
 */
@Repository
public class LoginDao {
    static HashMap<String, String> map = new HashMap();
    static {
        map.put("xiaohong","123456");
        map.put("xiaoming","654321");
        map.put("xiaozhang","789654");
        map.put("xiaoli","125643");
    }
    public String getPassByName(String userName) {
        return map.get(userName);
    }

    public boolean register(String userName, String password) {
        if (map.containsKey(userName)){
            return false;
        }
        map.put(userName,password);
        return true;
    }
}
