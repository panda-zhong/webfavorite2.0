package panda.nono.WebFavorite.daoImpl;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.UserwebsiteDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userwebsite;
import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.util.JDBCUtil;

public class UserwebsiteDaoImpl implements UserwebsiteDao{
	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	public void addUserwebsite(Userwebsite userwebsite) throws SQLException {
		connect = JDBCUtil.getConnection();
		String url = userwebsite.getUrl();
		String detail = userwebsite.getDetail();
		String name = userwebsite.getName();
		String account = userwebsite.getAccount();
		String logo = userwebsite.getLogo();
		String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		sql = "INSERT INTO userwebsite(account,url,logo,name,detail,regeditTIme) VALUES(?,?,?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, url);
		preparedStatement.setString(3, logo);
		preparedStatement.setString(4, name);
		preparedStatement.setString(5, detail);
		preparedStatement.setDate(6, mysqldate);
		preparedStatement.execute();
		JDBCUtil.close(connect);
		return;
	}
	@Override
	public void updateUserwesite(Userwebsite userwebsite) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String url = userwebsite.getUrl();
		String detail = userwebsite.getDetail();
		String name = userwebsite.getName();
		String account = userwebsite.getAccount();
		String logo = userwebsite.getLogo();
		String id = userwebsite.getId();
		sql = "UPDATE userwebsite SET url=?,detail = ?,logo = ?,name =? WHERE id=?"; ;
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, url);
		preparedStatement.setString(2,detail);
		preparedStatement.setString(3,logo);
		preparedStatement.setString(4,name);
		preparedStatement.setString(5,id);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect); 
		
	}
	@Override
	public void deleteUserwesite(Userwebsite userwebsite) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String account = userwebsite.getAccount();
		String id = userwebsite.getId();
		sql = "delete from userwebsite WHERE id=? and account = ?"; 
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, id);
		preparedStatement.setString(2,account);
		preparedStatement.execute();
		JDBCUtil.close(connect); 
	}
	@Override
	public List<Website> getUserwebsiteByAccount(String account) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		sql = "SELECT userwebsite.url, userwebsite.account, "
				+ "userwebsite.`name`, userwebsite.id, userwebsite.logo, "
				+ "userwebsite.detail, website.state, "
				+ "website.good, website.bad, website.readwebsite,"
				+ " userwebsite.regeditTime as userRegeditTime, "
				+ "website.click, website.id as websiteId,website.regeditTime "
				+ "FROM userwebsite LEFT JOIN website "
				+ "ON userwebsite.url = website.url "
				+ "AND userwebsite.account = website.account "
				+ "WHERE userwebsite.account = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Website>  resultUserwebsite = new ArrayList<Website>();
		while(resultSet.next()){
			String userUrl = resultSet.getString("url");
			String userId = resultSet.getString("id");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userDetail = resultSet.getString("detail");
			String good = resultSet.getString("good");
			String bad = resultSet.getString("bad");
			String readwebsite = resultSet.getString("readwebsite");
			String click = resultSet.getString("click");
			String state = resultSet.getString("state");
			String websiteId = resultSet.getString("websiteId");
			String regeditTime = resultSet.getString("regeditTime");
			String userRegeditTime = resultSet.getString("userRegeditTime");
			Website website = new Website();
			website.setUrl(userUrl);
			website.setUserRegeditTime(userRegeditTime);
			website.setDetail(userDetail);
			website.setId(websiteId);
			website.setName(userName);
			website.setLogo(userLogo);
			website.setGood(good);
			website.setBad(bad);
			website.setReadwebsite(readwebsite);
			website.setState(state);
			website.setRegeditTime(regeditTime);
			website.setClick(click);
			resultUserwebsite.add(website);
			website.setUserWebsiteId(userId);
		}
		JDBCUtil.close(connect);
		return resultUserwebsite;
	}
	
}
