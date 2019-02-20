package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.util.JDBCUtil;

/**
 * @author Berenice
 *	
 */
public class UserDaoImpl implements UserDao{
	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	public void regedit(User user) throws SQLException {
		// TODO Auto-generated method stub
		String account = user.getAccount();
		String password = user.getPassword();
		String email = user.getEmail();
		String name = user.getName();
		String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		sql = "INSERT INTO user(account,password,email,name,regeditTime) VALUES(?,?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, name);
		preparedStatement.setDate(5, mysqldate);
		preparedStatement.execute();
		JDBCUtil.close(connect);
	}
	
	public User login(User user) throws SQLException {
		// TODO Auto-generated method stub
		String account = user.getAccount();
		String password = user.getPassword();
		sql = "SELECT name,account,password,logo,regeditTime,state,introduction,email from user where account = ? and `password` = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		User resultUser = new User();
		while(resultSet.next()){
			String userAccount = resultSet.getString("account");
			String userPassword = resultSet.getString("password");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userRegeditTime = resultSet.getString("regeditTime");
			String userState = resultSet.getString("state");
			String userIntroduction= resultSet.getString("introduction");
			String userEmail= resultSet.getString("email");
			resultUser.setAccount(userAccount);
			resultUser.setPassword(userPassword);
			resultUser.setName(userName);
			resultUser.setLogo(userLogo);
			resultUser.setRegeditTime(userRegeditTime);
			resultUser.setState(userState);
			resultUser.setIntroduction(userIntroduction);
			resultUser.setEmail(userEmail);
		}
		JDBCUtil.close(connect);
		return resultUser;
	}

	@Override
	public void updatePassword(User user) throws SQLException {
		// TODO Auto-generated method stub
		String email = user.getEmail();
		String password = user.getPassword();
		String salt = user.getSalt();
		sql = "UPDATE user SET password=? , salt = ? WHERE email=? ";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, password);
		preparedStatement.setString(2,salt);
		preparedStatement.setString(3,email);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect); 
	}

	@Override
	public void setState(User user) throws SQLException {
		// TODO Auto-generated method stub
		String account = user.getAccount();
		String stade = user.getState();
		sql = "UPDATE user SET state=? WHERE account=?; ";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, stade);
		preparedStatement.setString(2, account);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect); 
	}

	@Override
	public User getUserByName(User user) throws SQLException {
		// TODO Auto-generated method stub
		String name = user.getName();
		sql = "SELECT name,account,password,logo,regeditTime,state,introduction,email FROM user where name = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		User resultUser = new User();
		while(resultSet.next()){
			String userAccount = resultSet.getString("account");
			String userPassword = resultSet.getString("password");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userRegeditTime = resultSet.getString("regeditTime");
			String userState = resultSet.getString("state");
			String userIntroduction= resultSet.getString("introduction");
			String userEmail= resultSet.getString("email");
			resultUser.setAccount(userAccount);
			resultUser.setPassword(userPassword);
			resultUser.setName(userName);
			resultUser.setLogo(userLogo);
			resultUser.setRegeditTime(userRegeditTime);
			resultUser.setState(userState);
			resultUser.setIntroduction(userIntroduction);
			resultUser.setEmail(userEmail);
		}
		JDBCUtil.close(connect);
		return resultUser;
	}
	
	@Override
	public User getUserById(User user) throws SQLException {
		// TODO Auto-generated method stub
		String id = user.getAccount();
		sql = "SELECT salt, name,account,password,logo,regeditTime,state,introduction,email FROM user where account = ? and state = 1";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		User resultUser = new User();
		while(resultSet.next()){
			String userAccount = resultSet.getString("account");
			String userPassword = resultSet.getString("password");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userRegeditTime = resultSet.getString("regeditTime");
			String userState = resultSet.getString("state");
			String userIntroduction= resultSet.getString("introduction");
			String userEmail= resultSet.getString("email");
			String salt = resultSet.getString("salt");
			resultUser.setAccount(userAccount);
			resultUser.setPassword(userPassword);
			resultUser.setName(userName);
			resultUser.setLogo(userLogo);
			resultUser.setRegeditTime(userRegeditTime);
			resultUser.setState(userState);
			resultUser.setIntroduction(userIntroduction);
			resultUser.setEmail(userEmail);
			resultUser.setSalt(salt);
		}
		JDBCUtil.close(connect);
		return resultUser;
	}

	@Override
	public List<User> getUserByFuns(int page) throws SQLException {
		// TODO Auto-generated method stub
		sql = "SELECT `user`.account, `user`.email, `user`.logo,"
				+ " `user`.regeditTime, `user`.state, `user`.introduction, `user`.`name`,"
				+ " `user`.funsSize FROM `user` where state = 1 ORDER BY `user`.funsSize DESC LIMIT ?,?";
		int sizeOfPage = Common.SIZEOFPAGE;
		int begin = sizeOfPage*(page-1);
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setInt(1, begin);
		preparedStatement.setInt(2, sizeOfPage);
		ResultSet userSet = preparedStatement.executeQuery();
		List<User> userList = new ArrayList<User>();
		while(userSet.next()){
			String account = userSet.getString("account");
			String email = userSet.getString("email");
			String logo = userSet.getString("logo");
			String regeditTime = userSet.getString("regeditTime");
			String introduction = userSet.getString("introduction");
			String name = userSet.getString("name");
			String funsSize = userSet.getString("funsSize");
			User user = new User(account, logo, email, regeditTime, introduction, name);
			user.setFunsSize(funsSize);
			userList.add(user);
		}
		return userList;
	}
	
}
