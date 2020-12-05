package com.hedgehogs.services;

import com.hedgehogs.entities.Lenses;
import com.hedgehogs.repositories.LensesRepository;

import java.util.List;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class LensesService {
	private LensesRepository lensesRepository;

	public LensesService() {
	}

	public LensesService(LensesRepository lensesRepository) {
		this.lensesRepository = lensesRepository;
	}

	public LensesRepository getLensesRepository() {
		return lensesRepository;
	}

	public void setLensesRepository(LensesRepository lensesRepository) {
		this.lensesRepository = lensesRepository;
	}

	public Lenses geLensestById(Long id) {
		Lenses lenses = lensesRepository.findByOne(id);
		return lenses;
	}
	public List<Lenses> getAllLenses(){
		return lensesRepository.findAll();
	}

	public  Lenses save(Lenses lenses){
		if(lenses==null){
			return null;
		}return lensesRepository.save(lenses);
	}

	public void deleteLenses(Lenses lenses){
		lensesRepository.delete(lenses);
	}
}
