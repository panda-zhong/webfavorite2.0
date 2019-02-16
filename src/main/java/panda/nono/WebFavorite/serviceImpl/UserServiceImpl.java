package panda.nono.WebFavorite.serviceImpl;

import java.sql.SQLException;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.service.UserService;

/**
 * @author Berenice
 *	用户数据逻辑层实现层
 */
public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	public void regedit(User user) throws SQLException {
		// TODO Auto-generated method stub
		this.userDao.regedit(user);
	}

}
