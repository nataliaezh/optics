package com.hedgehogs.entities;

import com.hedgehogs.services.LensesService;

import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class Glasses {
	private Rim rim;
	private Lenses lenses;
	private LensesService lensesService;
	public Glasses() {
	}

	public Glasses(Lenses lenses) {
		this.lenses = lenses;
	}

	public Glasses(Rim rim, Lenses lenses) {
		this.rim = rim;
		this.lenses = lenses;
	}

		public Glasses(LensesService lensesService) {
		this.lensesService = lensesService;
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

	public LensesService getLensesService() {
		return lensesService;
	}

	public void setLensesService(LensesService lensesService) {
		this.lensesService = lensesService;
	}

	public void doGlasses() {
		rim.choosing();
		lenses.processing();
		System.out.println("Ваши очки готовы!");
		System.out.println("Все заказы в базе:" + lensesService.getLensesRepository().findAll());
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
			   Objects.equals(lenses, glasses.lenses) &&
			   Objects.equals(lensesService, glasses.lensesService);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rim, lenses, lensesService);
	}

	@Override
	public String toString() {
		return "Glasses{" +
			   "rim=" + rim +
			   ", lenses=" + lenses +
			   ", lensesService=" + lensesService +
			   '}';
	}
}
