package kg.megacom.messageapp.dao.impl;

import kg.megacom.messageapp.dao.ConnectionDB;
import kg.megacom.messageapp.dao.MessageDB;
import kg.megacom.messageapp.model.Message;
import kg.megacom.messageapp.model.Subscriber;
import kg.megacom.messageapp.service.SubscriberService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageDBImpl implements MessageDB {
    public List<Message> getMessagesBySenderId(int senderId) {
        Connection connection = null;
        List<Message> messageList = new ArrayList<>();
        try {
            connection = ConnectionDB.INSTANCE.getConnection();
            String query = "SELECT m.id, m.msg_date, s.id, s.phone, m.recipient_id FROM messages m INNER JOIN subscribers s" +
                    " ON m.sender_id = s.id WHERE m.sender_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, senderId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Message message = new Message();
                message.setId(rs.getInt(1));
                String msdDate = rs.getString(2);
                message.setMsgDate(LocalDateTime.parse(msdDate));
                Subscriber sender = new Subscriber();
                sender.setId(rs.getInt(3));
                sender.setPhone(rs.getString(4));
                message.setSender(sender);
                messageList.add(message);
                Subscriber recipient = SubscriberService.INSTANCE.findSubscriberById(rs.getInt(5));
                message.setRecipient(recipient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.INSTANCE.close(connection);
        }
        return messageList;
    }
}
