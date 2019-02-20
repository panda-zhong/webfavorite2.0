package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import panda.nono.WebFavorite.dao.AdminDao;
import panda.nono.WebFavorite.daoImpl.AdminDaoImpl;
import panda.nono.WebFavorite.po.Admin;
import panda.nono.WebFavorite.po.User;

public class TestAdminDao {
	AdminDao adminDao = new AdminDaoImpl();
//	@Test
	public void testCheckAdmin() throws Exception {
		Admin admin = new Admin();
		admin.setAccount("1");
		admin.setPassword("11");
		Admin admin1 = this.adminDao.checkAdmin(admin);
		System.out.println(admin1);
	}
//	@Test
	public void testaddAdmin() throws Exception {
		Admin admin = new Admin();
		admin.setAccount("12");
		admin.setEmail("11");
		admin.setLogo("1");
		admin.setName("11");
		admin.setPassword("12");
		admin.setState("1");
		this.adminDao.addAdmin(admin);
	}
	@Test
	public void testSetstate() throws Exception {
		Admin admin = new Admin();
		admin.setAccount("1");
		admin.setState("0");
		this.adminDao.setState(admin);
	}
}
