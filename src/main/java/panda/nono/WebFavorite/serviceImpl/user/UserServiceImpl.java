package panda.nono.WebFavorite.serviceImpl.user;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import panda.nono.WebFavorite.common.Common;
import panda.nono.WebFavorite.dao.MessageDao;
import panda.nono.WebFavorite.dao.UserDao;
import panda.nono.WebFavorite.dao.UserlikeuserDao;
import panda.nono.WebFavorite.dao.UserwebsiteDao;
import panda.nono.WebFavorite.daoImpl.MessageDaoImpl;
import panda.nono.WebFavorite.daoImpl.UserDaoImpl;
import panda.nono.WebFavorite.daoImpl.UserlikeuserDaoImpl;
import panda.nono.WebFavorite.daoImpl.UserwebsiteDaoImpl;
import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userlikeuser;
import panda.nono.WebFavorite.po.Userwebsite;
import panda.nono.WebFavorite.po.Website;
import panda.nono.WebFavorite.service.user.UserService;
import panda.nono.WebFavorite.util.Encryption;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	private UserlikeuserDao userlikeuserDao = new UserlikeuserDaoImpl();
	private MessageDao messageDao = new MessageDaoImpl();
	private UserwebsiteDao userwebsiteDao = new UserwebsiteDaoImpl();
	@Override
	public User check(String account, String password) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAccount(account);
		user = this.userDao.getUserById(user);
		String databasePassword = user.getPassword();
		user.setPassword(password);
		if(!Encryption.checkPassword(user, databasePassword)){
			return null;
		}else{
			return user;
		}
	}
	@Override
	public void regedit(String account, String password, String name, String email) throws SQLException {
		// TODO Auto-generated method stub
		String logo = Common.USERLOGO;
		User user = new User(account, password, logo, email, name);
		Encryption.encryptPasswd(user);
		this.userDao.regedit(user);
	}
	@Override
	public void updataPassword(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		Encryption.encryptPasswd(user);
		this.userDao.updatePassword(user);
	}
	@Override
	public boolean checkAccount(String account) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setAccount(account);
		user = this.userDao.getUserById(user);
		if(user.getName()!=null){
			return true;
		}
		return false;
	}
	@Override
	public User getUpdataUser(String account) throws SQLException {
		// TODO Auto-generated method stub
		Userlikeuser userlikeuser = new Userlikeuser();
		userlikeuser.setFunsAccount(account);
		String idolSize = this.userlikeuserDao.getIdolsize(userlikeuser);
		User user = new User();
		user.setAccount(account);
		user = this.userDao.getUserById(user);
		user.setIdolSize(idolSize);
		return user;
	}
	@Override
	public List<Message> getMessageByUser(String account) throws SQLException {
		// TODO Auto-generated method stub
		List<Message> messageList = this.messageDao.getUserMessage(account);
		return messageList;
	}
	@Override
	public String getMessageSize(String account) throws SQLException {
		// TODO Auto-generated method stub
		return this.messageDao.getUnreadMessageSize(account);
	}
	@Override
	public List<Message> getMessageByLike(String account) throws SQLException {
		// TODO Auto-generated method stub
		List<Message> messageList = this.messageDao.getBeLoveMessage(account);
		return messageList;
	}
	@Override
	public List<Message> getMessageByAdmin(String account) throws SQLException {
		List<Message> messageList = this.messageDao.getAdminMessage(account);
		return messageList;
	}
	@Override
	public void readMessage(String account) throws SQLException {
		// TODO Auto-generated method stub
		this.messageDao.upMessagestate(account);
	}
	@Override
	public void updataInfo(String account, String name, String email, String introduction) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User(account, null, email, null, introduction, name);
		this.userDao.updataInfo(user);
	}
	@Override
	public void updataLogo(String account, String logo) throws SQLException {
		// TODO Auto-generated method stub
		this.userDao.setLogo(account, logo);
	}
	@Override
	public void addMyWebSite(String account, String url, String name, String logo, String introduction) throws SQLException {
		// TODO Auto-generated method stub
		Userwebsite userwebsite = new Userwebsite(url, account, name, logo, introduction);
		this.userwebsiteDao.addUserwebsite(userwebsite);
	}
	@Override
	public List<Website> getMyWebSite(String account) throws SQLException {
		// TODO Auto-generated method stub
		List<Website> list = this.userwebsiteDao.getUserwebsiteByAccount(account);
		return list;
	}
	@Override
	public void deleteMyWebsite(String id) throws SQLException {
		// TODO Auto-generated method stub
		Userwebsite userwebsite = new Userwebsite();
		userwebsite.setId(id);
		this.userwebsiteDao.deleteUserwesite(userwebsite);
	}
	
}
