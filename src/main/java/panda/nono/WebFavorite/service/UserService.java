package panda.nono.WebFavorite.service;

import java.sql.SQLException;

import panda.nono.WebFavorite.po.User;

/**
 * @author Berenice
 *	用户数据逻辑接口层
 */
public interface UserService {
	/**
	 * @param user
	 * 用户注册，传递账号，密码等信息
	 * @throws SQLException 
	 */
	public void regedit(User user) throws SQLException;
}
