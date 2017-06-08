package com.changjiang.service;
import java.util.List;
import com.changjiang.dao.UsersDao;
import com.changjiang.entity.Users;
import com.changjiang.common.Assist;
public class UsersServiceImpl implements UsersService{
    private UsersDao usersDao;
    @Override
    public long getUsersRowCount(Assist assist){
        return usersDao.getUsersRowCount(assist);
    }
    @Override
    public List<Users> selectUsers(Assist assist){
        return usersDao.selectUsers(assist);
    }
    @Override
    public Users selectUsersById(Integer id){
        return usersDao.selectUsersById(id);
    }
    @Override
    public int insertUsers(Users value){
        return usersDao.insertUsers(value);
    }
    @Override
    public int insertNonEmptyUsers(Users value){
        return usersDao.insertNonEmptyUsers(value);
    }
    @Override
    public int deleteUsersById(Integer id){
        return usersDao.deleteUsersById(id);
    }
    @Override
    public int deleteUsers(Assist assist){
        return usersDao.deleteUsers(assist);
    }
    @Override
    public int updateUsersById(Users enti){
        return usersDao.updateUsersById(enti);
    }
    @Override
    public int updateUsers(Users value, Assist assist){
        return usersDao.updateUsers(value,assist);
    }
    @Override
    public int updateNonEmptyUsersById(Users enti){
        return usersDao.updateNonEmptyUsersById(enti);
    }
    @Override
    public int updateNonEmptyUsers(Users value, Assist assist){
        return usersDao.updateNonEmptyUsers(value,assist);
    }

    public UsersDao getUsersDao() {
        return this.usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

}