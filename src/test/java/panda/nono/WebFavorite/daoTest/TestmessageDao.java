package panda.nono.WebFavorite.daoTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.dao.MessageDao;
import panda.nono.WebFavorite.daoImpl.MessageDaoImpl;
import panda.nono.WebFavorite.po.Message;

public class TestmessageDao {
	MessageDao messageDao = new MessageDaoImpl();
//	@Test
	public void testAddMessage() throws Exception {
		Message message = new Message();
		message.setDetail("11");
		message.setFrom("11");	
		message.setTo("111");
		this.messageDao.addMessage(message);
	}
//	@Test
	public void testgetMessageByToAndState() throws Exception {
		Message message = new Message();
		message.setState("1");
		message.setTo("1");
//		List<Message> list = this.messageDao.getMessageByToAndState(message);
//		for (Message message2 : list) {
//			System.out.println(message2);
//		}
	}
}
