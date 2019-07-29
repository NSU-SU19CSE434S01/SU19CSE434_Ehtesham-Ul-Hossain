/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author rafez
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private JFXTextField nameField;
     
     String ss = nameField.getText();
    
       String htmlCode = "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"	<title>\n" +
"		Curriculum Vitae\n" +
"	</title>\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
"</head>\n" +
"<body>\n" +
"	<Section id=\"Header\">\n" +
"		<div class=\"header\">\n" +
"			<h1>Curriculum Vitae</h1>\n" +
"		</div>\n" +
"	</Section>\n" +
"\n" +
"	<section id=\"name_img\">\n" +
"		<div class=\"name_img\">\n" +
"			<div class=\"name\">\n" +
"				<h3>"+ss+"<h3>\n" +
"				<h4>Address: </h4>\n" +
"				<p> Bashundhora Residential Area</p>\n" +
"			</div>\n" +
"\n" +
"			<div class=\"image\">\n" +
"				<img src=\"img/profile_picture.jpeg\">\n" +
"			</div>\n" +
"		</div>		\n" +
"	</section>\n" +
"\n" +
"	<section id=\"personal_information\">\n" +
"		<div class=\"personal_information\">\n" +
"			<div class=\"info_title\">\n" +
"				<p>PERSONAL INFORMATION</p>\n" +
"			</div>\n" +
"			<div class=\"info\">\n" +
"				<div class=\"info_1\">\n" +
"					<h4>Date of Birth: </h4>\n" +
"					<h4>Age: </h4>\n" +
"					<h4>Merital Status: </h4>\n" +
"					<h4>Nationality: </h4>\n" +
"			</div>\n" +
"				<div class=\"info_2\">\n" +
"					<h4>E-mail: </h4>\n" +
"					<h4>Phone: </h4>\n" +
"					<h4>Religion: </h4>\n" +
"					<h4>Parmanent Address: </h4>\n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"	<section id=\"Education\">\n" +
"		<div class=\"Education\">\n" +
"			<div class=\"Education_Title\">\n" +
"				<p>EDUCATIONAL QUALIFICATION</p>\n" +
"			</div>\n" +
"\n" +
"			<div class=\"Education_details\">\n" +
"				<h4 class=\"Degree_1\">Bachelor of Science In Computer Science And Engineering (BSCSE)</h4>\n" +
"				<h4>Institute: </h4>\n" +
"				<h4>Major: </h4>\n" +
"				<h4>Minor: </h4>\n" +
"				<h4>CGPA: </h4>\n" +
"				<h4>Passing Year: </h4>\n" +
"\n" +
"				<h4 class=\"Degree_1\">Higher Secondary Certificate (H.S.C)</h4>\n" +
"				<h4>Board: </h4>\n" +
"				<h4>Institute: </h4>\n" +
"				<h4>Group: </h4>\n" +
"				<h4>Result: </h4>\n" +
"				<h4>Passing Year: </h4>\n" +
"\n" +
"				<h4 class=\"Degree_1\">Secondary School Certificate (S.S.C)</h4>\n" +
"				<h4>Board: </h4>\n" +
"				<h4>Institute: </h4>\n" +
"				<h4>Group: </h4>\n" +
"				<h4>Result: </h4>\n" +
"				<h4>Passing Year: </h4>\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"	</section>\n" +
"\n" +
"	<section id=\"Skills\">\n" +
"		<div class=\"Skills\">\n" +
"			<div class=\"skills_title\">\n" +
"				<p>SKILLS</p>\n" +
"			</div>\n" +
"		</div>\n" +
"	</section>\n" +
"\n" +
"</body>\n" +
"</html>";
    
    private Label label;
    @FXML
    private JFXButton CVGenerateButton;
   
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       
    }
   
    @FXML
    public void click(ActionEvent event){
        
         File file = new File("C:/Users/rafez/OneDrive/Desktop/CSE434/Project01/resume.html");
         try{
         FileWriter write = new FileWriter(file);
         
         String str = "hellooo";         
         write.write(htmlCode);
         
         write.close();
         }
         catch(IOException e){
           
         }
        System.out.println("Hellooooo");
        
            System.out.println();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    
    
    
    
    
    
 
    
}
