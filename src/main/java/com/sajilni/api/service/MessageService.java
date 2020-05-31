package com.sajilni.api.service;

import com.sajilni.api.database.DatabaseClass;
import com.sajilni.api.entites.Message;
import com.sajilni.api.exception.DataNotFoundException;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Service
public class MessageService implements CommonService<Message> {
    private Map<Long, Message> messages = DatabaseClass.getMessages();

    @Override
    public List<Message> getAll() {
        return new ArrayList<>(messages.values());
    }

    @Override
    public Message get(long id) {
        if (messages.get(id) == null)
            throw new DataNotFoundException("Message not found");
        return messages.get(id);
    }

    public List<Message> getAllMessagesForYear(int year) {
        List<Message> messagesForYears = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (Message message : messages.values()) {
            calendar.setTime(message.getCreated());
            if (calendar.get(Calendar.YEAR) == year)
                messagesForYears.add(message);
        }
        return messagesForYears;
    }

    public List<Message> getAllMessagesPaginated(int start, int size) {
        List<Message> list = new ArrayList<Message>(messages.values());
        return list.subList(start, start + size);
    }


    public Message add(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message delete(long id) {
        return messages.remove(id);
    }

    public Message update(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }


}
