package com.chulgee.java.factorymethod;

public class Idcard extends Product{

	String owner;
	int code;
	
	Idcard(String owner) {
		// TODO Auto-generated constructor stub
		this.owner = owner;
		this.code = owner.hashCode();
	}

	@Override
	protected void use() {
		// TODO Auto-generated method stub
		System.out.println(owner+"가 "+code+"를 사용합니다");
	}
	
	int getCode(){
		return code;
	}

}
