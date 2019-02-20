package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.WebsiteDao;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.daoImpl.WebsiteDaoImpl;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userwebsite;
import panda.nono.WebFavorite.po.Website;

public class TestwebSiteDao {
	WebsiteDao websiteDao = new WebsiteDaoImpl();
	
//	@Test
	public void testAddwebsite() throws Exception {
		for (int i = 3; i < 100; i++) {
		websiteDao  = new WebsiteDaoImpl();
		Website website = new Website();
		website.setAccount("1");
		website.setBad("1");
		website.setClick("11");
		website.setGood("2");
		website.setKind("3");
		website.setLogo("2");
		website.setName("2");
		website.setReadwebsite("2");
		website.setUrl("3");
		this.websiteDao.addwebsite(website);
		}
	}
//	@Test
	public void testgetWebsiteByTime() throws Exception {
		int page = 1;
		List<Website> list = this.websiteDao.getWebsiteByTime(page);
		for (Website website : list) {
			System.out.println(website);
		}
	}
}
