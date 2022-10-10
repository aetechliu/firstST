package com.aet.firstST.entity;

import lombok.Data;

@Data
public class Customer {

	private int id;
	private String lastName;
	private String firstName;
	
	//構造方法
	//在生成对象的时候，少些几行代码。
	public Customer(int id, String ln, String fn) {
		this.id = id;
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public Customer() {
		
	}

	
}
