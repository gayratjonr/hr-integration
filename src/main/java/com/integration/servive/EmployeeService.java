package com.integration.servive;

import com.integration.model.ChangeEmploymentParam;
import com.integration.model.EmployeeITS;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final KafkaTemplate<String, EmployeeITS> kafkaTemplate;

    public EmployeeService(KafkaTemplate<String, EmployeeITS> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendNewEmployee(Object employee){

        Message<Object> message = MessageBuilder
                .withPayload(employee)
                .setHeader(KafkaHeaders.TOPIC, "mvd_employee")
                .build();
        kafkaTemplate.send(message);
    }

    public void sendChangeEmployment(ChangeEmploymentParam employmentParam){

        Message<ChangeEmploymentParam> message = MessageBuilder
                .withPayload(employmentParam)
                .setHeader(KafkaHeaders.TOPIC, "change_employment")
                .build();
        kafkaTemplate.send(message);
    }

    @KafkaListener(topics = "mvd_employee", groupId = "printer")
    public void employeeListener(ConsumerRecord<String, Object> record) {
        Object employee = record.value();
        System.out.println(employee.toString());
    }

    @KafkaListener(topics = "change_employment", groupId = "printer")
    public void changeEmploymentListener(ConsumerRecord<String, Object> record) {
        System.out.println(record.value());
    }
}
