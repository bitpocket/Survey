/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Leon
 */
public class Survey {
    public String Title;
    public String Author;
    public String Date;
    public String Description;
    public ArrayList<Question> Questions;

    public Question GetFirstQuestion() {
        if (Questions != null && Questions.size()>0)
            return Questions.get(0);
        else
            return null;
    }

    public Question GetNextQuestion(Answer answer) {
        Question result;
        Question currentQuestion = GetQuestion(answer.QuestionId);

        int nextQuestionId = GetNextQuestionId(currentQuestion, answer);
        
        result = GetQuestion(nextQuestionId);
        return result;
    }

    private Question GetQuestion(int QuestionId) {
        for (int i=0; i<Questions.size();i++)
            if (Questions.get(i).Id == QuestionId)
                return Questions.get(i);
        
        return null;
    }

    private int GetNextQuestionId(Question currentQuestion, Answer answer) {          
        if (currentQuestion.QuestionType == QuestionType.SingleChoice)
        {
            PossibleAnswer possibleAnswer = currentQuestion.GetPossibleAnswer(answer.Index);
            return possibleAnswer.NextQuestionId;
            
        }else
            return currentQuestion.DefaultNextQuestionId;
    }
}
