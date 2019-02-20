package panda.nono.WebFavorite.dao;

import java.sql.SQLException;

import panda.nono.WebFavorite.po.Admin;

public interface AdminDao {
	public Admin checkAdmin(Admin admin) throws SQLException;
	public void addAdmin(Admin admin) throws SQLException;
	public void setState(Admin admin) throws SQLException;
}
