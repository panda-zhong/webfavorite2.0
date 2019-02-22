package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.dao.UserlikeuserDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userlikeuser;
import panda.nono.WebFavorite.po.Userwebsite;
import panda.nono.WebFavorite.util.JDBCUtil;
/**
 * @author Berenice
 *	
 */
public  class UserlikeuserDaoImpl implements UserlikeuserDao{
	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	public void focususers(Userlikeuser userlikeuser) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String funsAccount = userlikeuser.getFunsAccount();
		String idolAccount = userlikeuser.getIdolAccount();
		sql = "INSERT INTO userlikeuser(funsAccount,idolAccount) VALUES(?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, funsAccount);
		preparedStatement.setString(2, idolAccount);
		preparedStatement.execute();
		JDBCUtil.close(connect);	
	}
	@Override
	public void cancelfocus(Userlikeuser userlikeuser) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String FunsAccount = userlikeuser.getFunsAccount();
		String idolAccount = userlikeuser.getIdolAccount();
		sql = "DELETE FROM Userlikeuser WHERE FunsAccount = ? and idolAccount = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, FunsAccount);
		preparedStatement.setString(2, idolAccount);
		preparedStatement.execute();
		JDBCUtil.close(connect);	
	}
	@Override
	public List<User> getUserlikeuserByAccount(Userlikeuser userlikeuser) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String idolAccount = userlikeuser.getIdolAccount();
		sql = "SELECT  userlikeuser.funsAccount,`user`.email,"
				+ "`user`.logo, `user`.regeditTime, `user`.state, `user`.introduction,"
				+ "`user`.`name`, `user`.funsSize FROM userlikeuser LEFT  JOIN `user` "
				+ "ON userlikeuser.funsAccount = `user`.account WHERE idolAccount = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, idolAccount);
		ResultSet userSet = preparedStatement.executeQuery();
		List<User> userList = new ArrayList<User>();
		while(userSet.next()){
			String funsAccount = userSet.getString("funsAccount");
			String email = userSet.getString("email");
			String logo = userSet.getString("logo");
			String regeditTime = userSet.getString("regeditTime");
			String state = userSet.getString("state");
			String introduction = userSet.getString("introduction");
			String name = userSet.getString("name");
			String funsSize = userSet.getString("funsSize");
			User user = new User();
			user.setAccount(funsAccount);
			user.setName(name);
			user.setState(state);
			user.setRegeditTime(regeditTime);
			user.setPassword(funsSize);
			user.setLogo(logo);
			user.setIntroduction(introduction);
			user.setEmail(email);
			user.setFunsSize(funsSize);
			userList.add(user);
		}
		JDBCUtil.close(connect);
		return userList;
	}
	@Override
	public List<User> getUserByAccount(Userlikeuser userlikeuser) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String funsAccount = userlikeuser.getFunsAccount();
		sql = "SELECT  userlikeuser.idolAccount,`user`.email,"
				+ "`user`.logo, `user`.regeditTime, `user`.state, `user`.introduction,"
				+ "`user`.`name`, `user`.funsSize FROM userlikeuser LEFT  JOIN `user` "
				+ "ON userlikeuser.funsAccount = `user`.account WHERE funsAccount = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, funsAccount);
		ResultSet userSet = preparedStatement.executeQuery();
		List<User> userList = new ArrayList<User>();
		while(userSet.next()){
			String idolAccount = userSet.getString("idolAccount");
			String email = userSet.getString("email");
			String logo = userSet.getString("logo");
			String regeditTime = userSet.getString("regeditTime");
			String state = userSet.getString("state");
			String introduction = userSet.getString("introduction");
			String name = userSet.getString("name");
			String funsSize = userSet.getString("funsSize");
			User user = new User();
			user.setAccount(idolAccount);
			user.setName(name);
			user.setState(state);
			user.setRegeditTime(regeditTime);
			user.setPassword(funsSize);
			user.setLogo(logo);
			user.setIntroduction(introduction);
			user.setEmail(email);
			user.setFunsSize(funsSize);
			userList.add(user);
		}
		JDBCUtil.close(connect);
		return userList;
	}		 
	@Override
	public String getIdolsize(Userlikeuser userlikeuser) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String funsAccount = userlikeuser.getFunsAccount();
		sql = "SELECT count(1)as size from userlikeuser WHERE funsAccount = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, funsAccount);
		ResultSet resultSet = preparedStatement.executeQuery();
		String size="0"; 
		while(resultSet.next()){
			size = resultSet.getString("size");
		}
		JDBCUtil.close(connect);
		return size;
	}

}
