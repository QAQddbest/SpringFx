package com.pdai.javafx.app.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PopoverController implements Initializable {

    public static PopoverController ctrl;
    @FXML
    public VBox options;
    @FXML
    private JFXButton theme;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ctrl = this;
    }

}