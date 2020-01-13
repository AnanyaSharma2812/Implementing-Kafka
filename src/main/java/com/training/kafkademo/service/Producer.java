package com.training.kafkademo.service;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.training.kafkademo.documentandentity.Employee;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;

import java.util.ArrayList;
import java.util.List;

public class Producer {
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String kafkaServers;
//
//    public MyCollection(){
//
//    }
//
//    @Bean
//    public ProducerFactory<String, String> getProducer() {
//        List<Employee> configProp = new ArrayList<>();
//        configProp.add(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaServers);
//        configProp.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        configProp.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        return new DefaultKafkaProducerFactory<>(configProp);
//    }
}
