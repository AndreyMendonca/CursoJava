package entities;

import entities.enuns.Color;

public abstract class AbstractShape implements Shape{
	private Color color;
	
	public AbstractShape() {
		
	}
	public AbstractShape(Color color) {
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
