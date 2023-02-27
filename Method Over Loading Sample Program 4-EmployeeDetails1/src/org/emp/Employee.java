package org.emp;

public class Employee {
	
	    public void empId() {
		  System.out.println("Employee id is :23445677");}
		private void empId(int id)	{
		  System.out.println("Empoyee id is :"+id);}
		private void empId(int id,String name,float salary) {
		  System.out.println("Employee id is :"+id +"\n Employee name is :"+name +" \n Employee salary is :"+salary);}
		private void empId(String name,int id,float salary) {
		  System.out.println( "Employee name is :"+name +"\n Employee id is :"+id +"\n Employee salary is :"+salary);}
		private void empId(String name,int id,float salary,long phno) {
			  System.out.println( "Employee name is :"+name +"\n Employee id is :"+id +"\n Employee salary is :"+salary +"\n \t Employee phno is:"+phno);}
		public static void main(String[] args) {
			Employee c = new Employee();
			c.empId();
			c.empId(3456);
			c.empId(356, "Nithya", 56473.635763f);
			c.empId("Sree", 365, 5364878.6578379f);
			c.empId("Nandhu", 56723, 7647348.654738f, 76584895609l);}
		
		}
		
		

	


