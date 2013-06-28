/**
 * 
 */
package com.zazzercode.robot.views.surgeryrobot;

import java.util.logging.Logger;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.zazzercode.robot.controllers.SurgeryRobotController;

/**
 * @author prayag
 * 
 */
public class List extends JInternalFrame {

	private JTable table;
	private DefaultTableModel tableModel;
	private String[] columns = { "Name", "Arch" };
	private Object[][] data = { { "Prayag", "c0o" }, { "Prayag2", "34f" } };
	private SurgeryRobotController controller = new SurgeryRobotController();
	private Logger logger = Logger.getLogger(List.class.getName());

	public List() {
		super("List surgery Robot", true, true, true);
		this.setSize(700, 600);
		this.setLayout(null);
		this.setLocation(15, 15);

		DefaultTableModel defaultTableModel = new DefaultTableModel(data, columns);
		table = new JTable(defaultTableModel);
		logger.info("" + table);
		table.setAutoResizeMode(JTable.HEIGHT);
		this.add(table);
	}
}
