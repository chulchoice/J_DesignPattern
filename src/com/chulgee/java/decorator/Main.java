package com.chulgee.java.decorator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("emss");
		Display display = new StringDisplay("hello");
		//System.out.println(display.getRowText()+", "+display.getColumns());
		display = new SideBorder(display);
		display.show();
		display = new UpdownBorder(display, '/');
		display.show();
		display = new SideBorder(display);
		display.show();
		display = new UpdownBorder(display, '/');
		display.show();
		//System.out.println(display.getRowText());
		display = new FullBorder(display);
		//System.out.println(display.getRowText());
		display.show();
	}
	

}
