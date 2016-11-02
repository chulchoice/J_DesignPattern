package com.chulgee.java.decorator;

public class FullBorder extends Border{

	public FullBorder(Display display) {
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
		return display.getRows()+2;
	}

	@Override
	protected String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row == 0){
			return "+"+makeLine('-', display.getColumns())+"+";
		}else if(row == display.getRows()+1){
			return "+"+makeLine('-', display.getColumns())+"+";
		}else{
			return "|"+display.getRowText(row-1)+"|";
		}
	}

	private String makeLine(char ch, int count){
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<count; i++){
			buf.append(ch);
		}
		return buf.toString();
	}

}
