/**
 * 
 */
package com.zazzercode.robot.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.zazzercode.robot.views.surgeryrobot.Add;
import com.zazzercode.robot.views.surgeryrobot.List;

/**
 * @author prayag
 * 
 */
public class RobotFrame extends JFrame {

	JDesktopPane desktopPane;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem itemAdd;

	public RobotFrame() {

		this.setSize(1200, 600);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		desktopPane = new JDesktopPane();
		this.add(desktopPane);

		// initialise menu
		menuBar = new JMenuBar();
		menu = new JMenu("Robot");
		itemAdd = new JMenuItem("Add");
		menu.add(itemAdd);
		menuBar.add(menu);
		this.setJMenuBar(menuBar);

		itemAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Add add = new Add();
				List list = new List();
				desktopPane.add(list).setVisible(true);

			}
		});
	}
}
