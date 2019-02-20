package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.Message;

public interface MessageDao {
	public void addMessage(Message message) throws SQLException;
	public void upMessagestate(Message message) throws SQLException;
	public List<Message> getMessageByToAndState(Message message) throws SQLException;
	
}
