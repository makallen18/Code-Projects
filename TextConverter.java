/*

I will be creating a text	converter.		
I	will	create	an	application	that	will	have	a	
series of	button	controls.	One	control	will	convert	text	to	lowercase and
the other	will	convert	them	into	their	position	within	the	alphabet. For example a=1.
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.Scanner;
public class TextConverter extends Application 
{
   //Fields 
   private TextField myTextField;
   private Label resultLabel; 
   private RadioButton LowercaseButton;
   private RadioButton AlphabetButton;
   
   public static void main(String[] args) 
   {
      // Launch application 
      launch(args);
   }
   
   @Override
   //This is going to display the buttons on the screen
   public void start(Stage primaryStage) 
   { 
      //Create a label to display a prompt
      Label promptLabel = new Label("Convert to Lowercase or Alphabetical Postion");
      
      //Create TextField;
      myTextField = new TextField();
      
      //create a RadioButton control 
      LowercaseButton = new RadioButton("Convert to Lowercase");
      AlphabetButton = new RadioButton("Convert to a Alphabetical Postion");
    
      //Selcct the LowercaseButton
      LowercaseButton.setSelected(true);
      
     //Add Buttons to a ToggleGroup
     ToggleGroup radioGroup = new ToggleGroup();
     LowercaseButton.setToggleGroup(radioGroup);
     AlphabetButton.setToggleGroup(radioGroup);
   
     //Create a button to convert
     Button calculateButton = new Button("Convert!");
     
     //Register the event handler
     calculateButton.setOnAction(new CalculateButtonHandler());
     
     //Create an empty label for displaying the results
     resultLabel = new Label();
     
     //Place the promptLabel and my TextField into an HBOX;
     HBox promptHBox = new HBox(10, promptLabel, myTextField);
     //10 pixels spacing them 
     
     //Put radio buttions into an HBOX
     HBox radioHBox = new HBox(20, LowercaseButton, AlphabetButton);
 
     //Put everything into a VBox
     VBox mainVBox = new VBox (10, promptHBox, radioHBox, calculateButton, resultLabel);
     
     //Set the VBoxs alignemnt to the center 
     mainVBox.setAlignment(Pos.CENTER);
     
     //Set the VBox padding to 10 pixels
     mainVBox.setPadding(new Insets(10));
     
     //Create a scence
     Scene scene = new Scene(mainVBox);
     
     //Add scnece to stage
     primaryStage.setScene(scene);
     
     //Set the tittle
     primaryStage.setTitle("Text Converter");
     
     //Show the window
     
     primaryStage.show(); 
   }
 //ends first class

//This is the event handler class 
class CalculateButtonHandler implements EventHandler<ActionEvent>
{
  @Override 
  public void handle(ActionEvent event) 
   {
       if (AlphabetButton.isSelected()) 
       {
        // Convert text to its alphabetical position
         String text = myTextField.getText().toLowerCase();
         char ch = text.charAt(0);
        
         int position = ch - 'a' + 1;
          
        resultLabel.setText("The Alphabetical position of " + ch + " is: " + position);
        } 
        else if (LowercaseButton.isSelected()) 
         {
           // Convert text to lowercase
           String text = myTextField.getText();
           String lowercaseText = text.toLowerCase();
           resultLabel.setText("This text in lowercase: " + lowercaseText);
         }
      }
  } 
  //method 
 //Run again 
 //asking player if they want to play again
 //@return method
 //@NO PARAM

public static boolean runAgain() 
    {
         Scanner readIn = new Scanner(System.in);
      	boolean RunAgain = false; 
      	System.out.println("Do you want to run again?");
      	String answer = readIn.nextLine().toUpperCase();
      	char ans = answer.charAt(0);
      	if(ans == 'Y')
      		RunAgain = true;
      	return RunAgain;
    }
  } 

   
   
   
   
