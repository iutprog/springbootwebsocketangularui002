package com.example.springbootwebsocketangularui001.services;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.example.springbootwebsocketangularui001.dto.Message;

@Service
public class WebsocketService {

    private SimpMessagingTemplate template;

    public WebsocketService ( SimpMessagingTemplate template){
        this.template = template;
    }

    public void postToMessageBoard( final String msg){

        System.out.println("Message received in Backend" + msg);
       
        Message  message  = new Message(msg);
        template.convertAndSend("/topic/messages", message);
    }
}
