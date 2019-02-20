package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.Websitetab;

public interface WebsitetabDao {
	public void addWebsitetab(Websitetab websitetab) throws SQLException;
	public void deleteWebsitetab(Websitetab websitetab) throws SQLException;
	public List<Websitetab> getWebsitetabByurl(Websitetab websitetab) throws SQLException;
}
