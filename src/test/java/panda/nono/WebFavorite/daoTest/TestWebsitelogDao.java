package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import panda.nono.WebFavorite.dao.WebsitelogDao;
import panda.nono.WebFavorite.daoImpl.WebsitelogDaoImpl;
import panda.nono.WebFavorite.po.Websitelog;

public class TestWebsitelogDao {
	WebsitelogDao websitelogDao = new WebsitelogDaoImpl();
	
	@Test
	public void testAddWebsitelog() throws Exception {
		Websitelog websitelog = new Websitelog();
		websitelog.setAccount("22");
		websitelog.setUrl("2");
		this.websitelogDao.addWebsitelog(websitelog);
	}
	
}
