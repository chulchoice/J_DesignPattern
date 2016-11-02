package com.chulgee.java.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{

	List<String> list = new ArrayList<String>();
	public MultiStringDisplay() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected int getColumns() {
		// TODO Auto-generated method stub
		int len=0;
		for(String str : list){
			if(len < str.length()){
				len = str.length();
			}
		}
		//System.out.println("len="+len);
		return len;
	}
	
	@Override
	protected int getRows() {
		// TODO Auto-generated method stub
		return list.size();
	}
	@Override
	protected String getRowText(int row) {
		// TODO Auto-generated method stub
		//System.out.println(list.get(row).length()+", "+getColumns());
		if(list.get(row).length() < getColumns()){
			StringBuffer sb = new StringBuffer();
			sb.append(list.get(row));
			for(int i=0; i<getColumns()-list.get(row).length(); i++){
				//System.out.println(i);
				sb.append(' ');
			}
			return sb.toString();
		}
		return list.get(row);
	}
	public void add(String str){
		list.add(str);
	}
}
