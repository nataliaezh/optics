package com.hedgehogs.repositories;

import com.hedgehogs.entities.Lenses;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LensesRepository {
	List<Lenses> glassesList = new ArrayList<>();
	public List<Lenses> findAll(){ return glassesList;	}

	public Lenses findByOne(Long id){
		for(Lenses o : glassesList){
			if(o.getId().equals(id)){
				return o;
			}
		}
		return null;
	}

	public Lenses save(Lenses lenses){
		glassesList.add(lenses);
		return lenses;
	}

	public void delete(Lenses lenses){glassesList.remove(lenses);}
}
