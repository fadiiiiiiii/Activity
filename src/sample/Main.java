package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.Year;

public class Main extends Application {
    private Label Title,FirstName,LastName,Year,Month,Day,output;
    private TextField firstName,lastName,year,month,day;
    private Button Calculate;
    private VBox Root,YearBox,MonthBox,DayBox;
    private HBox dateBox;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Title =new Label("HeartRate Calculator");
        Title.setStyle("-fx-font:26px Arial");
        FirstName =new Label("First Name");
        LastName =new Label("Last Name");
        Year =new Label("Year");
        Month=new Label("Month");
        Day=new Label("Day");
        output=new Label();
        firstName=new TextField();
        lastName=new TextField();
        year=new TextField();
        month=new TextField();
        day=new TextField();
        Calculate=new Button("Calculate Heart Rate");
        primaryStage.setTitle("181380043 activity 4");
        YearBox=new VBox();
        YearBox.getChildren().addAll(Year,year);
        MonthBox=new VBox();
        MonthBox.getChildren().addAll(Month,month);
        DayBox=new VBox();
        DayBox.getChildren().addAll(Day,day);
        dateBox=new HBox();
        dateBox.getChildren().addAll(YearBox,MonthBox,DayBox);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
