package com.changi.record_project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.changi.record_project.dto.ChatRoom;
import com.changi.record_project.entity.User;
import com.changi.record_project.service.ChatService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;


    @RequestMapping("chatList")
    public String chatList(Model model){
        List<ChatRoom> roomList = chatService.findAllRoom();
        model.addAttribute("roomList",roomList);
        return "chatList";
    }


    @PostMapping("/createRoom")  //방을 만들었으면 해당 방으로 가야지.
    public String createRoom(Model model, @RequestParam("name") String name, HttpSession session) {
    	User user =(User) session.getAttribute("user");
    	String username = user.getUserId();
        ChatRoom room = chatService.createRoom(name);
        model.addAttribute("room",room);
        model.addAttribute("username",username);
        return "chatRoom";  //만든사람이 채팅방 1빠로 들어가게 됩니다
    }

    @GetMapping("/chatRoom")
    public String chatRoom(Model model, @RequestParam("roomId") String roomId, HttpSession session){
    	User user =(User) session.getAttribute("user");
    	String username = user.getUserId();
        ChatRoom room = chatService.findRoomById(roomId);
        model.addAttribute("room",room);   //현재 방에 들어오기위해서 필요한데...... 접속자 수 등등은 실시간으로 보여줘야 돼서 여기서는 못함
        model.addAttribute("username",username);
        return "chatRoom";
    }
}