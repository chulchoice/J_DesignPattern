package com.chulgee.java.decorator;

public class UpdownBorder extends Border{

	char ch;
	
	public UpdownBorder(Display display, char ch) {
		// TODO Auto-generated constructor stub
		super(display);
		this.ch = ch;
	}

	@Override
	protected int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns();
	}

	@Override
	protected int getRows() {
		// TODO Auto-generated method stub
		return display.getRows()+2;
	}

	@Override
	protected String getRowText(int row) {
		// TODO Auto-generated method stub
		
		if(row == 0){ // first line
			return "|"+makeLine(ch, display.getColumns()-2)+"|";
		}else if(row == getRows()-1){ // last line
			return "|"+makeLine(ch, display.getColumns()-2)+"|";
		}else{ // body
			return display.getRowText(row-1);
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
