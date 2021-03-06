/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleuserdungeon.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import singleuserdungeon.control.GameController;
import singleuserdungeon.model.FontLoader;

/**
 *
 * @author misk
 */
public class GuiViewDungeonOne extends javax.swing.JFrame {

    private static GuiViewDungeonOne instance = null;

    public GuiViewDungeonOne() 
    {
        this.initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        SetFonts();
        this.setVisible(true);
    }
    
    /**
     * Creates new form GuiView
     */
    public static GuiViewDungeonOne Instance() {
        if(instance == null) {
            instance = new GuiViewDungeonOne();            
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void SetFonts()
    {
        Font DieDie = FontLoader.Instance().GetFont();
        
        jButtonAnswer.setFont(new Font(DieDie.getName(),Font.PLAIN,(jButtonAnswer.getFont().getSize())));
        jLabelHeadline.setFont(new Font(DieDie.getName(),Font.PLAIN,(jLabelHeadline.getFont().getSize())));
        System.out.println(jButtonAnswer.getFont().getName());
        
        validate();
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelGameConsole = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsole = new javax.swing.JTextArea();
        jTextFieldInputAnswer = new javax.swing.JTextField();
        jButtonAnswer = new javax.swing.JButton();
        jLabelHeadline = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelResponseStatus = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButtonExportConsoleToFile = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGameConsole.setBackground(new java.awt.Color(0, 0, 0));
        jPanelGameConsole.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(false);

        jTextAreaConsole.setEditable(false);
        jTextAreaConsole.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaConsole.setColumns(20);
        jTextAreaConsole.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaConsole.setLineWrap(true);
        jTextAreaConsole.setRows(5);
        jTextAreaConsole.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaConsole);

        jPanelGameConsole.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 670, 260));

        jTextFieldInputAnswer.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        jTextFieldInputAnswer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldInputAnswer.setBorder(null);
        jTextFieldInputAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInputAnswerActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jTextFieldInputAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 390, 210, 40));

        jButtonAnswer.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAnswer.setFont(new java.awt.Font("Diediedie", 3, 22)); // NOI18N
        jButtonAnswer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnswer.setText("EXECUTE");
        jButtonAnswer.setBorderPainted(false);
        jButtonAnswer.setOpaque(true);
        jButtonAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnswerActionPerformed(evt);
            }
        });
        jPanelGameConsole.add(jButtonAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 150, 40));

        jLabelHeadline.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabelHeadline.setForeground(new java.awt.Color(255, 0, 51));
        jLabelHeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeadline.setText("Hall of Disaster");
        jPanelGameConsole.add(jLabelHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Response");
        jPanelGameConsole.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabelResponseStatus.setBackground(new java.awt.Color(0, 0, 0));
        jLabelResponseStatus.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabelResponseStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResponseStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelResponseStatus.setText("If you need help, then you would have to yield it.");
        jLabelResponseStatus.setOpaque(true);
        jPanelGameConsole.add(jLabelResponseStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 530, 20));

        getContentPane().add(jPanelGameConsole, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        jPanelCommandInfo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelCommandInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Commands");
        jPanelCommandInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanelCommandInfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("North");
        jPanelCommandInfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Save");
        jPanelCommandInfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("East");
        jPanelCommandInfo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("South");
        jPanelCommandInfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("New");
        jPanelCommandInfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Help");
        jPanelCommandInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Avenir Next", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ex.: use healing potion");
        jPanelCommandInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, -1, -1));

        jLabel13.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pickup");
        jPanelCommandInfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Attack");
        jPanelCommandInfo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Avenir Next", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MENU");
        jPanelCommandInfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("West");
        jPanelCommandInfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Avenir Next", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DIRECTIONS");
        jPanelCommandInfo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Avenir Next", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ACTIONS");
        jPanelCommandInfo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Load");
        jPanelCommandInfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButtonExportConsoleToFile.setBackground(new java.awt.Color(51, 51, 51));
        jButtonExportConsoleToFile.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExportConsoleToFile.setText("Export Text");
        jButtonExportConsoleToFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonExportConsoleToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportConsoleToFileActionPerformed(evt);
            }
        });
        jPanelCommandInfo.add(jButtonExportConsoleToFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));

        jLabel20.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Quit");
        jPanelCommandInfo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel21.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Use <item name>");
        jPanelCommandInfo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        getContentPane().add(jPanelCommandInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 220, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnswerActionPerformed
        
        clearResponseStatus();
        
        GameController.Instance().nextLineCommand(jTextFieldInputAnswer.getText());
        
        clearAnswerField();
        
    }//GEN-LAST:event_jButtonAnswerActionPerformed

    private void jTextFieldInputAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInputAnswerActionPerformed

    }//GEN-LAST:event_jTextFieldInputAnswerActionPerformed

    private void jButtonExportConsoleToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportConsoleToFileActionPerformed
        GameController.Instance().WriteTextToFile(jTextAreaConsole.getText());
    }//GEN-LAST:event_jButtonExportConsoleToFileActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnswer;
    private javax.swing.JButton jButtonExportConsoleToFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelHeadline;
    private javax.swing.JLabel jLabelResponseStatus;
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
    public void ResetStoryText() {
        jTextAreaConsole.setText("");
    }
    
    /**
     * This outputs the text coming from where ever in the game, to make it easier for anybody to code.
     * It uses append, with a newline inserted after.
     * @param str 
     */
    public void outputStoryText(String str) {
        jTextAreaConsole.append(str+"\n\n");
    }
    
    /**
     * This is a method for closing down the windows and
     */
    public void disposeWindow() {
        GameController.Instance().WriteTextToFile(jTextAreaConsole.getText());
        this.dispose();
    }

    public void clearResponseStatus() {
        jLabelResponseStatus.setText("");
    }
    
    public void outputResponseStatus(String text) {
        jLabelResponseStatus.setText(text);
    }

    public String getLiveStory() {
        return jTextAreaConsole.getText();
    }
    
}
