
package br.com.fiap.sprint.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessage(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
