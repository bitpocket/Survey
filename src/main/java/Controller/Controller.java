/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Answer;
import Model.Model;
import Model.Os;
import Model.OsType;
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
        
    }
    
    public void StartSurvey(){
        String fileName = "";
        OsType os = Os.getOs();
        
        if (os == OsType.Mac){
            fileName = "/Users/adrianrobak/Dropbox/02.Adrianu/07.Witelon/99.pytania/Survey/src/main/java/Resources/FirstEpicGreatestSurvey.json";
        } else if (os == OsType.Windows) {
            fileName = "e:\\Projekts\\Git\\Survey\\src\\main\\java\\Resources\\FirstEpicGreatestSurvey.json";
        }
            
        Model.CurrentSurvey = Model.LoadSurvey(fileName);
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
    
    public void FinishSurvey() {
        Viewer.FinishSurvey();
    }
    public boolean TryGoToNextQuestion(Answer answer){
        if (Viewer.ValidateAnswers()){
            //to do: zapisywanie odpowiedzi --> Panel admina
        
            Model.CurrentQuestion = Model.GetNextQuestion(answer);
            ShowQuestion();
            return true;
            }
        else return false;
    }

    public QuestionType getCurrentQuestionType() {
        if (Model.CurrentQuestion!=null){
        return Model.CurrentQuestion.QuestionType;    
        } 
        return null;
    }
    public Question GetCurrentQuestion(){
        return Model.CurrentQuestion;
    }

    public int getCurrentQuestionId() {
        return Model.CurrentQuestion.Id;
    }
}
