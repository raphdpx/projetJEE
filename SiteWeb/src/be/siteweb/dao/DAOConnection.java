package be.siteweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAOConnection {
	/**** Attributs ****/
	private static Connection instance = null;

	/**** Constructeurs ****/
	public DAOConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@char-oracle11.condorcet.be:1521:xe";
			instance = DriverManager.getConnection(url, "ora32", "oracle3");
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Classe de driver introuvable" + ex.getMessage());
			System.exit(0);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erreur JDBC : " + ex.getMessage());
		}

		if (instance == null) {
			JOptionPane.showMessageDialog(null, "La base de données est inaccessible, fermeture du programme.");
			System.exit(0);
		}
	}

	/**** Méthodes ****/
	public static Connection getInstance() {
		if (instance == null) {
			new DAOConnection();
		}
		return instance;
	}
}
