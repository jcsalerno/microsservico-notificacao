package com.salerno.notificacao.config;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitQueueConfiguration {

    @Bean
    public Queue propostaPendenteQueue(@Value("${rabbitmq.queue.proposta.pendente}") String queueName) {
        return new Queue(queueName, true);
    }
}
