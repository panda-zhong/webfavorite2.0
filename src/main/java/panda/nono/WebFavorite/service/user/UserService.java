package panda.nono.WebFavorite.service.user;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.Message;
import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Website;

public interface UserService {
	public User check(String account,String password) throws SQLException;
	public boolean checkAccount(String account) throws SQLException;
	public void regedit(String account,String password,String name, String email) throws SQLException;
	public void updataPassword(String email,String password) throws SQLException;
	public User getUpdataUser(String account) throws SQLException;
	public List<Message> getMessageByUser(String account) throws SQLException;
	public List<Message> getMessageByLike(String account) throws SQLException;
	public List<Message> getMessageByAdmin(String account) throws SQLException;
	public String getMessageSize(String account) throws SQLException;
	public void readMessage(String account) throws SQLException;
	public void updataInfo(String account, String name, String email, String introduction) throws SQLException;
	public void updataLogo(String account,String logo) throws SQLException;
	public void addMyWebSite(String account,String url,String name,String logo,String introduction) throws SQLException;
	public List<Website> getMyWebSite(String account) throws SQLException;
	public void deleteMyWebsite(String id) throws SQLException;
}
