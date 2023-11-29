import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.stage.StageStyle;
import javafx.geometry.Pos;
import java.util.Random;
import java.nio.charset.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter; 
import java.awt.Insets;


public class FashionCalc extends Application {
    
    Stage window;
    Scene scene1, scene2, scene3;
    int windowX = 320;
    int windowY = 568;
    
    public static void main(String[] args) {
        launch(args);
    }
    public static void test() {
        
    }
    public static void createConf() {
    
    //Create Configuration File
    try {
      File conf = new File("anon.conf");
      if (conf.createNewFile()) {
        System.out.println("File created: " + conf.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    //Write To Configuration File
    try {
      FileWriter myWriter = new FileWriter("anon.conf");
      
      myWriter.close();
      System.out.println("Successfully wrote to file.");
    } catch (IOException e) {
      System.out.println("An IO Exception Occured.");
      //e.printStackTrace();
    }
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setResizable(false);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        
        /*
        //Labels
        Label LABmenu = new Label("Anonimity Tool GUI");
        Label LABmacAddress = new Label("Mac Address Randomizer");
        Label LABnameChanger = new Label("Name Changer");
        Label LABcolon = new Label(":");
        Label LABcolon1 = new Label(":");
        Label LABcolon2 = new Label(":");
        Label LABcolon3 = new Label(":");
        Label LABcolon4 = new Label(":");
        
        //Text Field Mac Address
        TextField TEXTmacAddress = new TextField();
        TEXTmacAddress.setPrefColumnCount(2);
        TextField TEXTmacAddress1 = new TextField();
        TEXTmacAddress1.setPrefColumnCount(2);
        TextField TEXTmacAddress2 = new TextField();
        TEXTmacAddress2.setPrefColumnCount(2);
        TextField TEXTmacAddress3 = new TextField();
        TEXTmacAddress3.setPrefColumnCount(2);
        TextField TEXTmacAddress4 = new TextField();
        TEXTmacAddress4.setPrefColumnCount(2);
        TextField TEXTmacAddress5 = new TextField();
        TEXTmacAddress5.setPrefColumnCount(2);
        
        //Text Field Name Changer
        
        TextField TEXTnameChanger = new TextField();
        TEXTnameChanger.setPrefColumnCount(10);
        
        //Button 1
        Button BUTTtoMacAdd = new Button("Mac Address");
        BUTTtoMacAdd.setOnAction(e -> window.setScene(scene2));  //super duper important
        
        //Button Back for Mac Address
        Button BUTTtoMenu2 = new Button("Back");
        BUTTtoMenu2.setOnAction(e -> window.setScene(scene1));
        
        //Button To Name Changer
        Button BUTTtoNameChange = new Button("Name Changer");
        BUTTtoNameChange.setOnAction(e -> window.setScene(scene3)); 

        //Button Apply Custom Name
        Button BUTTnameApply = new Button("Apply");
        BUTTnameApply.setOnAction(e -> window.setScene(scene3));
        
        //Button Test
        Button BUTTtest = new Button("Test");
        BUTTtest.setOnAction(e -> test());
        */
        
        Label LABhome = new Label("Home");
        Label LABcalc = new Label("Calculator");
        Label LABsett = new Label("Settings");
       
        //Buttons
        
        //Button Menu
        Button BUTTtoMenu = new Button("Menu");
        BUTTtoMenu.setOnAction(e -> window.setScene(scene1));  
        
        //Button Calculator
        Button BUTTtoCalc = new Button("Calculator");
        BUTTtoCalc.setOnAction(e -> window.setScene(scene2));  
        
        //Button Settings
        Button BUTTtoSett = new Button("Settings");
        BUTTtoSett.setOnAction(e -> window.setScene(scene3));  
        
        //Button Menu1
        Button BUTTtoMenu1 = new Button("Menu");
        BUTTtoMenu1.setOnAction(e -> window.setScene(scene1));  
        
        //Button Calculator1
        Button BUTTtoCalc1 = new Button("Calculator");
        BUTTtoCalc1.setOnAction(e -> window.setScene(scene2));  
        
        //Button Settings1
        Button BUTTtoSett1 = new Button("Settings");
        BUTTtoSett1.setOnAction(e -> window.setScene(scene3));  
        
        //Button Menu2
        Button BUTTtoMenu2 = new Button("Menu");
        BUTTtoMenu2.setOnAction(e -> window.setScene(scene1));  
        
        //Button Calculator2
        Button BUTTtoCalc2 = new Button("Calculator");
        BUTTtoCalc2.setOnAction(e -> window.setScene(scene2));  
        
        //Button Settings2
        Button BUTTtoSett2 = new Button("Settings");
        BUTTtoSett2.setOnAction(e -> window.setScene(scene3)); 
        //Button Exit
        Button BUTTexit = new Button("Exit");
        BUTTexit.setOnAction(e -> System.exit(0)); 
        
        //Layouts
        VBox LAYHome = new VBox(20); 
        VBox LAYCalc = new VBox(20);
        VBox LAYSettings= new VBox(20);
        
        VBox LAYMenuHome = new VBox(20); 
        VBox LAYMenuCalc = new VBox(20);
        VBox LAYMenuSettings= new VBox(20);
        
        VBox LAYContentHome = new VBox(20);
        VBox LAYContentCalc = new VBox(20);
        VBox LAYContentSettings = new VBox(20);
        
        VBox LAYLabelHome = new VBox(20);
        VBox LAYLabelCalc = new VBox(20);
        VBox LAYLabelSettings = new VBox(20);
        
        HBox HLAYmenu = new HBox(BUTTtoMenu, BUTTtoCalc, BUTTtoSett);
        HBox HLAYmenu1 = new HBox(BUTTtoMenu1, BUTTtoCalc1, BUTTtoSett1);
        HBox HLAYmenu2 = new HBox(BUTTtoMenu2, BUTTtoCalc2, BUTTtoSett2);
        
        //Set Margins
        HLAYmenu.setPrefWidth(100);
        HLAYmenu.setPrefHeight(100);
        
        //Set Margins 1
        HLAYmenu1.setPrefWidth(100);
        HLAYmenu1.setPrefHeight(100);
        
        //Set Margins 2
        HLAYmenu2.setPrefWidth(100);
        HLAYmenu2.setPrefHeight(100);
        
        //Horizontal Spacing
        HLAYmenu.setSpacing(10);
        HLAYmenu1.setSpacing(10);
        HLAYmenu2.setSpacing(10);
        
        //Alignment
        LAYMenuHome.setAlignment(Pos.BOTTOM_CENTER);
        HLAYmenu.setAlignment(Pos.CENTER);
        LAYMenuCalc.setAlignment(Pos.BOTTOM_CENTER);
        HLAYmenu1.setAlignment(Pos.CENTER);
        LAYMenuSettings.setAlignment(Pos.BOTTOM_CENTER);
        HLAYmenu2.setAlignment(Pos.CENTER);
        
        LAYLabelHome.setAlignment(Pos.TOP_CENTER);
        LAYLabelCalc.setAlignment(Pos.TOP_CENTER);
        LAYLabelSettings.setAlignment(Pos.TOP_CENTER);
        
        //Add Buttons
        LAYMenuHome.getChildren().addAll(HLAYmenu);
        LAYMenuCalc.getChildren().addAll(HLAYmenu1);
        LAYMenuSettings.getChildren().addAll(HLAYmenu2);
          
        LAYMenuHome.getChildren().addAll(LABhome);        
        LAYMenuCalc.getChildren().addAll(LABcalc);
        LAYMenuSettings.getChildren().addAll(LABsett);
        
        //Set Size 0
        BUTTtoCalc.setMinWidth(80);
        BUTTtoMenu.setMinWidth(80);
        BUTTtoSett.setMinWidth(80);
        
        BUTTtoCalc.setMinHeight(80);
        BUTTtoMenu.setMinHeight(80);
        BUTTtoSett.setMinHeight(80);
        
        //Set Size 1
        BUTTtoCalc1.setMinWidth(80);
        BUTTtoMenu1.setMinWidth(80);
        BUTTtoSett1.setMinWidth(80);
        
        BUTTtoCalc1.setMinHeight(80);
        BUTTtoMenu1.setMinHeight(80);
        BUTTtoSett1.setMinHeight(80);
        
        //Set Size 2
        BUTTtoCalc2.setMinWidth(80);
        BUTTtoMenu2.setMinWidth(80);
        BUTTtoSett2.setMinWidth(80);
        
        BUTTtoCalc2.setMinHeight(80);
        BUTTtoMenu2.setMinHeight(80);
        BUTTtoSett2.setMinHeight(80);
        
        //Assign Layouts to Scenes
        scene1 = new Scene(LAYMenuHome, windowX, windowY);
        scene2 = new Scene(LAYMenuCalc, windowX, windowY);
        scene3 = new Scene(LAYMenuSettings, windowX, windowY);
        
        window.setScene(scene1);
        window.setTitle("Fashion Calculator");
        window.show();
        
    }
}