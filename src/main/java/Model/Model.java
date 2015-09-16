/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author adrianrobak
 */
public class Model {
    public Survey CurrentSurvey;
    public Question CurrentQuestion;   
    public Survey LoadSurvey(String fileName) {
        Gson gson = new Gson();
        Survey result=null;
 	try {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		result = gson.fromJson(br, Survey.class);
		System.out.println(result);
 
	} catch (IOException e) {
		e.printStackTrace();
	}                      
        return result;
    }
    
    public UserSession CurrentSession;
    
    public void SaveSurvey(String fileName){
        Survey obj = new Survey();
	Gson gson = new Gson();
	String json = gson.toJson(obj);
	System.out.println(json);  
    }

    public Question GetFirstQuestion() {
        if (CurrentSurvey != null)
            return CurrentSurvey.GetFirstQuestion();
        else
            return null;
    }

    public boolean CheckAnswer(Answer answer) {
        
        return true;
    }

    public Question GetNextQuestion(Answer answer) {
        if (CurrentSurvey != null)
            return CurrentSurvey.GetNextQuestion(answer);
        else
            return null;    
    }
 
}
