package org.add;

public class GreensTech {
	private void greensOmr() {
		System.out.println("Greens Technology Omr");}
	private void greensOmr(int Id) {
		System.out.println("Greens Tech id:"+Id);}
    private void greensOmr(int Id,String branchName,long phno) {
    	System.out.println("Greens Tech id:"+Id+"\nGreens Tech branchName :"+branchName+"\n\tGreens Tech phno is :"+phno);}
    private void greensOmr(String branchName,int Id,long phno) {
    	System.out.println("Greens Tech branchName :"+branchName+"\nGresns Tech id :"+Id+"\n\tGreens Tech phno is :"+phno);}
    	public static void main(String[] args) {
			GreensTech c = new GreensTech ();
			c.greensOmr();
			c.greensOmr(45352);
			c.greensOmr(355," adiyar", 2553758567l);
			c.greensOmr("Vadapalani", 53577, 35465757687l);
		}
    
    	
    		
				
			
		
		
	

	}


