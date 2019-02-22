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
import panda.nono.WebFavorite.dao.MessageDao;
import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.util.JDBCUtil;

public class MessageDaoImpl implements MessageDao{

	Connection connect = JDBCUtil.getConnection();
	String sql = null;
	PreparedStatement preparedStatement = null;
	@Override
	public void addMessage(Message message) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String detail = message.getDetail();
		String from = message.getFrom();
		String to = message.getTo();
		String Nowtime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		java.sql.Date mysqldate = java.sql.Date.valueOf(Nowtime);
		sql = "INSERT INTO message(detail,fromAccount,toAccount,time) VALUES(?,?,?,?)";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, detail);
		preparedStatement.setString(2, from);
		preparedStatement.setString(3, to);
		preparedStatement.setDate(4, mysqldate);
		preparedStatement.execute();
		JDBCUtil.close(connect);
		

	}
	@Override
	public List<Message> getAdminMessage(String account) throws SQLException {
		connect = JDBCUtil.getConnection();
		sql = "SELECT detail,fromAccount,time,id FROM message WHERE toAccount = ? and fromAccount = 'admin' ORDER BY message.time DESC";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		ResultSet messageSet = preparedStatement.executeQuery();
		List<Message> messageList = new ArrayList<Message>();
		while(messageSet.next()){
			String detail = messageSet.getString("detail");
			String fromAccount = messageSet.getString("fromAccount");
			String time = messageSet.getString("time");
			String id = messageSet.getString("id");
			Message getMessage = new Message(detail, fromAccount, time, id);
			messageList.add(getMessage);
		}
		JDBCUtil.close(connect);
		return messageList;
	}
	@Override
	public List<Message> getBeLoveMessage(String account) throws SQLException {
		connect = JDBCUtil.getConnection();
		sql = "SELECT detail,fromAccount,time,id FROM message WHERE toAccount = ? and fromAccount = 'like' ORDER BY message.time DESC";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		ResultSet messageSet = preparedStatement.executeQuery();
		List<Message> messageList = new ArrayList<Message>();
		while(messageSet.next()){
			String detail = messageSet.getString("detail");
			String fromAccount = messageSet.getString("fromAccount");
			String time = messageSet.getString("time");
			String id = messageSet.getString("id");
			Message getMessage = new Message(detail, fromAccount, time, id);
			messageList.add(getMessage);
		}
		JDBCUtil.close(connect);
		return messageList;
	}
	@Override
	public List<Message> getUserMessage(String account) throws SQLException {
		connect = JDBCUtil.getConnection();
		sql = "SELECT detail,fromAccount,time,id FROM message WHERE toAccount = ? and fromAccount NOT in(?,?) ORDER BY message.time DESC";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, Common.ADMINACCOUNT);
		preparedStatement.setString(3, Common.LIKEACCOUNT);
		ResultSet messageSet = preparedStatement.executeQuery();
		List<Message> messageList = new ArrayList<Message>();
		while(messageSet.next()){
			String detail = messageSet.getString("detail");
			String fromAccount = messageSet.getString("fromAccount");
			String time = messageSet.getString("time");
			String id = messageSet.getString("id");
			Message getMessage = new Message(detail, fromAccount, time, id);
			messageList.add(getMessage);
		}
		JDBCUtil.close(connect);
		return messageList;
	}
	@Override
	public String getUnreadMessageSize(String account) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		sql = "SELECT COUNT(1) as size FROM message WHERE toAccount = ? and state = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, account);
		preparedStatement.setString(2, Common.UNREADSTATE);
		ResultSet messageSet = preparedStatement.executeQuery();
		while(messageSet.next()){
			String size = messageSet.getString("size");
			return size;
		}
		JDBCUtil.close(connect);
		return "0";
	}
	@Override
	public void upMessagestate(String account) throws SQLException {
		// TODO Auto-generated method stub
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		sql = "UPDATE message SET state=? where toAccount = ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, Common.READSTATE);
		preparedStatement.setString(2, account);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect);
	}
}
