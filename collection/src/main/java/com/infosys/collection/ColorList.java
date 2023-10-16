package com.infosys.collection;

import java.util.List;
public class ColorList {
	List<String> color;
	
	public ColorList(List<String> color) {
		this.color=color;
	}
	
	public void display() {
		color.stream().forEach(System.out::println);
	}
}
