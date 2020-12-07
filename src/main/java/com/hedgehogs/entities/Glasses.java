package com.hedgehogs.entities;

import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 *
 */

////Сущность Очки, описывает очки, которые будут изготовлены
// по индивидуальному заказу в оптике. Реализован метод сборки очков, состоящих из линз и оправы

public class Glasses {
	private Long id;
	private Rim rim;
	private Lenses lenses;

	public Glasses() {
	}

	public Glasses(Lenses lenses) {
		this.lenses = lenses;
	}

	public Glasses(Long id, Rim rim, Lenses lenses) {
		this.id = id;
		this.rim = rim;
		this.lenses = lenses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Rim getRim() {
		return rim;
	}

	public void setRim(Rim rim) {
		this.rim = rim;
	}

	public Lenses getLenses() {
		return lenses;
	}

	public void setLenses(Lenses lenses) {
		this.lenses = lenses;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Glasses glasses = (Glasses) o;
		return Objects.equals(rim, glasses.rim) &&
			   Objects.equals(lenses, glasses.lenses);
		}

	@Override
	public int hashCode() {
		return Objects.hash(rim, lenses);
	}

	@Override
	public String toString() {
		return "Glasses{" +
			   "rim=" + rim +
			   ", lenses=" + lenses +
			   '}';
	}
}
