package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import panda.nono.WebFavorite.dao.WebsitelogDao;
import panda.nono.WebFavorite.po.Websitelog;
import panda.nono.WebFavorite.util.JDBCUtil;

public class WebsitelogDaoImpl implements WebsitelogDao{

	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	@Override
	public void addWebsitelog(Websitelog websitelog) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		 String account = websitelog.getAccount();
		 String  url = websitelog.getUrl();
		 String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		 sql = "INSERT INTO websitelog(account,url,time) VALUES(?,?,?);";
		 preparedStatement = connect.prepareStatement(sql);
		    preparedStatement.setString(1, account);
			preparedStatement.setString(2, url);
			preparedStatement.setDate(3, mysqldate);
			preparedStatement.execute();
			JDBCUtil.close(connect);
	}
	
}
