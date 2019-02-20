package panda.nono.WebFavorite.dao;

import java.sql.SQLException;
import java.util.List;

import panda.nono.WebFavorite.po.User;
import panda.nono.WebFavorite.po.Userwebsite;

public interface UserwebsiteDao {
	public void addUserwebsite(Userwebsite userwebsite) throws SQLException;
	public void updateUserwesite(Userwebsite userwebsite) throws SQLException;
	public void deleteUserwesite(Userwebsite userwebsite) throws SQLException;
	public  List<Userwebsite> getUserwebsiteByAccount(Userwebsite userwebsite) throws SQLException;
}
