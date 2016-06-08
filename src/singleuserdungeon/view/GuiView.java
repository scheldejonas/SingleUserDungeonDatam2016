/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.view;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import singleuserdungeon.control.GameController;

/**
 *
 * @author misk
 */
public class GuiView extends javax.swing.JFrame {

    private static GuiView instance = null;

    public GuiView() {
        this.initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        this.setVisible(true);
    }
    
    /**
     * Creates new form GuiView
     */
    public static GuiView instance() {
        if(instance == null) {
            instance = new GuiView();            
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelGameConsole = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsole = new javax.swing.JTextArea();
        jTextFieldInputAnswer = new javax.swing.JTextField();
        jButtonAnswer = new javax.swing.JButton();
        jLabelHeadline = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonExportConsoleToFile = new javax.swing.JButton();
        jLabelExportStatus = new javax.swing.JLabel();
        jPanelCommandInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGameConsole.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextAreaConsole.setEditable(false);
        jTextAreaConsole.setColumns(20);
        jTextAreaConsole.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConsole);

        jPanelGameConsole.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 839, 300));

        jTextFieldInputAnswer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldInputAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputAnswerActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jTextFieldInputAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 390, 740, -1));

        jButtonAnswer.setText("Answer");
        jButtonAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnswerActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jButtonAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 90, -1));

        jLabelHeadline.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelHeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeadline.setText("Single User Dungeon by Jonas Schelde, Jens Egeberg Rasmussen & Michael Skjaldgaard");
        jPanelGameConsole.add(jLabelHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 45, -1, -1));

        jLabel1.setText("If you need help, then you would have to yield it.");
        jPanelGameConsole.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 450, -1));

        jButtonExportConsoleToFile.setText("Export My Story");
        jButtonExportConsoleToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportConsoleToFileActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jButtonExportConsoleToFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabelExportStatus.setText(" ");
        jPanelGameConsole.add(jLabelExportStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 15, -1, -1));

        getContentPane().add(jPanelGameConsole, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 460));

        jPanelCommandInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Your answers");
        jPanelCommandInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanelCommandInfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel6.setText("north");
        jPanelCommandInfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setText("save");
        jPanelCommandInfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setText("east");
        jPanelCommandInfo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setText("south");
        jPanelCommandInfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel10.setText("new");
        jPanelCommandInfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel11.setText("load");
        jPanelCommandInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel12.setText("use + item name");
        jPanelCommandInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel13.setText("pickup");
        jPanelCommandInfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel14.setText("attack");
        jPanelCommandInfo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel15.setText("west");
        jPanelCommandInfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(jPanelCommandInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 150, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnswerActionPerformed
        
        String commandAnswer = GameController.instance().nextLineCommand(jTextFieldInputAnswer.getText());
        
        outputText(commandAnswer);
        
        clearAnswerField();
        
        clearExportStatus();
        
    }//GEN-LAST:event_jButtonAnswerActionPerformed

    private void jTextFieldInputAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputAnswerActionPerformed

    }//GEN-LAST:event_jTextFieldInputAnswerActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonExportConsoleToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportConsoleToFileActionPerformed
        boolean wasWritten = GameController.instance().WriteTextToFile(jTextAreaConsole.getText());
        if (wasWritten) {
            String string = "Your story has been saved to the computer.";
            setExportStatus(string);
        }
        else {
            String string = "Your story is not saved, sorry, try again or contact us.";
            setExportStatus(string);
        }
    }//GEN-LAST:event_jButtonExportConsoleToFileActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnswer;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonExportConsoleToFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelExportStatus;
    private javax.swing.JLabel jLabelHeadline;
    private javax.swing.JPanel jPanelCommandInfo;
    private javax.swing.JPanel jPanelGameConsole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaConsole;
    private javax.swing.JTextField jTextFieldInputAnswer;
    // End of variables declaration//GEN-END:variables

    private void clearAnswerField() {
        jTextFieldInputAnswer.setText(""); //Deletes, what written in the text input field
    }
    
    /**
     * This resets the text in the gui windows of the game.
     */
    public void ResetStory() {
        jTextAreaConsole.setText("");
    }
    
    /**
     * This outputs the text coming from where ever in the game, to make it easier for anybody to code.
     * It uses append, with a newline inserted after.
     * @param str 
     */
    public void outputText(String str) {
        jTextAreaConsole.append(str+"\n");
    }
    
    public void disposeWindow() {
        GameController.instance().WriteTextToFile(jTextAreaConsole.getText());
        this.dispose();
    }

    private void clearExportStatus() {
        jLabelExportStatus.setText("");
    }
    
    private void setExportStatus(String text) {
        jLabelExportStatus.setText(text);
    }

    public String getLiveStory() {
        return jTextAreaConsole.getText();
    }
    
}
