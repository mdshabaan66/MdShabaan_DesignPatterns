package com.Logger.shabaan.DesignPattern_creational_Singleton;

public class SingletonExample {

	public static void main(String[] args) {
		SingletonImplementation instance =SingletonImplementation.getInstance();
		System.out.println(instance);
		SingletonImplementation instance2 =SingletonImplementation.getInstance();
		System.out.println(instance2);

	}

}
