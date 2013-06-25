/**
 * 
 */
package com.zazzercode.robot.models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.zazzercode.robot.models.database.PersistenceManager;

/**
 * @author prayag
 * 
 */
public class SurgeryRobot extends Robot {
	private List<Disease> diseases;

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	public void save() {
		Connection connection = PersistenceManager.getConnection();
		Statement statement;
		String name = "'" + this.getName() + "'";
		String arch = "'" + this.getArchitecture() + "'";
		String sql = "INSERT INTO SurgeryRobot(name, architecture) VALUES(" + name + "," + arch + ")";
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
