package com.tnsif.scannerclass;

public class Taxcalculation {
  public void calculatetax(Person p) {
	  if(p.getIncome()<=1600) {
		  p.getTax(0);

	  }
	  else if(p.getIncome()>1600 && p.getIncome()<30000) {
		  p.setTax(5);
	  
  }
	  else {
		  p.setTax(10);
	  }
}
}