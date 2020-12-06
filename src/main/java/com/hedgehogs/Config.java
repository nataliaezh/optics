package com.hedgehogs;

import com.hedgehogs.entities.Glasses;
import com.hedgehogs.entities.Lenses;
import com.hedgehogs.entities.Rim;
import com.hedgehogs.repositories.LensesRepository;
import com.hedgehogs.services.LensesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author natalya_ezhkova@mail.ru
 */
@Configuration
@ComponentScan("com.hedgehogs")
public class Config {
	@Bean("lenses")
	public Lenses lenses() {
		Lenses lenses = new Lenses();
		return lenses;
	}

	@Bean("rim")
	public Rim rim() {
		Rim rim = new Rim();
		return rim;
	}

	@Bean("glasses")
	public Glasses glasses(){
		Glasses glasses = new Glasses();
		glasses.setLenses(lenses());
		glasses.setRim(rim());
		glasses.setLensesService(lensesService());
		return glasses;
	}

	@Bean("lensesRepository")
	public LensesRepository lensesRepository(){
		LensesRepository lensesRepository = new LensesRepository();
		return lensesRepository;
	}

	@Bean("lensesService")
	public LensesService lensesService(){
		LensesService lensesService = new LensesService();
		lensesService.setLensesRepository(lensesRepository());
		return lensesService;
	}


}
