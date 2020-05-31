package com.sajilni.api.resources;

import com.sajilni.api.entites.Message;
import com.sajilni.api.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageResource {
    MessageService messageService;

    @GetMapping
    public List<Message> getMessages() {
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable("id") long id) {
        return messageService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response addMessage(@RequestBody Message message) throws URISyntaxException {
        Message createdMessage = messageService.add(message);
        return Response
                .created(new URI(String.format("/messages/%s", createdMessage.getId())))
                .entity(createdMessage)
                .build();
    }

    @PutMapping("/")
    public Message updateMessage(@PathVariable("id") long id, @RequestBody Message message) {
        message.setId(id);
        return messageService.update(message);
    }

    @DeleteMapping("/{id}")
    public void removeMessage(@PathVariable("id") long id) {
        messageService.delete(id);
    }


}
