package com.documentmanger.documentManager.message;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

public class ResponseFile {
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;
	  private String name;
	  private String orgName;
	  private String url;
	  private String type;
	  private long size;
	public ResponseFile(String id, String name, String orgName, String url, String type, long size) {
		super();
		this.id = id;
		this.name = name;
		this.orgName = orgName;
		this.url = url;
		this.type = type;
		this.size = size;
	}
	public ResponseFile() {
		super();
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
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	  
	 
	}