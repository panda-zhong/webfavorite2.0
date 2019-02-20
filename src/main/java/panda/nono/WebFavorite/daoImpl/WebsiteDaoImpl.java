package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.event.ListDataEvent;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.WebsiteDao;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.util.JDBCUtil;

public class WebsiteDaoImpl implements WebsiteDao {

	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;

	@Override
	public void addwebsite(Website website) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		String url = website.getUrl();
		String logo = website.getLogo();
		String kind = website.getKind();
		String name = website.getName();
		String account = website.getAccount();
		String good = website.getGood();
		String bad = website.getBad();
		String click = website.getClick();
		String readwebsite = website.getReadwebsite();
		String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		sql = "INSERT INTO website(url,logo,kind,name,regeditTime,account,good,bad,click,readwebsite) VALUES(?,?,?,?,?,?,?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, url);
		preparedStatement.setString(2, logo);
		preparedStatement.setString(3, kind);
		preparedStatement.setString(4, name);
		preparedStatement.setDate(5, mysqldate);
		preparedStatement.setString(6, account);
		preparedStatement.setString(7, good);
		preparedStatement.setString(8, bad);
		preparedStatement.setString(9, click);
		preparedStatement.setString(10, readwebsite);
		preparedStatement.execute();
		JDBCUtil.close(connect);

	}

	@Override
	public void updateWebsiteState(Website website) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String state = website.getState();
		String id = website.getId();
		sql = "UPDATE website SET state=? WHERE id=?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, state);
		preparedStatement.setString(2, id);
	}

	@Override
	public List<Website> getWebsiteByTime(int page) throws SQLException {
		// TODO Auto-generated method stub
		sql = "SELECT website.url, website.logo, website.kind,website. state, website.`name`, "
				+ "website.regeditTime, website.account,website.good, "
				+ "website.bad,website.readwebsite, website.click, website.id "
				+ "FROM website ORDER BY website.regeditTime DESC LIMIT ?,?";
		int sizeOfPage = Common.SIZEOFPAGE;
		int begin = sizeOfPage * (page - 1);
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setInt(1, begin);
		preparedStatement.setInt(2, sizeOfPage);
		ResultSet websiteSet = preparedStatement.executeQuery();
		List<Website> websiteList = new ArrayList<Website>();
		while (websiteSet.next()) {
			String url = websiteSet.getString("url");
			String logo = websiteSet.getString("logo");
			String kind = websiteSet.getString("kind");
			String name = websiteSet.getString("name");
			String regeditTime = websiteSet.getString("regeditTime");
			String account = websiteSet.getString("account");
			String good = websiteSet.getString("good");
			String bad = websiteSet.getString("bad");
			String readwebsite = websiteSet.getString("readwebsite");
			String click = websiteSet.getString("click");
			String id = websiteSet.getString("id");
			Website website = new Website(url, logo, kind, name, regeditTime, account, good, bad, readwebsite, click,
					id);
			websiteList.add(website);
		}
		JDBCUtil.close(connect);
		return websiteList;
	}

	@Override
	public String getWebsize(Website website) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		sql = "SELECT count(1)as size from website";
		preparedStatement = connect.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		String size = "0";
		while (resultSet.next()) {
			size = resultSet.getString("size");
		}
		JDBCUtil.close(connect);
		return size;
	}

	@Override
	public List<Website> getWebmesageByaccount() throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		sql = "SELECT website.url, website.logo, website.kind, website.state, website.`name`,"
				+ "website.regeditTime, website.account, website.good, website.bad, website.readwebsite,"
				+ "website.click, website.id " + "FROM website ORDER BY website.regeditTime DESC LIMIT 0,6";
		// int sizeOfPage = Common.SIZEOFPAGE;
		// int begin = sizeOfPage*(page - 1);
		preparedStatement = connect.prepareStatement(sql);
		// preparedStatement.setInt(1, begin);
		// preparedStatement.setInt(2, sizeOfPage);
		ResultSet websiteSet = preparedStatement.executeQuery();
		List<Website> websiteList = new ArrayList<Website>();
		while (websiteSet.next()) {
			String url = websiteSet.getString("url");
			String logo = websiteSet.getString("logo");
			String kind = websiteSet.getString("kind");
			String name = websiteSet.getString("name");
			String regeditTime = websiteSet.getString("regeditTime");
			String account = websiteSet.getString("account");
			String good = websiteSet.getString("good");
			String bad = websiteSet.getString("bad");
			String readwebsite = websiteSet.getString("readwebsite");
			String click = websiteSet.getString("click");
			String id = websiteSet.getString("id");
			Website website = new Website(url, logo, kind, name, regeditTime, account, good, bad, readwebsite, click,
					id);
			websiteList.add(website);
		}
		JDBCUtil.close(connect);
		return websiteList;
	}


	@Override
	public List<Website> getWebsiteByLike(int page) throws SQLException {
		sql = "SELECT website.url, website.logo, website.kind,website. state, website.`name`, "
				+ "website.regeditTime, website.account,website.good, "
				+ "website.bad,website.readwebsite, website.click, website.id "
				+ "FROM website ORDER BY website.good DESC LIMIT ?,?";
		int sizeOfPage = Common.SIZEOFPAGE;
		int begin = sizeOfPage * (page - 1);
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setInt(1, begin);
		preparedStatement.setInt(2, sizeOfPage);
		ResultSet websiteSet = preparedStatement.executeQuery();
		List<Website> websiteList = new ArrayList<Website>();
		while (websiteSet.next()) {
			String url = websiteSet.getString("url");
			String logo = websiteSet.getString("logo");
			String kind = websiteSet.getString("kind");
			String name = websiteSet.getString("name");
			String regeditTime = websiteSet.getString("regeditTime");
			String account = websiteSet.getString("account");
			String good = websiteSet.getString("good");
			String bad = websiteSet.getString("bad");
			String readwebsite = websiteSet.getString("readwebsite");
			String click = websiteSet.getString("click");
			String id = websiteSet.getString("id");
			Website website = new Website(url, logo, kind, name, regeditTime, account, good, bad, readwebsite, click,
					id);
			websiteList.add(website);
		}
		JDBCUtil.close(connect);
		return websiteList;
	}

	@Override
	public List<Website> getWebSiteByName(Website website, int page) throws SQLException {
		// TODO Auto-generated method stub
		sql = "SELECT website.url, website.logo, website.kind,website. state, website.`name`, "
				+ "website.regeditTime, website.account,website.good, "
				+ "website.bad,website.readwebsite, website.click, website.id "
				+ "FROM website where name like ? ORDER BY website.good DESC LIMIT ?,?";
		int sizeOfPage = Common.SIZEOFPAGE;
		int begin = sizeOfPage * (page - 1);
		String name = website.getName();
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, "%"+name+"%");
		preparedStatement.setInt(2, begin);
		preparedStatement.setInt(3, sizeOfPage);
		ResultSet websiteSet = preparedStatement.executeQuery();
		List<Website> websiteList = new ArrayList<Website>();
		while (websiteSet.next()) {
			String url = websiteSet.getString("url");
			String logo = websiteSet.getString("logo");
			String kind = websiteSet.getString("kind");
			String webname = websiteSet.getString("name");
			String regeditTime = websiteSet.getString("regeditTime");
			String account = websiteSet.getString("account");
			String good = websiteSet.getString("good");
			String bad = websiteSet.getString("bad");
			String readwebsite = websiteSet.getString("readwebsite");
			String click = websiteSet.getString("click");
			String id = websiteSet.getString("id");
			Website resultWebsite = new Website(url, logo, kind, webname, regeditTime, account, good, bad, readwebsite, click,
					id);
			websiteList.add(resultWebsite);
		}
		JDBCUtil.close(connect);
		return websiteList;
	}
}
