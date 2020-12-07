package com.hedgehogs.entities;

import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 */

//Описывает сущность Солнцезащитных очков

public class Sunglasses {
	private String brand;
	private String filterUV;

	public Sunglasses() {
	}

	public Sunglasses(String brand, String filterUV) {
		this.brand = brand;
		this.filterUV = filterUV;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFilterUV() {
		return filterUV;
	}

	public void setFilterUV(String filterUV) {
		this.filterUV = filterUV;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sunglasses that = (Sunglasses) o;
		return Objects.equals(brand, that.brand) &&
			   Objects.equals(filterUV, that.filterUV);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, filterUV);
	}

	public void doGlasses() {
		System.out.println("Поздравляем! Вы приобрели очки бренда " + brand+ " с УФ-фильтром: ");
	}

	@Override
	public String toString() {
		return "Sunglasses{" +
			   "brand='" + brand + '\'' +
			   ", filterUV='" + filterUV + '\'' +
			   '}';
	}
}
