import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        
        
        //CREA BOTONES
        Button btn = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        
        
        //ESCRIBE EN LOS BOTONES
        btn.setText("Say 'Hello World'");
        btn2.setText("Say 'Hello World'");
        btn3.setText("Say 'Hello World'");
        btn4.setText("Say 'Hello World'");
        btn5.setText("Say 'Hello World'");
       
        
        //CREA EL GRIDPANE
        GridPane gp1 =new GridPane();
        
        
        //SET ESPACIO ENTRE CELDAS
        gp1.setHgap(30);
        gp1.setVgap(10);
        
        
        
        gp1.add(btn, 1,1);
        gp1.add(btn2, 2, 2);
        gp1.add(btn3, 2, 3);
        gp1.add(btn4, 1, 4);
        gp1.add(btn5, 2, 5);
        
        
        
        
        
        //BTN SETONACTION // AL PULSARLO IMPRIME EN CONSOLA
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Yoo");
            }
        });
        
       
        
        
        
        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(gp1);
        
        primaryStage.setScene(new Scene(root, 1920, 1050));
        primaryStage.show();
    }
}
       