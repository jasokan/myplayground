package com.jasokan.models;

public class JEmployee {

    private int empId;
    private String fName;
    private String sName;
    private int age;
    private String address1;
    private String address2;
    private String zipCode;

    public JEmployee(int empId, String fName, String sName, int age, String address1, String address2, String zipCode) {
	super();
	this.empId = empId;
	this.fName = fName;
	this.sName = sName;
	this.age = age;
	this.address1 = address1;
	this.address2 = address2;
	this.zipCode = zipCode;
    }

    public int getEmpId() {
	return empId;
    }

    public void setEmpId(int empId) {
	this.empId = empId;
    }

    public String getfName() {
	return fName;
    }

    public void setfName(String fName) {
	this.fName = fName;
    }

    public String getsName() {
	return sName;
    }

    public void setsName(String sName) {
	this.sName = sName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getAddress1() {
	return address1;
    }

    public void setAddress1(String address1) {
	this.address1 = address1;
    }

    public String getAddress2() {
	return address2;
    }

    public void setAddress2(String address2) {
	this.address2 = address2;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

}