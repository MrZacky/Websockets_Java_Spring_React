package com.lugamedo.socket.io.communication.websocket.controller;

import com.lugamedo.socket.io.communication.websocket.model.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketRestController {

    private final SimpMessagingTemplate template;

    public WebSocketRestController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @PostMapping("/send")
    public ResponseEntity<Void> sendMessage(@RequestBody MessageDto messageDto) {
        template.convertAndSend("/topic/message", messageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @MessageMapping("/sendMessage")
    public void receiveMessage(@Payload MessageDto messageDto) {
        // receive message from client
    }

    @SendTo("/topic/message")
    public MessageDto broadcastMessage(@Payload MessageDto messageDto) {
        return messageDto;
    }
}