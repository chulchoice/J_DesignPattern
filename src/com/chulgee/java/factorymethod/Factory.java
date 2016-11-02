package com.chulgee.java.factorymethod;

public abstract class Factory {

	public Factory() {
		// TODO Auto-generated constructor stub
	}

	protected Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
