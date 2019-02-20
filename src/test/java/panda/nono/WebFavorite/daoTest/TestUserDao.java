package panda.nono.WebFavorite.daoTest;


import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.util.Encryption;

/**
 * @author Berenice 娴嬭瘯鐢ㄦ埛鏁版嵁鎸佷箙灞�
 */
public class TestUserDao {
	UserDao userDao = new UserDaoImpl();
//	 @Test
	public void testRegedit() throws Exception {
		for (int i = 10; i < 100; i++) {
			userDao = new UserDaoImpl();
			User user = new User();
			user.setAccount(i+"");
			user.setPassword("1");
			user.setEmail("1324@qq.com");
			user.setName("aa");
			this.userDao.regedit(user);
		}
	}

//	@Test
	public void testLogin() throws Exception {
		User user = new User();
		user.setAccount("32332233");
		user.setPassword("1");
		User loginUser = this.userDao.login(user);
		System.out.println(loginUser);
	}

	 @Test
	public void testupdatepassword() throws Exception {
		User user = new User();
		user.setEmail("287595523@qq.com");
		user.setPassword("admin");
		Encryption.encryptPasswd(user);
		this.userDao.updatePassword(user);
	}

//	 @Test
	public void testupstate() throws Exception {
		User user = new User();
		user.setAccount("32332233");
		user.setState("0");
		this.userDao.setState(user);
	}

//	 @Test
	public void testgetuser() throws Exception {
		User user = new User();
//		user.setName("aa");
		user.setAccount("admin");
//		User getUser = this.userDao.getUserByName(user);
		User getUser = this.userDao.getUserById(user);
		System.out.println(getUser);
	}
	
//	@Test
	public void testgetUserByFuns() throws Exception {
		int page = 1;
		List<User> list = this.userDao.getUserByFuns(page);
		for (User user : list) {
			System.out.println(user);
		}
	}
}
