package be.siteweb.dao;

import java.sql.Connection;

import be.siteweb.pojo.CSport;

public class DAO_Sport extends DAO<CSport> {
	public DAO_Sport(Connection con) {
		super(con);
	}

	@Override
	public boolean create(CSport obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CSport obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CSport obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CSport select(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
