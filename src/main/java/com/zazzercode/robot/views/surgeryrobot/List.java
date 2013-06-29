/**
 * 
 */
package com.zazzercode.robot.views.surgeryrobot;

import java.util.logging.Logger;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.zazzercode.robot.controllers.SurgeryRobotController;
import com.zazzercode.robot.models.SurgeryRobot;

/**
 * @author prayag
 * 
 */
public class List extends JInternalFrame {

	private DefaultTableModel defaultTableModel;
	private JTable table;
	private String[] columns = { "Name", "Architecture" };
	private Object[][] data;
	private SurgeryRobotController controller = new SurgeryRobotController();
	private Logger logger = Logger.getLogger(List.class.getName());

	public List() {
		super("List surgery Robot", true, true, true);
		this.setSize(700, 600);
		this.setLayout(null);
		this.setLocation(15, 15);

		java.util.List<SurgeryRobot> robots = controller.list();
		data = new Object[robots.size()][2];
		int counter = 0;
		for (SurgeryRobot sr : robots) {
			data[counter][0] = sr.getName();
			data[counter][1] = sr.getArchitecture();
			++counter;
		}

		defaultTableModel = new DefaultTableModel(data, columns);
		table = new JTable(defaultTableModel);
		logger.info("" + table.getVisibleRect());
		table.setAutoResizeMode(JTable.HEIGHT);
		this.add(table);

	}
}
