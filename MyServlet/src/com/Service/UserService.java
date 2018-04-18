package com.Service;

import com.Bean.User;
import com.Dao.UserDaoImp;

public class UserService {
    public UserService(){
      super();
    }
    public boolean login(String name,String pass){
        UserDaoImp dao = new UserDaoImp();
        User user = dao.getUser(name);
        if(user.getPassworld()!=null&&user.getPassworld().equals(pass)){
            return true;
        }
        return false;
    }
}
