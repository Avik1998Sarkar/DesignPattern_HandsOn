package com.cognizant;

public class Client {
	public static void main(String[] args) {
		IChatMediator c = new ChatMediator();
		IUser u1 = new BasicUser(c, "Avik1");
		IUser u2 = new BasicUser(c, "Avik2");
		IUser u3 = new PremiumUser(c, "Avik3");
		IUser u4 = new PremiumUser(c, "Avik4");
		System.out.println("------Avik1 Broadcast--------");
		u1.sendMessage("This is Avik1");
		System.out.println("------Avik2 Broadcast--------");
		u2.sendMessage("This is Avik2");
		System.out.println("------Avik3 Broadcast--------");
		u3.sendMessage("This is Avik3");
		System.out.println("------Avik4 Broadcast--------");
		u4.sendMessage("This is Avik4");
	}

}
