package com.Logger.shabaan.DesignPattern_creational_Singleton;

public class SingletonImplementation {
	private static SingletonImplementation instance =new SingletonImplementation();
	private SingletonImplementation() {}
	public static SingletonImplementation getInstance() {
		return instance;
	}
}