/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import Model.Answer;
import Model.Question;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author adrianrobak
 */
public class MultiChoice extends javax.swing.JPanel {

    private ArrayList<JCheckBox> CheckBoxes = new ArrayList<>(); 
    
    public void Clear(){
        for (JCheckBox c : CheckBoxes) {
            c.setSelected(false);
        }
 }
    public Question CurrentQuestion;

    public void Initialization(Question Q) { //musi być void (bez zwracania), bez void funkcja będzie się automatycznie uruchamiać się, 
        CurrentQuestion = Q;
        Clear();
        
        questionText.setText(Q.QuestionText);
        
        for (int i = 0; i < CheckBoxes.size(); i++) {
           
            JCheckBox cb = CheckBoxes.get(i);
            if (i< Q.PossibleAnswers.size()){
                cb.setText(Q.PossibleAnswers.get(i).getWrappableText());
                cb.setVisible(true);
            }
            else {
                cb.setVisible(false);
            }          
        }    
    }
    /**
     * Creates new form MultiChoice
     */
    public MultiChoice() {
        initComponents();
        CheckBoxes.add(jCheckBox1);
        CheckBoxes.add(jCheckBox2);
        CheckBoxes.add(jCheckBox3);
        CheckBoxes.add(jCheckBox4);
        CheckBoxes.add(jCheckBox5);
        CheckBoxes.add(jCheckBox6);
        CheckBoxes.add(jCheckBox7);
        CheckBoxes.add(jCheckBox8);
        CheckBoxes.add(jCheckBox9);
        CheckBoxes.add(jCheckBox10);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        questionText = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.setToolTipText("");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("jCheckBox2");

        jCheckBox3.setText("jCheckBox3");

        jCheckBox4.setText("jCheckBox4");

        jCheckBox5.setText("jCheckBox5");

        jCheckBox6.setText("jCheckBox6");

        jCheckBox7.setText("jCheckBox7");

        jCheckBox8.setText("jCheckBox8");

        jCheckBox9.setText("jCheckBox9");

        jCheckBox10.setText("jCheckBox10");

        questionText.setText("TrescPytania");
        questionText.setName("questionText"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox10)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel questionText;
    // End of variables declaration//GEN-END:variables

    public int GetSelectedElements(){
        int result = 0;
        for (int i = 0; i < CheckBoxes.size(); i++){
            JCheckBox c = CheckBoxes.get(i);
            if (c.isSelected()){
                result++;
            }
        }
        return result;
    }
    boolean ValidateAnswer() {
        int Count = GetSelectedElements();
        if (Count < CurrentQuestion.MinAnswers){
            JOptionPane.showMessageDialog(null, "Please select at least "+CurrentQuestion.MinAnswers+" answers");
            return false;
        }
        else if (Count > CurrentQuestion.MaxAnswers){
            JOptionPane.showMessageDialog(null, "Please select only "+CurrentQuestion.MaxAnswers+" answers");
            return false;
        }
        else return true;
    }
    
    Answer GetAnswer() {
        Answer a = new Answer(CurrentQuestion.Id);        
        for (int i = 0; i<CheckBoxes.size(); i++){
            if (CheckBoxes.get(i).isSelected()){
                a.AnswerIDs.add(CurrentQuestion.GetMixedPossibleAnswers().get(i).Id);
            }
        }
        return a;
    }
}
