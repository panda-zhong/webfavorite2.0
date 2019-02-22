package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userlikeuser;
import panda.nono.WebFavorite.po.Userwebsite;

public interface UserlikeuserDao {
	public void focususers(Userlikeuser userlikeuser) throws SQLException;
	public void cancelfocus(Userlikeuser userlikeuser) throws SQLException;
	public List<User> getUserlikeuserByAccount(Userlikeuser userlikeuser) throws SQLException;
	public String getIdolsize(Userlikeuser userlikeuser) throws SQLException;
	public List<User> getUserByAccount(Userlikeuser userlikeuser) throws SQLException;//ͨ���û���ù�ע���û��б�
}
