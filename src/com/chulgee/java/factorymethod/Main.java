package com.chulgee.java.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fac = new IdcardFactory();
		Product card1 = fac.create("chulgee lee");
		Product card2 = fac.create("jongchan lee");
		card1.use();
		card2.use();
		
	}

	interface IFACE{
		int b= new Integer(4);
		void getB();
	}
	
	abstract class ABSFace{
		List<String> li = new ArrayList<String>();
	}
}
