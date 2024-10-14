package com.example.springbootwebsocketangularui001.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwebsocketangularui001.dto.Message;
import com.example.springbootwebsocketangularui001.services.WebsocketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostToMessageBoardController {

    @Autowired
    private WebsocketService service;

    @PostMapping("/posttomsgboard")
    public void  postMethodName(@RequestBody final Message message) {
        
        System.out.println("Service message sent : " + message.getMessageContent());
        service.postToMessageBoard(message.getMessageContent());
    }
    

}
