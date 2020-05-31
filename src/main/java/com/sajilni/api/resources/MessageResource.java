package com.sajilni.api.resources;

import com.sajilni.api.entites.Message;
import com.sajilni.api.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageResource {
    MessageService messageService = new MessageService();

    @GetMapping
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable("id") long id) {
        return messageService.getMessage(id);
    }

    @PostMapping
    public Message addMessage(@RequestBody Message message) {
        return messageService.addMessage(message);
    }

    @PutMapping("/")
    public Message updateMessage(@PathVariable("id") long id, @RequestBody Message message) {
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @DeleteMapping("/{id}")
    public void removeMessage(@PathVariable("id") long id) {
        messageService.removeMessage(id);
    }


}
