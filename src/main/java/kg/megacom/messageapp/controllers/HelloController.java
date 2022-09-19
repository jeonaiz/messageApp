package kg.megacom.messageapp.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import kg.megacom.messageapp.model.Message;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtMessage;

    @FXML
    private TextField txtSender;

    @FXML
    private TextField txtRecipient;

    private Message message;

    public void setMessage(Message message){
        this.message = message;

        if (this.message != null) {
            txtMessage.setText(this.message.getMsgText());
          //  txtSender.setText(this.message.getSender());
          //  txtRecipient.setText(this.message.getRecipient());
        }

    }
    @FXML
    void onSaveClicked(ActionEvent event) {
    }

    @FXML
    void initialize() {

    }
}
