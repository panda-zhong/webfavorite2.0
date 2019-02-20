package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.UserwebsiteDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userwebsite;
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
		sql = "INSERT INTO userwebsite(account,url,logo,name,detail) VALUES(?,?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, url);
		preparedStatement.setString(3, logo);
		preparedStatement.setString(4, name);
		preparedStatement.setString(5, detail);
		preparedStatement.execute();
		JDBCUtil.close(connect);
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
	public List<Userwebsite> getUserwebsiteByAccount(Userwebsite userwebsite) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		String account = userwebsite.getAccount();
		sql = "select url , id, name, logo,detail from userwebsite where account = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Userwebsite>  resultUserwebsite = new ArrayList<Userwebsite>();
		while(resultSet.next()){
			String userUrl = resultSet.getString("url");
			String userId = resultSet.getString("id");
			String userName = resultSet.getString("name");
			String userLogo = resultSet.getString("logo");
			String userDetail = resultSet.getString("detail");
			Userwebsite userwebsite2 = new Userwebsite();
			userwebsite2.setUrl(userUrl);
			userwebsite2.setDetail(userDetail);
			userwebsite2.setId(userId);
			userwebsite2.setName(userName);
			userwebsite2.setLogo(userLogo);
			resultUserwebsite.add(userwebsite2);
			
		}
		JDBCUtil.close(connect);
		return resultUserwebsite;
	}
}
