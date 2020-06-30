/*
create table id_check(
    id varchar2(15) primary key); 
*/
package com.spring.usercheck;

public class UserVO {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
