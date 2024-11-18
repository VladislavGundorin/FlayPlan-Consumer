package org.example.conf;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue approvalRequestsQueue() {
        return new Queue("approval.requests.queue", true);
    }
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("flayplan.exchange");
    }
    @Bean
    public Binding approvalRequestsBinding() {
        return BindingBuilder.bind(approvalRequestsQueue()).to(exchange()).with("approval.requests");
    }
}