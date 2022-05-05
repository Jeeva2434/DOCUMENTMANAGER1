package com.documentmanger.documentManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Doc {
	
 @Id
 @GeneratedValue(generator = "uuid")
 @GenericGenerator(name = "uuid", strategy = "uuid2")
 private String id;
 
 private String name;
 private String desc;

public Doc() {
	super();
	// TODO Auto-generated constructor stub
}

public Doc(String id, String name, String desc) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

 
 
 
 
}
