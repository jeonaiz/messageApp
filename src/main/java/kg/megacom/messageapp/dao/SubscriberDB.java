package kg.megacom.messageapp.dao;

import kg.megacom.messageapp.dao.impl.SubscriberDBImpl;
import kg.megacom.messageapp.model.Subscriber;

public interface SubscriberDB {


    SubscriberDB INSTANCE = new SubscriberDBImpl();

    Subscriber findSubcriberByPhone(String phone);

    boolean deactivateSubscriber(String phone);

    Subscriber findSubcriberById(int id);
}
