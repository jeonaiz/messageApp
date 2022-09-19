package kg.megacom.messageapp.service;

import kg.megacom.messageapp.model.Subscriber;
import kg.megacom.messageapp.service.impl.SubscriberServiceImpl;

public interface SubscriberService {
    SubscriberService INSTANCE = new SubscriberServiceImpl();

    Subscriber findSubscriberByPhone(String phone);

    Subscriber findSubscriberById(int id);

    boolean deactivateSubscriber(String phone);
}
