package com.training.kafkademo;

import com.training.kafkademo.configuration.AppConfig;
import com.training.kafkademo.controller.ReaderThread;
import com.training.kafkademo.controller.WriterThread;
import com.training.kafkademo.documentandentity.Employee;
import com.training.kafkademo.service.MyFileHandlerServices;
import com.training.kafkademo.service.impl.CSVFileHandlerServicesImplementation;
import com.training.kafkademo.service.impl.JSONFileHandlerServicesImplementation;
import com.training.kafkademo.service.impl.XMLFileHandlerServicesImplementation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.ApplicationContext;
import sun.nio.ch.ThreadPool;


@SpringBootApplication
public class KafkademoApplication {

<<<<<<< HEAD
	public static void main(String[] args)
    {
=======

	public static void main(String[] args) {
>>>>>>> c429f1a8f79141faa0bcce09728233639e9fa8d2
		SpringApplication.run(KafkademoApplication.class, args);
	}


}

