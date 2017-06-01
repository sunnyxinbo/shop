package com.changjiang.service;
import java.util.List;
import com.changjiang.dao.UserDao;
import com.changjiang.entity.User;
import com.changjiang.common.Assist;
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Override
    public long getUserRowCount(Assist assist){
        return userDao.getUserRowCount(assist);
    }
    @Override
    public List<User> selectUser(Assist assist){
        return userDao.selectUser(assist);
    }
    @Override
    public User selectUserById(Integer id){
        return userDao.selectUserById(id);
    }
    @Override
    public int insertUser(User value){
        return userDao.insertUser(value);
    }
    @Override
    public int insertNonEmptyUser(User value){
        return userDao.insertNonEmptyUser(value);
    }
    @Override
    public int deleteUserById(Integer id){
        return userDao.deleteUserById(id);
    }
    @Override
    public int deleteUser(Assist assist){
        return userDao.deleteUser(assist);
    }
    @Override
    public int updateUserById(User enti){
        return userDao.updateUserById(enti);
    }
    @Override
    public int updateUser(User value, Assist assist){
        return userDao.updateUser(value,assist);
    }
    @Override
    public int updateNonEmptyUserById(User enti){
        return userDao.updateNonEmptyUserById(enti);
    }
    @Override
    public int updateNonEmptyUser(User value, Assist assist){
        return userDao.updateNonEmptyUser(value,assist);
    }

    public UserDao getUserDao() {
        return this.userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}