package be.siteweb.dao;

import java.sql.Connection;

import be.siteweb.pojo.CRecord;

public class DAO_Record extends DAO<CRecord> {
	public DAO_Record(Connection con) {
		super(con);
	}

	@Override
	public boolean create(CRecord obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CRecord obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CRecord obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CRecord select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
