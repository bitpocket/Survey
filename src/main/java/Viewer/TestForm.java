/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import Controller.Controller;
import Model.Answer;
import Model.Question;
import Model.QuestionType;

/**
 *
 * @author adrianrobak
 */
public class TestForm extends javax.swing.JFrame {
    public Viewer Viewer;
    public Controller Controller;

    /**
     * Creates new form TestForm
     */
    public TestForm() {
        initComponents();
        initialization();
        StartWindows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNext = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();
        SurveyMessage = new javax.swing.JLabel();
        FinishButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenuItem = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonNext.setText("NEXT");
        buttonNext.setName("buttonNext"); // NOI18N
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        SurveyMessage.setText("jLabel1");

        FinishButton.setLabel("Finish");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        fileMenuItem.setText("File");

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenuItem.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenuItem.add(saveMenuItem);

        mainMenuBar.add(fileMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
        });
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mainMenuBar.add(aboutMenuItem);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SurveyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(SurveyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNext)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        if (Viewer.ValidateAnswers()){
            Answer answer = GetAnswer(); 
            Viewer.controller.TryGoToNextQuestion(answer);
        }        
    }//GEN-LAST:event_buttonNextActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed

        Controller.StartSession();
        StartButton.setVisible(false);
        SurveyMessage.setVisible(false);
        buttonNext.setVisible(true);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked
        About.Show();
    }//GEN-LAST:event_aboutMenuItemMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinishButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel SurveyMessage;
    private javax.swing.JMenu aboutMenuItem;
    private javax.swing.JButton buttonNext;
    private javax.swing.JMenu fileMenuItem;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    public void StartWindows(){
        ClearViewer();
        FinishButton.setVisible(false);
        SurveyMessage.setVisible(true);
        SurveyMessage.setText("Hello! This is a survey. Please answer to all questions. We reply only to interesing applications.");
        buttonNext.setVisible(false);
        StartButton.setVisible(true);
    }
    public void FinishSurvey() {
        ClearViewer();
        StartButton.setVisible(false);
        buttonNext.setVisible(false);
        FinishButton.setVisible(true);
        SurveyMessage.setVisible(true);
        
        int totalRate = Controller.getTotalRate();
        String pointSuffix = totalRate <= 1 ? " point." : " points.";
        
        SurveyMessage.setText("Thank You for Your attention. We will contact You. Be patient.Your result is "+ totalRate + pointSuffix);
    }

    public void ShowQuestion(Question question) {
        
        ShowPossibleAnswers(question);
    }
    public void ShowPossibleAnswers(Question question){
        if(question.QuestionType == QuestionType.OpenQuestion){
            ShowPossibleAnswersOpenQuestion(question);
        }
        else if(question.QuestionType== QuestionType.SingleChoice){
            ShowPossibleAnswersSingleChoice(question);
        }
        else if(QuestionType.MultiChoice==question.QuestionType){
            ShowPossibleAnswersMultiChoice(question);
            
    }
    }
    private void ClearViewer(){
    //OQTextField.setVisible(false);
    mc.setVisible(false);
    oq.setVisible(false);
    sc.setVisible(false);
    }
    private void ShowPossibleAnswersOpenQuestion(Question question) {
        ClearViewer();
        oq.Initialization(question);
        oq.setVisible(true);
    }

    private void ShowPossibleAnswersSingleChoice(Question question) {
        ClearViewer();
        sc.Initialization(question);
        sc.setVisible(true);
        
    }
    MultiChoice mc = new MultiChoice();
    OpenQuestion oq = new OpenQuestion();
    SingleChoice sc = new SingleChoice();
    private void initialization(){
       this.add(mc);
       mc.setSize(660, 430);
       this.add(oq);
       oq.setSize(660, 430);
       this.add(sc);
       sc.setSize(660, 430);
       SurveyMessage.setVisible(false);
    }
    private void ShowPossibleAnswersMultiChoice(Question question) {
       ClearViewer();
        mc.Initialization(question);
        mc.setVisible(true);
    }

    boolean ValidateAnswers() {
        QuestionType Type=Viewer.controller.getCurrentQuestionType();
        
        if (Type == QuestionType.OpenQuestion) {
            
          return oq.ValidateAnswer();
          
        } else if (Type == QuestionType.SingleChoice){
            
            return sc.ValidateAnswer();
            
        } else if (Type == QuestionType.MultiChoice){
            
            return mc.ValidateAnswer();            
        }
        
        return false;
    }

    private Answer GetAnswer() {
        QuestionType Type=Viewer.controller.getCurrentQuestionType();
        
        if (Type == QuestionType.OpenQuestion) {
            
          return oq.GetAnswer();
          
        } else if (Type == QuestionType.SingleChoice){
            
            return sc.GetAnswer();
            
        } else if (Type == QuestionType.MultiChoice){
            
            return mc.GetAnswer();       
            
        }
        
        return null;
    }
}
