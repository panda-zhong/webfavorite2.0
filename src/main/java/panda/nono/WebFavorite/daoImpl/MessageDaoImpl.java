package panda.nono.WebFavorite.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
	public void upMessagestate(Message message) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String id = message.getId();
		String state = message.getState();
		sql = "UPDATE message SET state=? WHERE id=?; ";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, state);
		preparedStatement.setString(2, id);
		preparedStatement.executeUpdate();
		JDBCUtil.close(connect);
	}
	@Override
	public List<Message> getMessageByToAndState(Message message) throws SQLException {
		connect = JDBCUtil.getConnection();
		// TODO Auto-generated method stub
		String toAccount = message.getTo();
		String state = message.getState();
		sql = "SELECT detail,fromAccount,time,id FROM message WHERE toAccount = ? and state= ?";
		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.setString(1, toAccount);
		preparedStatement.setString(2, state);
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
}
