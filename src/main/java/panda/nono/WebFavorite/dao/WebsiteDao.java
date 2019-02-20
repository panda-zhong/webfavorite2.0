package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Website;

public interface WebsiteDao {
	public void addwebsite(Website website) throws SQLException;
	public void updateWebsiteState(Website website) throws SQLException;
	public List<Website>getWebsiteByTime(int page) throws SQLException;
	public  List<Website>getWebsiteByLike(int page) throws SQLException;
	public String getWebsize(Website website) throws SQLException;
	public List<Website>getWebmesageByaccount() throws SQLException;
	public List<Website> getWebSiteByName(Website website,int page) throws SQLException;
}
