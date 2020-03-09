package com.Logger.shabaan.DesignPattern_Creational_Factory;

public class FactoryExample {

	public static void main(String[] args) {
		Polygon Quadrilateral =PolygonFactory.getInstance("Quadrilateral",4);
		System.out.println(Quadrilateral);;
		Polygon Pentagon =PolygonFactory.getInstance("Pentagon",5);
		System.out.println(Pentagon);;
		Polygon Hexagon =PolygonFactory.getInstance("Hexagon",6);
		System.out.println(Hexagon);;

	}

}
