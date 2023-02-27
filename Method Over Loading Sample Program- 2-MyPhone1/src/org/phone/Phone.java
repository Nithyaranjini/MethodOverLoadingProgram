package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("My phone is :Oppo A9"+"\n IMEI1:1234567891012345"+"\n Rear Sensor:48MP & 8MP");}
	
	private void phoneInfo(int id ) {
		System.out.println("My phone id is IMEI1:1234567891012345"+"\n My storge is : 128GB "+"\n os :ColorOS 6.0.1,Based on Android 9");}
	
	private void phoneInfo(int id ,String name,float phnoAmount) {
		System.out.println("My phone id is :"+id+"\n My phone type: "+name +"\n My phno ammount is :"+phnoAmount);}
	
	private void phoneInfo(int id ,String name,float phnoAmount,long clientPhno) {
		System.out.println("My phone id is :"+id+"\n My  phone type: "+name+"\n My phno ammount is :"+phnoAmount+"\n My Client Phno is :"+clientPhno);}
	
	private void phoneInfo(String clientName,int clientId,float phnoAmount,long clientPhno) {
		System.out.println("My client name is:"+clientName+"\n My client Id :"+clientId +"\n My phno Amount is :"+phnoAmount+"\n My Client Phno is :"+clientPhno);}
	
	public static void main(String[] args) {
		Phone c = new Phone();
		c.phoneInfo();
		c.phoneInfo(335);
		
		c.phoneInfo(24, "oppo13", 3657468.3655784f);
		c.phoneInfo(53456, "oppoA12",536899.27535f, 64565476829l);
		c.phoneInfo("Nithya", 123, 42517188.2567f, 625732982073l);
	}
		
	
		
	}
	
		
		

	


