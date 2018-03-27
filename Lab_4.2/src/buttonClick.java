


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class buttonClick extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Label lbl = new Label();
        lbl.setLayoutX(70);
        lbl.setLayoutY(150);
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
        	int counter = 0;
       
            @Override
            	public void handle(ActionEvent event) 
            	{        
        			System.out.println("Hello World!"+ counter);
        			counter++;
        			lbl.setText("Score: "+counter);
            	}
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        root.getChildren().add(lbl);
    }
   
}