package com.chulgee.java.decorator;

public abstract class Display {

	public Display() {
		// TODO Auto-generated constructor stub
	}

	protected abstract int getColumns();
	protected abstract int getRows();
	protected abstract String getRowText(int row);
	public final void show(){
		for(int i=0; i<getRows(); i++){
			//System.out.println("row="+i);
			System.out.println(getRowText(i));
		}
	}
}
