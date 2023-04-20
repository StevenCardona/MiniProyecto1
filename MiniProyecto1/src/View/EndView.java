/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Game;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author STEVEN.CARDONA
 */
public class EndView extends javax.swing.JPanel {

    /**
     * Creates new form EndView
     */
    public EndView(JPanel container, Game game) {
        initComponents();
        this.containerPanel = container;
        this.game = game;

        playerLabel.setText(game.getPlayer().getNombre());
        topicLabel.setText(game.getTopic());

        resultTotalAttempts.setText(String.valueOf(game.getNumber_attemps()) + " - " + game.calculatePercentage(game.getNumber_attemps()) + "%");
        resultCorrectsAttempts.setText(String.valueOf(game.getNumber_corrects()) + " - " + game.calculatePercentage(game.getNumber_corrects()) + "%");
        resultFailuresAttempts.setText(String.valueOf(game.getNumber_failures()) + " - " + game.calculatePercentage(game.getNumber_failures()) + "%");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerLabel = new javax.swing.JLabel();
        correctAttempts = new javax.swing.JLabel();
        failuresAttempts = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        resultCorrectsAttempts = new javax.swing.JLabel();
        resultFailuresAttempts = new javax.swing.JLabel();
        resultTotalAttempts = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        topicLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));

        playerLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        playerLabel.setText("Steven Cardona");

        correctAttempts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        correctAttempts.setText("Aciertos");

        failuresAttempts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        failuresAttempts.setText("Fallos");

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalLabel.setText("Total");

        resultCorrectsAttempts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultCorrectsAttempts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultCorrectsAttempts.setText("0");

        resultFailuresAttempts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultFailuresAttempts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultFailuresAttempts.setText("0");

        resultTotalAttempts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultTotalAttempts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultTotalAttempts.setText("0");

        homeButton.setBackground(new java.awt.Color(51, 204, 0));
        homeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Inicio");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        topicLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        topicLabel.setText("Frutas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correctAttempts)
                            .addComponent(playerLabel)
                            .addComponent(failuresAttempts)
                            .addComponent(totalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 362, Short.MAX_VALUE)
                                .addComponent(topicLabel))
                            .addComponent(resultFailuresAttempts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultCorrectsAttempts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultTotalAttempts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerLabel)
                    .addComponent(topicLabel))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correctAttempts)
                    .addComponent(resultCorrectsAttempts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultFailuresAttempts)
                    .addComponent(failuresAttempts))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultTotalAttempts, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        WelcomeView view = new WelcomeView(containerPanel);
        view.setSize(800, 450);
        view.setLocation(0, 0);

        containerPanel.removeAll();
        containerPanel.add(view, BorderLayout.CENTER);
        containerPanel.revalidate();
        containerPanel.repaint();
    }//GEN-LAST:event_homeButtonActionPerformed

    private JPanel containerPanel;
    private Game game;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctAttempts;
    private javax.swing.JLabel failuresAttempts;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel resultCorrectsAttempts;
    private javax.swing.JLabel resultFailuresAttempts;
    private javax.swing.JLabel resultTotalAttempts;
    private javax.swing.JLabel topicLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
