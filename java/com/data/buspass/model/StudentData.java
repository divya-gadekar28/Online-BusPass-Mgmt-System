package com.data.buspass.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_data")

public class StudentData {

	@Id
	@Column
	private int regid;
	@Column
	private String username;
	@Column
	private String phno;
	@Column
	private String cname;
	@Column
	private String sclass;
	@Column
	private String busno;
	@Column
	private String address;
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getBusno() {
		return busno;
	}
	public void setBusno(String busno) {
		this.busno = busno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentData [regid=" + regid + ", username=" + username + ", phno=" + phno + ", cname=" + cname
				+ ", sclass=" + sclass + ", busno=" + busno + ", address=" + address + "]";
	}
	public StudentData(int regid, String username, String phno, String cname, String sclass, String busno,
			String address) {
		super();
		this.regid = regid;
		this.username = username;
		this.phno = phno;
		this.cname = cname;
		this.sclass = sclass;
		this.busno = busno;
		this.address = address;
	}
	public StudentData() {
		super();
	}
	
	
	
}
