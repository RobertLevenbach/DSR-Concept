import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// JAVAFX: https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.html
//https://docs.oracle.com/javafx/2/overview/jfxpub-overview.html
public class Frame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("DSR-C!");
        Button btn = new Button("Say 'Hello World'");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        Pane root = new Pane();
        //Set Frame
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
        //Add button1
        btn.setLayoutX(0);
        btn.setLayoutY(primaryStage.getMaxHeight());
        root.getChildren().add(btn);
        //Add button2
        btn.setLayoutX(0);
        btn.setLayoutY(0);


    }


}
