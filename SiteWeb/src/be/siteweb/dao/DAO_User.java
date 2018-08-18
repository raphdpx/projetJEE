package be.siteweb.dao;

import java.sql.Connection;

import be.siteweb.pojo.CUser;

public class DAO_User extends DAO<CUser> {
	public DAO_User(Connection con) {
		super(con);
	}

	@Override
	public boolean create(CUser obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CUser obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CUser obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CUser select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
