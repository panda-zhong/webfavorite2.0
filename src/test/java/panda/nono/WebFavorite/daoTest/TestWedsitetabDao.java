package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.WebsitetabDao;
import panda.nono.WebFavorite.daoImpl.WebsitetabDaoImpl;
import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.po.Websitetab;

public class TestWedsitetabDao {
	
	WebsitetabDao wedsitetabDao = new WebsitetabDaoImpl();
//	@Test
	public void testaddWebsitetab() throws Exception {
		Websitetab websitetab = new Websitetab();
		websitetab.setTab("22");
		websitetab.setUrl("2");
		this.wedsitetabDao.addWebsitetab(websitetab);
	}
//	@Test
	public void testDeleteWebsitetab() throws Exception {
		Websitetab websitetab = new Websitetab();
		websitetab.setTab("22");
		websitetab.setUrl("2");
		this.wedsitetabDao.deleteWebsitetab(websitetab);
	}
	@Test
	public void testgetWebsitetabByurl() throws Exception {
		Websitetab websitetab = new Websitetab();
		websitetab.setUrl("2");
		List<Websitetab> list =  this.wedsitetabDao.getWebsitetabByurl(websitetab);
		for (Websitetab websitetab2 : list) {
			System.out.println(websitetab2);
		}
	}
	
}
