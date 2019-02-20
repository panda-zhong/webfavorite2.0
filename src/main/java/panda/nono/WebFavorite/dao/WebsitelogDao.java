package panda.nono.WebFavorite.dao;

import java.sql.SQLException;

import panda.nono.WebFavorite.po.Websitelog;

public interface WebsitelogDao {
	public void addWebsitelog(Websitelog websitelog) throws SQLException;
	
}
