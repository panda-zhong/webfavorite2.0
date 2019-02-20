package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.dao.UserlikeuserDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.daoImpl.UserlikeuserDaoImpl;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userlikeuser;
import panda.nono.WebFavorite.po.Userwebsite;

public class TestUserlikeuserDao {
	
	UserlikeuserDao userlikeuserDao = new UserlikeuserDaoImpl();
//	@Test
	public void testfocususers() throws Exception {
		Userlikeuser userlikeuser = new Userlikeuser();
		userlikeuser.setFunsAccount("111");
		userlikeuser.setIdolAccount("11111");
		this.userlikeuserDao.focususers(userlikeuser);
	}
//	 @Test
		public void testgetUserlikeuserByAccount() throws Exception {
		 Userlikeuser userlikeuser = new Userlikeuser();
		 userlikeuser.setIdolAccount("aa");
		 List<User> getUserlikeuser = this.userlikeuserDao.getUserlikeuserByAccount(userlikeuser);
			System.out.println(getUserlikeuser);
		}
}
