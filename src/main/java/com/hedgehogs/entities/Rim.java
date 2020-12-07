package com.hedgehogs.entities;

import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 */

//Сущность Оправы, описывает оправу, которая будет использована при изготовлении очков

public class Rim {

	private String material;
	private String colour;
	private String frameType;

	public Rim() {
	}

	public Rim(String material, String colour, String frameType) {
		this.material = material;
		this.colour = colour;
		this.frameType = frameType;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFrameType() {
		return frameType;
	}

	public void setFrameType(String frameType) {
		this.frameType = frameType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Rim rim = (Rim) o;
		return Objects.equals(material, rim.material) &&
			   Objects.equals(colour, rim.colour) &&
			   Objects.equals(frameType, rim.frameType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(material, colour, frameType);
	}

	public void choosing() {
		System.out.println("Выбрана оправа.");
	}

	@Override
	public String toString() {
		return "Rim{" +
			   "material='" + material + '\'' +
			   ", colour='" + colour + '\'' +
			   ", frameType='" + frameType + '\'' +
			   '}';
	}
}
