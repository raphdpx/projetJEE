package be.siteweb.dao;

import java.sql.Connection;

public class DAOFactory {
	protected static final Connection con = DAOConnection.getInstance();
	
	public static DAO getCategoryDAO() {
		return new DAO_Category(con);
	}
	public static DAO getRecordDAO() {
		return new DAO_Record(con);
	}
	public static DAO getSportDAO() {
		return new DAO_Sport(con);
	}
	public static DAO getUserDAO() {
		return new DAO_User(con);
	}
}
