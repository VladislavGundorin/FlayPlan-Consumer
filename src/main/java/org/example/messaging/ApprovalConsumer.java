package org.example.messaging;

import org.example.dtos.ApprovalDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApprovalConsumer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${spring.rabbitmq.exchange}")
    public String exchangeName;

    @RabbitListener(queues = "approval.requests.queue")
    public void receiveApprovalRequest(ApprovalDTO approvalDTO) {
        try {
            System.out.println("Received approval request: " + approvalDTO);

            if (approvalDTO.getStatus() == null || approvalDTO.getApprovedBy() == null) {
                System.out.println("Invalid approval request data");
                return;
            }
            sendApprovalUpdateMessage(approvalDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendApprovalUpdateMessage(ApprovalDTO approvalDTO) {
        try {
            amqpTemplate.convertAndSend(exchangeName, "approval.update", approvalDTO);
            System.out.println("Sent approval update message: " + approvalDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
