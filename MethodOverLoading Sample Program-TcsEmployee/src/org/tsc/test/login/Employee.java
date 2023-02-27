package org.tsc.test.login;

public class Employee {
	private void empId() {
		System.out.println("Employee id is :4613547367");}
	private void empId(int id) {
		System.out.println("Employee id is :"+id);}
	private void empId(String name) {
		System.out.println("datatype method :Employee id is :"+name);}
	private void empId(int id,String name,long phno) {
		System.out.println("count method:Employee id is :"+id +"\n Employee name is :"+name +"\t Employee phono is: "+phno);}
    private void empId(String name,int id,long phno) {
    	System.out.println("order method:Employee name is :"+name + "\n Employee id : "+id +"\n Employee phono is:"+phno);}
    public static void main(String[] args) {
		Employee c = new Employee();
		c.empId();
		c.empId(345);
		c.empId("Nithya");
		c.empId(345, "Siva", 6724582454658l);
		c.empId("Sree", 567,67578978756453l);}
		
	
   
	}
		
	
		
	
	
	
		
	

	


