package com.material.patterns.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		} else

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
				return new Circle();
			} else

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
					return new Rectangle();
				} else

		if (shapeType.equalsIgnoreCase("SQUARE")) {
						return new Square();
					}
		return null;
	}
}
