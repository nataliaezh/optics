package com.hedgehogs;

import com.hedgehogs.entities.Glasses;
import com.hedgehogs.entities.Lenses;
import com.hedgehogs.services.LensesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author natalya_ezhkova@mail.ru
 */
public class Launcher {
	private static final Logger log  = LogManager.getLogger(Launcher.class.getName());
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Glasses glasses = context.getBean("glasses", Glasses.class);
		Lenses lenses  = context.getBean("lenses", Lenses.class);
		LensesService lensesService = context.getBean("lensesService", LensesService.class);
			lenses.setId(1L);
			lenses.setDiopters("+1");
			lenses.setSize("5sm");
			log.info("create new lenses");
		System.out.println(lenses);
		//Операции CRUD
		//Чтение
		System.out.println("Все заказы в базе:" + lensesService.getLensesRepository().findAll());
		//Сохранение
		System.out.println("Ваш заказ на линзы : " + lensesService.saveOrUpdateLenses(lenses).toString());
		//Обновление
		lenses.setSize("6sm");
		System.out.println("Ваш заказ на линзы изменен: " + lensesService.saveOrUpdateLenses(lenses).toString());
		//Удаление
		lensesService.deleteLenses((long) 1);
		System.out.println("Ваш заказ на линзы удален");
		glasses.doGlasses();




	}
}
