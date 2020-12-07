package com.hedgehogs.services;

import com.hedgehogs.entities.Glasses;
import com.hedgehogs.entities.Lenses;
import com.hedgehogs.entities.Rim;
import com.hedgehogs.repositories.GlassesRepository;
import com.hedgehogs.repositories.LensesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class GlassesService extends Glasses {
	private GlassesRepository glassesRepository;
	private Glasses glasses;
	private Lenses lenses;
	private Rim rim;

	public GlassesService() {
	}

	public GlassesService(Glasses glasses, Lenses lenses, Rim rim) {
		this.glasses = glasses;
		this.lenses = lenses;
		this.rim = rim;
	}

	public GlassesService(Long id, Rim rim, Lenses lenses, GlassesRepository glassesRepository, Glasses glasses, Lenses lenses1, Rim rim1, List<Glasses> glassesList) {
		super(id, rim, lenses);
		this.glassesRepository = glassesRepository;
		this.glasses = glasses;
		this.lenses = lenses1;
		this.rim = rim1;
		this.glassesList = glassesList;
	}

	public Glasses getGlasses() {
		return glasses;
	}

	public void setGlasses(Glasses glasses) {
		this.glasses = glasses;
	}

	public Lenses getLenses() {
		return lenses;
	}

	public void setLenses(Lenses lenses) {
		this.lenses = lenses;
	}

	public Rim getRim() {
		return rim;
	}

	public void setRim(Rim rim) {
		this.rim = rim;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GlassesService that = (GlassesService) o;
		return Objects.equals(glasses, that.glasses) &&
			   Objects.equals(lenses, that.lenses) &&
			   Objects.equals(rim, that.rim);
	}

	@Override
	public int hashCode() {
		return Objects.hash(glasses, lenses, rim);
	}

	public void doGlasses() {
		rim.choosing();
		lenses.processing();
		System.out.println("Ваши очки готовы!");
	}

	@Override
	public String toString() {
		return "GlassesService{" +
			   "glasses=" + glasses +
			   ", lenses=" + lenses +
			   ", rim=" + rim +
			   '}';
	}

	public void setGlassesRepository(GlassesRepository glassesRepository) {
		this.glassesRepository = glassesRepository;
	}

	public void setGlassesList(List<Glasses> glassesList) {
		this.glassesList = glassesList;
	}

	public GlassesRepository getGlassesRepository() {
		return glassesRepository;
	}
	List<Glasses> glassesList = new ArrayList<>();
	public List<Glasses> getGlassesList() {
		return glassesList;
	}

	public void setGlassesRepository(LensesRepository glassesRepository) {
	}

	List<GlassesService> list = new ArrayList<>();

	public List<GlassesService>  findAll(){ return list;	}
	//Операции CRUD
	//Чтение
	/*
	public Glasses findByOne(Long id){
		for(Glasses o : glassesList){
			if(o.getId().equals(id)){
				return o;
			}
		}
		return null;
	}
	public Glasses findByOne(Long id){
		for(Glasses o : glassesList){
			if(o.getId().equals(id)){
				return o;
			}
		}
		return null;
	}

	//Запись и обновление
/*	public Glasses saveOrUpdate(Glasses glasses){
		glassesList.add(glasses);
		return glasses;
	}

 */
	public GlassesService saveOrUpdate(GlassesService glasses){
		list.add(glasses);
		return glasses;
	}

	//Удаление
	public void delete(Glasses glasses){glassesList.remove(glasses);}
}
