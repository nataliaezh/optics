package com.hedgehogs;

import com.hedgehogs.entities.Lenses;
import com.hedgehogs.entities.Rim;
import com.hedgehogs.services.GlassesService;
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
		GlassesService glasses = context.getBean("glassesService", GlassesService.class);
		glasses.setLenses(new Lenses(1L, "-3", "4sm"));
		glasses.setRim(new Rim("plastic", "brown", "siluet"));
		glasses.saveOrUpdate(glasses);
		log.info("create new glasses");
		System.out.println(glasses);
		//Операции CRUD
		//Чтение
		System.out.println("Все заказы в базе:" + glasses.findAll());
		//Сохранение
		System.out.println("Ваш заказ на очки : " + glasses.saveOrUpdate(glasses).toString());
		System.out.println("База заказов обновлена:" + glasses.findAll());
		//Обновление
		glasses.setRim(new Rim("plastic", "grey", "siluet"));
		System.out.println("Ваш заказ был изменен: " + glasses.saveOrUpdate(glasses).toString());
		//Удаление
		glasses.delete(glasses);
		System.out.println("Ваш заказ удален");
		glasses.doGlasses();
	}
}
