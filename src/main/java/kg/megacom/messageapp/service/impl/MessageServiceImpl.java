package kg.megacom.messageapp.service.impl;

import kg.megacom.messageapp.dao.MessageDB;
import kg.megacom.messageapp.exception.SubscriberBlockedException;
import kg.megacom.messageapp.model.Message;
import kg.megacom.messageapp.model.Subscriber;
import kg.megacom.messageapp.service.MessageService;
import kg.megacom.messageapp.service.SubscriberService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class MessageServiceImpl implements MessageService {


    @Override
    public boolean sendMessage(String messageText, String recPhone, String senPhone) {
        Subscriber recipient = SubscriberService.INSTANCE.findSubscriberByPhone(recPhone);
        Subscriber sender = SubscriberService.INSTANCE.findSubscriberByPhone(senPhone);
        if (recipient.isBlocked()) {
            throw new SubscriberBlockedException("Получатель заблокирован!");
        }

        List<Message> messageList = MessageDB.INSTANCE.getMessagesBySenderId(sender.getId());

        int count=0;

        for (Message item: messageList) {
            LocalDate localDate = null;
            LocalDateTime startOfDay = localDate.atStartOfDay();

            



        }

        return false;
    }
}
