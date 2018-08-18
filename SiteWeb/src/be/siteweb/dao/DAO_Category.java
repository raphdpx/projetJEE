package be.siteweb.dao;

import java.sql.Connection;

import be.siteweb.pojo.CCategory;

public class DAO_Category extends DAO<CCategory> {
	public DAO_Category(Connection con) {
		super(con);
	}

	@Override
	public boolean create(CCategory obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CCategory obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CCategory obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CCategory select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
