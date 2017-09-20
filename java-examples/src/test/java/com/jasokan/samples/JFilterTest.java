package com.jasokan.samples;

import gk.jfilter.JFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jasokan.models.JEmployee;

public class JFilterTest {

    public static void main(String[] args) {

	List<JEmployee> empList = new ArrayList<JEmployee>();

	int count = 50;

	for (int i = 0; i < count; i++) {
	    JEmployee emp = new JEmployee(i, "Jagan" + i, "Asokan" + i, i + 100, "Address Line 1 " + i, "Address Line 2 " + i, "30000" + i);
	    empList.add(emp);
	}
	for (int i = 0; i < count; i++) {
	    JEmployee emp = new JEmployee(i, "Satya" + i, "Asokan" + i, i + 200, "Address Line 1-1 " + i, "Address Line 2-1 " + i, "50000" + i);
	    empList.add(emp);
	}
	for (int i = 0; i < count; i++) {
	    JEmployee emp = new JEmployee(i, "Lakshmi" + i, "Priya" + i, i + 300, "Address Line 1-2 " + i,
		    "Address Line 2-2 " + i, "10000" + i);
	    empList.add(emp);
	}
	for (int i = 0; i < count; i++) {
	    JEmployee emp = new JEmployee(i, "Venu" + i, "Karthik" + i, i + 400, "Address Line 1-3 " + i,
		    "Address Line 2-3 " + i, "40000" + i);
	    empList.add(emp);
	}

	JFilter<JEmployee> empFilter = new JFilter<JEmployee>(empList, JEmployee.class);

	/** Select JEmployees where age code is less than or equals to 200. */
	Map<String, Integer> parameters = new HashMap<String, Integer>(1);
	parameters.put("age", new Integer(200));
	List<JEmployee> ageList = empFilter.filter("{ 'age':{'$le':'?age'}}", parameters).out(
		new ArrayList<JEmployee>());

	/** Select JEmployees whose address1 is ADDRESS LINE 1. */

	Map<String, String> params = new HashMap<String, String>(1);
	params.put("address1", "ADDRESS LINE 1");
	List<JEmployee> fAddressList = empFilter.filter("{'address1':{'toUpperCase':'?address1'}}", params).out(
		new ArrayList<JEmployee>());

	params.put("address1", "Address Line 1");
	/** Select JEmployees whose address1 starts with Address Line 1. */
	List<JEmployee> fAddressList1 = empFilter.filter("{'address1':{'$sw':'?address1'}}", params).out(
		new ArrayList<JEmployee>());

	System.out.println(ageList.size());
	System.out.println(fAddressList.size());
	System.out.println(fAddressList1.size());
    }
}
