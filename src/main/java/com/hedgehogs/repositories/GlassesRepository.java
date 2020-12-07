package com.hedgehogs.repositories;

import com.hedgehogs.entities.Glasses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class GlassesRepository {
	List<Glasses> glassessList = new ArrayList<>();
	public List<Glasses> findAll(){ return glassessList;	}
	//Операции CRUD
	//Чтение
	public Glasses findByOne(Long id){
		for(Glasses o : glassessList){
			if(o.getId().equals(id)){
				return o;
			}
		}
		return null;
	}
	//Запись и обновление
	public Glasses saveOrUpdate(Glasses glasses){
		glassessList.add(glasses);
		return glasses;
	}

	//Удаление
	public void delete(Glasses glasses){glassessList.remove(glasses);}


}


