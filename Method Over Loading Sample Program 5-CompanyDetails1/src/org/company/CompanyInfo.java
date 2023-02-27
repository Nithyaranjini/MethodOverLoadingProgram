package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("Company name is :Tata Communication");}
	public void companyName(int id) {
		System.out.println("Company id is :"+id);}
	public void companyName(int id,String name,long phno) {
		System.out.println("Company id is :"+id+"\nclient name is :"+name+"\n \t client phno is :"+phno);}
    public void companyName(int id,String name,long phno,float salary) {
	    System.out.println("Company id is :"+id+"\nclient name is :"+name+"\n client phno is :"+phno+"\nEmployee salary is :"+salary);}
    public void companyName(int id,String name,float salary,long phno) {
    	System.out.println("Company id is :"+id+"\nclient name is :"+name+"\nEmployee salary is :"+salary+"\n \tClient phno is :"+phno);}
    public static void main(String[] args) {
    	CompanyInfo c = new CompanyInfo();
    	c.companyName();
		c.companyName(345);
		c.companyName(5326, "Sree", 564683940l);
		c.companyName(3546, "Priya", 765757.654758f, 5758956844l);
		c.companyName(2546, "Nithu", 765875.57544f, 5739504l);}
		
	}
    	
    
			
		
	
	
	

	


