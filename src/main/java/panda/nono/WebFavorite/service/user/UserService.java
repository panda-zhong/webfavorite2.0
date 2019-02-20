package panda.nono.WebFavorite.service.user;

import java.sql.SQLException;

import panda.nono.WebFavorite.po.User;

public interface UserService {
	public User check(String account,String password) throws SQLException;
	public void regedit(String account,String password,String name, String email) throws SQLException;
}
