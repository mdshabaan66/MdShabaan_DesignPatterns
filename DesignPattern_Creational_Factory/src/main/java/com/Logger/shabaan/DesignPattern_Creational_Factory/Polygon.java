package com.Logger.shabaan.DesignPattern_Creational_Factory;

abstract class Polygon {
	public abstract int getSide();
	public String toString() {
		return "No of side = "+this.getSide();
		}
}
