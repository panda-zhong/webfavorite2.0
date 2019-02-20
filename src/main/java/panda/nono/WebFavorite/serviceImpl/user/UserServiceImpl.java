package panda.nono.WebFavorite.serviceImpl.user;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.service.user.UserService;
import panda.nono.WebFavorite.util.Encryption;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User check(String account, String password) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAccount(account);
		user = this.userDao.getUserById(user);
		String databasePassword = user.getPassword();
		user.setPassword(password);
		if(!Encryption.checkPassword(user, databasePassword)){
			return null;
		}else{
			return user;
		}
	}
	@Override
	public void regedit(String account, String password, String name, String email) throws SQLException {
		// TODO Auto-generated method stub
		String logo = Common.USERLOGO;
		User user = new User(account, password, logo, email, name);
		this.userDao.regedit(user);
	}
	

}
