package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.util.JDBCUtil;

/**
 * @author Berenice
 *	用户数据持久实现层
 */
public class UserDaoImpl implements UserDao{
	Connection conn = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	public void regedit(User user) throws SQLException {
		// TODO Auto-generated method stub
		String account = user.getAccount();
		String password = user.getPassword();
		sql = "INSERT INTO user(account,password) VALUES(?,?)";
		preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, password);
		preparedStatement.execute();
		JDBCUtil.close(conn);
	}

}
