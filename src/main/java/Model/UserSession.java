/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adrianrobak
 */
public class UserSession {
    public Survey CurrentSurvey;
    public int UserId;
    public int TotalRate;
    public ArrayList<String> SummaryDecriptionRate = new ArrayList<>();
    public Date DateOfFinish;

    public void SendAnswers(Answer answer) {
        CountPoints(answer);
    }

    private void CountPoints(Answer a) {
        Question q = CurrentSurvey.getQuestion(a.QuestionId);
        if (q!= null){
            PossibleAnswer pa = q.GetPossibleAnswer(a.AnswerID);
            if (pa!= null){
                TotalRate = pa.Rate + TotalRate;
            }
        }
    }
}
