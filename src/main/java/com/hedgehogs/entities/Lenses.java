package com.hedgehogs.entities;

import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 */

//Сущность Линзы, описывает линзы, которые будут вставлены в очки при их изготовлении

public class Lenses {
	private Long id;
	private String diopters;
	private String size;


	public Lenses() {
	}

	public Lenses(Long id, String diopters, String size) {
		this.id = id;
		this.diopters = diopters;
		this.size = size;
	}

	public Long getId() { return id;}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiopters() {
		return diopters;
	}

	public void setDiopters(String diopters) {
		this.diopters = diopters;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void processing() {
		System.out.println("Линзы вставлены в оправу");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Lenses lenses = (Lenses) o;
		return Objects.equals(id, lenses.id) &&
			   Objects.equals(diopters, lenses.diopters) &&
			   Objects.equals(size, lenses.size);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, diopters, size);
	}

	@Override
	public String toString() {
		return "Линзы{" +
			   "идентификационный номер=" + id +
			   ", диоптрии='" + diopters + '\'' +
			   ", размер='" + size + '\'' +
			   '}';
	}
}
