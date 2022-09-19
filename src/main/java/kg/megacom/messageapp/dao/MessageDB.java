package kg.megacom.messageapp.dao;

import kg.megacom.messageapp.dao.impl.MessageDBImpl;
import kg.megacom.messageapp.model.Message;

import java.util.List;

public interface MessageDB {
    MessageDB INSTANCE = new MessageDBImpl();

    List<Message> getMessagesBySenderId(int senderId);
}
