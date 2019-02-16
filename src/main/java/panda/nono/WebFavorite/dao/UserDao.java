package panda.nono.WebFavorite.dao;

import java.sql.SQLException;

import panda.nono.WebFavorite.po.User;

/**
 * @author Berenice
 *	用户数据持久层接口
 */
public interface UserDao {
	public void regedit(User user) throws SQLException;
}
