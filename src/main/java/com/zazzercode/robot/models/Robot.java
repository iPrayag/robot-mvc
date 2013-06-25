/**
 * 
 */
package com.zazzercode.robot.models;

import java.util.List;

/**
 * @author prayag
 * 
 */
public class Robot {
	private String name;
	private String architecture;
	private List<Robot> friends;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public List<Robot> getFriends() {
		return friends;
	}

	public void setFriends(List<Robot> friends) {
		this.friends = friends;
	}

}
