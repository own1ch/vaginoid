import back.MathOperations;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static final TextField firstField = new TextField();
    private static final TextField secondField = new TextField();
    private static final Button resultBtn = new Button("Просуммировать числа!");
    private static final Label resultLabel = new Label("Здесь будет результат суммирования");
    private static final Button btn = new Button();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        btn.setText("Say 'Hello World'");
        btn.setOnAction(e ->
                System.out.println("Hello World!"));

        resultBtn.setOnAction(event -> {
            resultLabel.setText(String.valueOf(MathOperations.sum(Double.parseDouble(firstField.getText()), Double.parseDouble(secondField.getText()))));
        });
        StackPane root = new StackPane();
        root.getChildren().add(createTestPane());
        primaryStage.setScene(new Scene(root, 1000, 400));
        primaryStage.show();
    }

    private Pane createTestPane() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.add(btn, 0, 0);
        grid.add(new Label("Впишите первое число:"), 1, 0);
        grid.add(firstField, 1, 1);
        grid.add(new Label("Впишите второе число:"), 2, 0);
        grid.add(secondField, 2, 1);
        grid.add(resultBtn, 3, 1);
        grid.add(resultLabel, 4, 1);
        return grid;
    }
}
