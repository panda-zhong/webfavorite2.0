package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.Message;

public interface MessageDao {
	public void addMessage(Message message) throws SQLException;
	public void upMessagestate(String account) throws SQLException;
	public List<Message> getAdminMessage(String account) throws SQLException;
	public List<Message> getBeLoveMessage(String account) throws SQLException;
	public List<Message> getUserMessage(String account) throws SQLException;
	public String getUnreadMessageSize(String account) throws SQLException;
}
