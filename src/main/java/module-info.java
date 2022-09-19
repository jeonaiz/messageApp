module kg.megacom.messageapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens kg.megacom.messageapp to javafx.fxml;
    exports kg.megacom.messageapp;
    exports kg.megacom.messageapp.controllers;
    opens kg.megacom.messageapp.controllers to javafx.fxml;
}





