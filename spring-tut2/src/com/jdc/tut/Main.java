package com.jdc.tut;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jdc.tut.controller.MainController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


@SpringBootApplication
public class Main extends Application{
	
	private static ConfigurableApplicationContext ctx;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader= new FXMLLoader(MainController.class.getResource("view/main.fxml"));
		loader.setControllerFactory(ctx::getBean);
		
		primaryStage.setScene(new Scene(loader.load()));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void init() throws Exception {
		super.init();
		ctx=SpringApplication.run(Main.class);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		ctx.close();
	}
	
	public static<T> T getController(Class<T> type ) {
		
		return ctx.getBean(type);
	}

}
