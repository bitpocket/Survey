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
public class Question {
    public int Id;    
    public String MinimalPointToGetNextQuestion;
    public QuestionType QuestionType;
    public String QuestionText;
    public int DefaultNextQuestionId;
    public ArrayList<PossibleAnswer> PossibleAnswers;

    PossibleAnswer GetPossibleAnswer(int AnswerIndex) {
        for (int i=0; i<PossibleAnswers.size();i++)
            if (PossibleAnswers.get(i).Id == AnswerIndex)
                return PossibleAnswers.get(i);
        
        return null;
    }
}
