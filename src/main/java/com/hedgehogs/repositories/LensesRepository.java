package com.hedgehogs.repositories;

import com.hedgehogs.entities.Lenses;

import java.util.ArrayList;
import java.util.List;

//DAO слой для сущности Линзы

public class LensesRepository {
	List<Lenses> lensesList = new ArrayList<>();
	public List<Lenses> findAll(){ return lensesList;	}
	//Операции CRUD
	//Чтение
	public Lenses findByOne(Long id){
		for(Lenses o : lensesList){
			if(o.getId().equals(id)){
				return o;
			}
		}
		return null;
	}
	//Запись и обновление
	public Lenses saveOrUpdate(Lenses lenses){
		lensesList.add(lenses);
		return lenses;
	}

	//Удаление
	public void delete(Lenses lenses){lensesList.remove(lenses);}


}
