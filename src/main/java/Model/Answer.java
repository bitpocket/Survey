/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author adrianrobak
 */
public class Answer {  //opakowanie dla jednej odpowiedzi
    
    public Answer(int id){
        QuestionId = id;
    }
    public int QuestionId;
    public String AnswerText;
    public int[] AnswerIDs;
    public int AnswerID;
}
