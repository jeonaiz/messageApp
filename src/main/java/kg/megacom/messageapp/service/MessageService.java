package kg.megacom.messageapp.service;

import kg.megacom.messageapp.model.Message;
import kg.megacom.messageapp.service.impl.MessageServiceImpl;

public interface MessageService {

    MessageService INSTANCE = new MessageServiceImpl();

    boolean sendMessage(String messageText, String recPhone, String senPhone);
}
