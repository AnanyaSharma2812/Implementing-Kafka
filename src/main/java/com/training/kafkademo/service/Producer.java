package com.training.kafkademo.service;

import com.training.kafkademo.documentandentity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Producer {
    private static final Logger logger = null;
    private static final String topic="data";

    @Autowired
    private KafkaTemplate<Object, Employee> kafkaTemplate;

    public void sendMessage(Employee employee){
        this.kafkaTemplate.send(topic,employee);
    }
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
