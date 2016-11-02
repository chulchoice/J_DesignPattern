package com.chulgee.java.factorymethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdcardFactory extends Factory{

	Map<Integer, Product> cards = new HashMap<Integer, Product>();
	
	public IdcardFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		Product p = new Idcard(owner);
		
		return p;
	}

	@Override
	protected void registerProduct(Product p) {
		// TODO Auto-generated method stub
		cards.put(((Idcard)p).getCode(), p);
	}

}
