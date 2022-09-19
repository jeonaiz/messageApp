package kg.megacom.messageapp.model;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private String msgText;
    private LocalDateTime msgData;
    private Subscriber sender;
    private Subscriber recipient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public LocalDateTime getMsgData() {
        return msgData;
    }

    public void setMsgData(LocalDateTime msgData) {
        this.msgData = msgData;
    }

    public Subscriber getSender() {
        return sender;
    }

    public void setSender(Subscriber sender) {
        this.sender = sender;
    }

    public Subscriber getRecipient() {
        return recipient;
    }

    public void setRecipient(Subscriber recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msgText='" + msgText + '\'' +
                ", msgData=" + msgData +
                ", sender=" + sender +
                ", recipient=" + recipient +
                '}';
    }

    public void setMsgDate(LocalDateTime parse) {

    }
}
