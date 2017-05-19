package com.changjiang.util;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int id;
	private String name;
	private List<Node> children=null;
	private int currentLevel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Node> getChildren() {
		
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public void addChildrenNode(Node node){
		if(this.children!=null){
			this.children.add(node);
		}else{
			this.children=new ArrayList<>();
			this.children.add(node);
		}
	}
	public int getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}
	
}
