/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import Controller.Controller;
import Model.Answer;
import javax.swing.JFrame;

/**
 *
 * @author adrianrobak
 */
public class Viewer {
    public Viewer(Controller controller){
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new TestForm();
        frame.Viewer = this;
        frame.setTitle("Survey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        this.controller=controller;
    } 
    public Controller controller;
    public void ShowQuestion() {
        frame.ShowQuestion(controller.GetCurrentQuestion());
    }
    public void CheckAnswer(Answer answer) {
      controller.CheckAnswer(answer); 
    }
    TestForm frame;
    public void FinishSurvey() {
        frame.FinishSurvey();
    }
}
