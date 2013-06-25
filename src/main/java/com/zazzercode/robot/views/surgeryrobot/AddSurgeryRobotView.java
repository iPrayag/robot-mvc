/**
 * 
 */
package com.zazzercode.robot.views.surgeryrobot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.zazzercode.robot.controllers.SurgeryRobotController;
import com.zazzercode.robot.models.SurgeryRobot;

/**
 * @author prayag
 * 
 */
public class AddSurgeryRobotView extends JInternalFrame {

	private SurgeryRobotController controller = new SurgeryRobotController();
	private JLabel nameLabel;
	private JTextField name;

	//
	private JLabel architectureLabel;
	private JTextField architecture;

	private JButton save;

	public AddSurgeryRobotView() {
		super("Add surgery Robot", true, true, true);
		this.setSize(700, 600);
		this.setLayout(null);
		this.setLocation(15, 15);

		nameLabel = new JLabel("Name");
		nameLabel.setBounds(50, 50, 80, 30);
		this.add(nameLabel);

		//
		save = new JButton("Save");
		save.setBounds(100, 100, 40, 30);
		this.add(save);

		save.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				SurgeryRobot surgeryRobot = new SurgeryRobot();
				surgeryRobot.setName(name.getText());
				controller.create(surgeryRobot);
			}
		});

	}
}
