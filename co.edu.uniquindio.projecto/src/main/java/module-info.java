module co.edu.uniquindio.projectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires de.jensd.fontawesomefx;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    opens co.edu.uniquindio.projectofinal to javafx.fxml;
    exports co.edu.uniquindio.projectofinal;
    exports co.edu.uniquindio.projectofinal.controller;
}