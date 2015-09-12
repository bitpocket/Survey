/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Answer;
import Model.Model;
import Model.Question;
import Model.QuestionType;
import Viewer.Viewer;
/**
 *
 * @author adrianrobak
 */
public class Controller {
    Viewer Viewer;
    Model Model;
    public Controller() {
        this.Viewer = new Viewer(this);
        this.Model = new Model();
        StartSurvey();
    }
     public void StartSurvey(){
         //Model.LoadSurvey("/Users/adrianrobak/NetBeansProjects/Test/src/Resources/FirstEpicGreatestSurvey.json");
         Model.CurrentSurvey =
                 Model.LoadSurvey("e:\\Projekts\\Git\\Survey\\src\\main\\java\\Resources\\FirstEpicGreatestSurvey.json");
         Model.CurrentQuestion = Model.GetFirstQuestion();
         ShowQuestion();
    }
    public void ShowQuestion(){
        if (Model.CurrentQuestion == null){
                 FinishSurvey();
             }
             else {
                 Viewer.ShowQuestion();
             }
    }
    private void FinishSurvey() {
        Viewer.FinishSurvey();
    }
    public void CheckAnswer(Answer answer){
        Model.CheckAnswer(answer);
        Model.CurrentQuestion = Model.GetNextQuestion(answer);
        ShowQuestion();
    }

    public QuestionType getCurrentQuestionType() {
        return Model.CurrentQuestion.QuestionType;
        
    }
    public Question GetCurrentQuestion(){
        return Model.CurrentQuestion;
    }

    public int getCurrentQuestionId() {
        return Model.CurrentQuestion.Id;
    }
}
