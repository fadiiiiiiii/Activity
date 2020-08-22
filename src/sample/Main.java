package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import java.time.Year;

public class Main extends Application {
    private Label Title,FirstName,LastName,Year,month,Day,output;
    private TextField firstName,lastName,year,MOnth,day;
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
        month=new Label("Month");
        Day=new Label("Day");
        output=new Label();
        firstName=new TextField();
        lastName=new TextField();
        year=new TextField();
        MOnth=new TextField();
        day=new TextField();
        Calculate=new Button("Calculate Heart Rate");
        primaryStage.setTitle("181380043 activity 4");
        YearBox=new VBox();
        YearBox.getChildren().addAll(Year,year);
        MonthBox=new VBox();
        MonthBox.getChildren().addAll(month,MOnth);
        DayBox=new VBox();
        DayBox.getChildren().addAll(Day,day);
        dateBox=new HBox();
        dateBox.getChildren().addAll(YearBox,MonthBox,DayBox);
        dateBox.setSpacing(20);
        Root =new VBox();
        Root.getChildren().addAll(Title,FirstName,firstName,LastName,lastName,dateBox,Calculate,output);
        Root.setSpacing(20);
        Root.setPadding(new Insets(20));
        Calculate.setOnAction(event -> {
            int Year =Integer.parseInt((year.getText()));
            String month=MOnth.getText();
            int Day= Integer.parseInt(day.getText());
            String Fullname=firstName.getText()+" "+lastName.getText();
            Month  montH=getMonth(month);
            int ageInYears=getAgeInYears(Year,montH,Day);
            double maximumHeartRate=getHeartRate(ageInYears);
            String TargetHeartRate= getTargetHeartRate(maximumHeartRate);
            String result = "Name: "+Fullname+"\n"
                            +"Age: "+ageInYears+"\n"
                            +"Maximum Heart Rate"+maximumHeartRate+"\n"
                            +"Target Heart Rate"+TargetHeartRate;
            output.setText(result);
        });
         Scene Screen=new Scene(Root, 500,500);
        primaryStage.setScene(Screen);
        primaryStage.show();
    }

    private int getAgeInYears(int year, Month m,int day) {
        LocalDate today = LocalDate.now();
        LocalDate bd = LocalDate.of(year,m,day);
        Period period = Period.between(bd,today);
        return (period.getYears());
    }

    private Month getMonth(String month){
        Month m;
        if(month.equalsIgnoreCase("January")){
            m = Month.JANUARY;
        }else if(month.equalsIgnoreCase("February")){
            m = Month.FEBRUARY;
        }else if(month.equalsIgnoreCase("March")){
            m = Month.MARCH;
        }else if(month.equalsIgnoreCase("april")){
            m = Month.APRIL;
        }
        else if(month.equalsIgnoreCase("may")){
            m = Month.MAY;
        }
        else if(month.equalsIgnoreCase("june")){
            m = Month.JUNE;
        }
        else if(month.equalsIgnoreCase("July")){
            m = Month.JULY;
        }
        else if(month.equalsIgnoreCase("August")){
            m = Month.AUGUST;
        }
        else if(month.equalsIgnoreCase("September")){
            m = Month.SEPTEMBER;
        }
        else if(month.equalsIgnoreCase("October")){
            m = Month.OCTOBER;
        }
        else if(month.equalsIgnoreCase("NOVEMBER")){
            m = Month.NOVEMBER;
        }
        else if(month.equalsIgnoreCase("DECEMBER")){
            m = Month.DECEMBER;
        }
        else {
            m = Month.JANUARY;
        }
        return m;
    }
    public double getHeartRate(int year)
    {
        return 220-year;
    }
    public String getTargetHeartRate(double heartRate){
        return (int)(heartRate*0.5)+" - "+(int)(heartRate*0.85);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
