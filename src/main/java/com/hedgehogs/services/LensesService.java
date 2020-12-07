package com.hedgehogs.services;

import com.hedgehogs.entities.Lenses;
import com.hedgehogs.repositories.LensesRepository;

import java.util.List;

/**
 * @author natalya_ezhkova@mail.ru
 */

//Бизнес-сдлой слой для сущности Линзы

public class LensesService {
	private LensesRepository lensesRepository;
	private Lenses lenses;

	public LensesService() {
	}

	public LensesService(LensesRepository lensesRepository, Lenses lenses) {
		this.lensesRepository = lensesRepository;
		this.lenses = lenses;
	}

	public LensesRepository getLensesRepository() {
		return lensesRepository;
	}

	public void setLensesRepository(LensesRepository lensesRepository) {
		this.lensesRepository = lensesRepository;
	}

	public Lenses getLenses() {
		return lenses;
	}

	public void setLenses(Lenses lenses) {
		this.lenses = lenses;
	}
	//Чтение
	public Lenses getLensestById(Long id) {
		Lenses lenses = lensesRepository.findByOne(id);
		return lenses;
	}
	public List<Lenses> getAllLenses(){
		return lensesRepository.findAll();
	}
	//Запись и обновление
	public  Lenses saveOrUpdateLenses(Lenses lenses){
		if(lenses==null){
			return null;
		}return lensesRepository.saveOrUpdate(lenses);
	}
	//Удаление
	public void deleteLenses(Long id){
		Lenses lenses = lensesRepository.findByOne(id);
		lensesRepository.delete(lenses);
	}
}
