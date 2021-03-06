/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import Model.Answer;
import Model.Question;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author adrianrobak
 */
public class SingleChoice extends javax.swing.JPanel {

    private ArrayList<JRadioButton> RadioButtons = new ArrayList<>(); 
    
    public int GetAnswerId(Question q){
        
        for (int i = 0; i < RadioButtons.size(); i++) {
           
            JRadioButton rb = RadioButtons.get(i);
            
            if (rb.isSelected() && rb.isVisible()){
                return q.GetAnswerId(i);
            }
        }  
        return -1;
    } 
    
    public void Clear(){
    buttonGroup1.clearSelection();
    }
    
    Question Q;
          
    public void Initialization(Question Q) { //musi być void (bez zwracania), bez void funkcja będzie się automatycznie uruchamiać się, 
     
        Clear();
        this.Q = Q;
        questionText.setText(Q.QuestionText);
        for (int i = 0; i < RadioButtons.size(); i++) {
           
            JRadioButton rb = RadioButtons.get(i);
            if (i< Q.GetMixedPossibleAnswers().size()){
                rb.setText(Q.GetMixedPossibleAnswers().get(i).getWrappableText());
                rb.setVisible(true);
                 }
            else {
                rb.setVisible(false);
            }
        }
    }
    /**
     * Creates new form SingleChoice
     */
    public SingleChoice() {
        initComponents();
        RadioButtons.add(jRadioButton1);
        RadioButtons.add(jRadioButton2);
        RadioButtons.add(jRadioButton3);
        RadioButtons.add(jRadioButton4);
        RadioButtons.add(jRadioButton5);
        RadioButtons.add(jRadioButton6);
        RadioButtons.add(jRadioButton7);
        RadioButtons.add(jRadioButton8);
        RadioButtons.add(jRadioButton9);
        RadioButtons.add(jRadioButton10);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        questionText = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();

        questionText.setText("TrescPytania");
        questionText.setName("questionText"); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton6");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton9");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel questionText;
    // End of variables declaration//GEN-END:variables

    boolean ValidateAnswer() {
        for (int i = 0; i < RadioButtons.size(); i++) {
            
            JRadioButton rb = RadioButtons.get(i);
            if (rb.isSelected() && rb.isVisible()){
                return true;
            }
        }
        
        JOptionPane.showMessageDialog(null, "You need to fill something.");
        return false;       
    }

    Answer GetAnswer() {
        Answer a = new Answer(Q.Id);        
        a.AnswerID = GetAnswerId(Q);
        return a;
    }

}

   

