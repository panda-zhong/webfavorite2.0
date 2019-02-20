package panda.nono.WebFavorite.service.website;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.Website;

/**
 * @author Berenice
 *
 */
public interface WebsiteService {
	public List<Website> searchWeb(String keyword,String page) throws SQLException;
}	
