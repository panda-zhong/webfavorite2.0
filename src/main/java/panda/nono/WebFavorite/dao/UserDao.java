package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.User;

/**
 * @author Berenice
 *	鐢ㄦ埛鏁版嵁鎸佷箙灞傛帴鍙�
 */
public interface UserDao {
	public void regedit(User user) throws SQLException;
	public void updatePassword(User user) throws SQLException;
	public void setState(User user) throws SQLException;
	public User getUserByName(User user) throws SQLException;
	public User getUserById(User user) throws SQLException;
	public List<User>getUserByFuns(int page) throws SQLException;
	public void updataInfo(User user) throws SQLException;
	public void setLogo(String account,String logo) throws SQLException;
//	public void updataUserP
}
