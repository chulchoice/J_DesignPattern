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
		System.out.println(owner+"�� "+code+"�� ����մϴ�");
	}
	
	int getCode(){
		return code;
	}

}
