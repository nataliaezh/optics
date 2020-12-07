package com.hedgehogs;

import com.hedgehogs.entities.Glasses;
import com.hedgehogs.entities.Lenses;
import com.hedgehogs.repositories.LensesRepository;
import com.hedgehogs.services.LensesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.jmx.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.security.ProtectionDomain;

/**
 * @author natalya_ezhkova@mail.ru
 */
@Configuration
@ComponentScan("com.hedgehogs")
public class Launcher {
}
