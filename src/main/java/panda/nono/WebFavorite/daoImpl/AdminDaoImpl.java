package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import panda.nono.WebFavorite.dao.AdminDao;
import panda.nono.WebFavorite.po.Admin;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.util.JDBCUtil;

public class AdminDaoImpl implements AdminDao{

	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	@Override
	public Admin checkAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		String account = admin.getAccount();
		String password = admin.getPassword();
		sql = "SELECT name,account,password,logo,regeditTime,state,email from admin where account = ? and `password` = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		Admin resultUser = new Admin();
		while(resultSet.next()){
			String userAccount = resultSet.getString("account");
			String userPassword = resultSet.getString("password");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userRegeditTime = resultSet.getString("regeditTime");
			String userState = resultSet.getString("state");
			String userEmail= resultSet.getString("email");
			resultUser.setAccount(userAccount);
			resultUser.setPassword(userPassword);
			resultUser.setName(userName);
			resultUser.setLogo(userLogo);
			resultUser.setRegeditTime(userRegeditTime);
			resultUser.setState(userState);
			resultUser.setEmail(userEmail);
		}
		JDBCUtil.close(connect);
		return resultUser;
	}
	@Override
	public void addAdmin(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		String account = admin.getAccount();
		String password = admin.getPassword();
		String email = admin.getEmail();
		String name = admin.getName();
		String logo = admin.getLogo();
		String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		sql = "INSERT INTO admin(account,password,email,name,logo,regeditTime) VALUES(?,?,?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, name);
		preparedStatement.setString(5, logo);
		preparedStatement.setDate(6, mysqldate);
		preparedStatement.execute();
		JDBCUtil.close(connect);
	}
	@Override
	public void setState(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		String account = admin.getAccount();
		String state = admin.getState();
		sql = "update admin set state= ? where account = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, state);
		preparedStatement.setString(2, account);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect); 
	}
	
}
