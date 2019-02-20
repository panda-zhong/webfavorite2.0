package panda.nono.WebFavorite.serviceImpl.website;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.dao.WebsiteDao;
import panda.nono.WebFavorite.daoImpl.WebsiteDaoImpl;
import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.service.website.WebsiteService;

public class WebsiteServiceImpl implements WebsiteService{
	private WebsiteDao websiteDao = new WebsiteDaoImpl();
	@Override
	public List<Website> searchWeb(String keyword,String page) throws SQLException {
		// TODO Auto-generated method stub
		Website website = new Website();
		website.setName(keyword);
		if(page==null){
			page = "1";
		}
		int pageInt = Integer.parseInt(page);
		List<Website> list = this.websiteDao.getWebSiteByName(website, pageInt);
		return list;
	}

}
