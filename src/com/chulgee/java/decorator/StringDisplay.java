package com.chulgee.java.decorator;

public class StringDisplay extends Display{

	private String data;
	
	public StringDisplay(String data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	@Override
	protected int getColumns() {
		// TODO Auto-generated method stub
		int len = data.getBytes().length;
		//System.out.println("data ="+len);
		return len;
	}

	@Override
	protected int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	protected String getRowText(int row) {
		// TODO Auto-generated method stub
		System.out.println("row="+row);
		//if(row == 0)
			return data;
		//else
			//return "";
	}
	

}
