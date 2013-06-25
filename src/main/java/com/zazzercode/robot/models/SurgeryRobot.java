/**
 * 
 */
package com.zazzercode.robot.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

	public static List<SurgeryRobot> list() {
		Connection connection = PersistenceManager.getConnection();
		Statement statement;
		List<SurgeryRobot> robots = new ArrayList<SurgeryRobot>();
		String sql = "SELECT name, architecture FROM SurgeryRobot";
		try {
			statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				SurgeryRobot robot = new SurgeryRobot();
				robot.setName(result.getString(0));
				robot.setArchitecture(result.getString(1));
				robots.add(robot);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return robots;
	}
}
