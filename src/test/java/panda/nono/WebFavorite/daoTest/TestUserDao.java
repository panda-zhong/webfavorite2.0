package panda.nono.WebFavorite.daoTest;

import org.junit.Test;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.po.User;

/**
 * @author Berenice
 *测试用户数据持久层
 */
public class TestUserDao {
	UserDao userDao = new UserDaoImpl();
	
	@Test
	public void testRegedit() throws Exception {
		User user = new User();
		user.setAccount("32332233");
		user.setPassword("1");
		this.userDao.regedit(user);
	}	
}
