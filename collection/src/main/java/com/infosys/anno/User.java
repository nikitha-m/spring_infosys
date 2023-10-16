package com.infosys.anno;

import org.springframework.stereotype.Component;

@Component
public class User {
public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private int uid;
private String name;
}
