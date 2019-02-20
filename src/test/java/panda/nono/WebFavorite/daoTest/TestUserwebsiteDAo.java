package panda.nono.WebFavorite.daoTest;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.UserwebsiteDao;
import panda.nono.WebFavorite.daoImpl.UserwebsiteDaoImpl;
import panda.nono.WebFavorite.po.Userwebsite;

public class TestUserwebsiteDAo {

	UserwebsiteDao userwebsiteDao = new UserwebsiteDaoImpl();
//	@Test
	public void testAdduserWebSite() throws Exception {
		Userwebsite userwebsite = new Userwebsite();
		userwebsite.setAccount("q");
		userwebsite.setDetail("q");
		userwebsite.setLogo("1");
		userwebsite.setName("q");
		userwebsite.setUrl("q");
		this.userwebsiteDao.addUserwebsite(userwebsite);
	}
	
//	 @Test
		public void testgetUserwebsiteByAccount() throws Exception {
		 Userwebsite userwebsite = new Userwebsite();
		 userwebsite.setAccount("1");
		 List<Userwebsite> getUserwebsite = this.userwebsiteDao.getUserwebsiteByAccount(userwebsite);
			System.out.println(getUserwebsite);
		}
}
