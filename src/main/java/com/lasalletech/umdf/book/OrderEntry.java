package com.lasalletech.umdf.book;

import java.util.Calendar;

public interface OrderEntry {
	public String getID();
	
	public OrderBook getBook();
	public int getBookPos();
	
	public double getPrice();
	public double getQty();
	
	public String getBroker();
	
	public Calendar getDate();
}
