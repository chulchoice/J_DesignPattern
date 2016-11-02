package com.chulgee.java.decorator;

public class SideBorder extends Border{

	public SideBorder(Display display) {
		// TODO Auto-generated constructor stub
		super(display);
	}

	@Override
	protected int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns()+2;
	}

	@Override
	protected int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}

	@Override
	protected String getRowText(int row) {
		// TODO Auto-generated method stub
		return "|"+display.getRowText(row)+"|";
	}

}
