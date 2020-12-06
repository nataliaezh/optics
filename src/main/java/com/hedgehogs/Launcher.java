package com.hedgehogs;

import com.hedgehogs.entities.Glasses;
import com.hedgehogs.entities.Lenses;
import com.hedgehogs.repositories.LensesRepository;
import com.hedgehogs.services.LensesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class Launcher {
	private static final Logger log  = LogManager.getLogger(Launcher.class.getName());
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Glasses glasses = context.getBean("glasses", Glasses.class);
		Lenses lenses  = context.getBean("lenses", Lenses.class);
		LensesRepository lensesRepository = context.getBean("lensesRepository", LensesRepository.class);
		LensesService lensesService = context.getBean("lensesService", LensesService.class);
			lenses.setId(1L);
			lenses.setDiopters("+1");
			lenses.setSize("5sm");
			log.info("create new lenses");
		System.out.println(lenses);
		System.out.println("Сохранение заказа на изготовление со следующими параметрами: " + glasses.getLensesService().save(lenses).toString());
		glasses.doGlasses();
	}
}
