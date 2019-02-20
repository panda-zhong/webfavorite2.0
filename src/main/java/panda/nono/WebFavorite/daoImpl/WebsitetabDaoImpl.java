package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import panda.nono.WebFavorite.dao.WebsitetabDao;
import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.po.Websitetab;
import panda.nono.WebFavorite.util.JDBCUtil;

public class WebsitetabDaoImpl implements WebsitetabDao{

	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	@Override
	public void addWebsitetab(Websitetab websitetab) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		 String url = websitetab.getTab();
		 String tab = websitetab.getUrl();
		 sql = "INSERT  INTO websitetab(url,tab) VALUES(?,?)";
		 preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setString(1, url);
			preparedStatement.setString(2, tab);
			preparedStatement.execute();
			JDBCUtil.close(connect);
	}
	@Override
	public void deleteWebsitetab(Websitetab websitetab) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String url = websitetab.getTab();
		 String tab = websitetab.getUrl();
		 sql = "delete from websitetab where url = ? and tab = ?";
		 preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setString(1, url);
			preparedStatement.setString(2, tab);
			preparedStatement.execute();
			JDBCUtil.close(connect);
		 
	}
	@Override
	public List<Websitetab> getWebsitetabByurl(Websitetab websitetab) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String url = websitetab.getUrl();
		 sql = "SELECT tab FROM websitetab WHERE url = ?";
		 preparedStatement = connect.prepareStatement(sql);
			preparedStatement.setString(1, url);
			ResultSet websitetabSet = preparedStatement.executeQuery();
			List<Websitetab> websitetabList = new ArrayList<Websitetab>();
			while(websitetabSet.next()){
				String tab1 = websitetabSet.getString("tab");
				Websitetab getwebsitetab = new Websitetab(tab1);
				websitetabList.add(getwebsitetab);
			}
			JDBCUtil.close(connect);
			return websitetabList;
	}
	
}
