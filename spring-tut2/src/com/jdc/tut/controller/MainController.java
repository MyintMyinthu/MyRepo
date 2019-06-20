package com.jdc.tut.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

@Controller
public class MainController implements Initializable {
	
	@FXML
	private TextField name;
	@FXML
	private TableView<String>view;
	
	@FXML
	public void add() {
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
