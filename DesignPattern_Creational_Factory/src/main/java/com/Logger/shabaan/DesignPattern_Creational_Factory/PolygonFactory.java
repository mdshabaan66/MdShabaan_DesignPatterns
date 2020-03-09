package com.Logger.shabaan.DesignPattern_Creational_Factory;

class PolygonFactory {
	public static Polygon getInstance(String type,int side) {
		if(type=="Quadrilateral") {
			return new Quadrilateral(side);
		}
		else if(type=="Pentagon") {
			return new Pentagon(side);
		}
			else if(type=="Hexagon") {
				return new Hexagon(side);
		}
		return null;
	}
}
