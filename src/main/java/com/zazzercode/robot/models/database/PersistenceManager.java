/**
 * 
 */
package com.zazzercode.robot.models.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prayag
 * 
 */
public class PersistenceManager {

	private static Connection connection;

	/**
	 * get Interface {@link Connection}
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		try {
			// initialise interface {Driver}
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/robot", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
