/*
 * WizardDialog.java
 *
 * Created on May 17, 2006, 2:57 PM
 */

package com.webreach.mirth.client;

import com.webreach.mirth.model.Channel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  brendanh
 */
public class WizardDialog extends javax.swing.JFrame
{
    private Frame parent;
    private Channel channel;
    
    /** Creates new form WizardDialog */
    public WizardDialog(JFrame parent)
    {
        this.parent = (Frame)parent;
        initComponents();
        channelName.setText("");
        nextButton.setEnabled(false);
        channelPattern.setVisible(false);
        channelOverview.setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        channelOverview = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        channelName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        outbound = new javax.swing.JRadioButton();
        inbound = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        channelPattern = new javax.swing.JPanel();
        finishButton = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        broadcast = new javax.swing.JRadioButton();
        router = new javax.swing.JRadioButton();
        applicationIntegration = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Channel Wizard");
        channelOverview.setBackground(new java.awt.Color(255, 255, 255));
        channelOverview.setName("");
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelButtonActionPerformed(evt);
            }
        });

        channelName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                channelNameKeyReleased(evt);
            }
        });

        jLabel1.setText("Channel Name:");

        jLabel2.setBackground(new java.awt.Color(112, 151, 226));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Channel Overview");
        jLabel2.setOpaque(true);

        outbound.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(outbound);
        outbound.setText("Outbound");
        outbound.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        outbound.setMargin(new java.awt.Insets(0, 0, 0, 0));
        outbound.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                outboundActionPerformed(evt);
            }
        });

        inbound.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(inbound);
        inbound.setSelected(true);
        inbound.setText("Inbound");
        inbound.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        inbound.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inbound.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                inboundActionPerformed(evt);
            }
        });

        jLabel3.setText("Direction:");

        org.jdesktop.layout.GroupLayout channelOverviewLayout = new org.jdesktop.layout.GroupLayout(channelOverview);
        channelOverview.setLayout(channelOverviewLayout);
        channelOverviewLayout.setHorizontalGroup(
            channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(channelOverviewLayout.createSequentialGroup()
                        .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .add(channelOverviewLayout.createSequentialGroup()
                                .add(cancelButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(nextButton)))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, channelOverviewLayout.createSequentialGroup()
                        .add(37, 37, 37)
                        .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel3))
                        .add(60, 60, 60)
                        .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inbound)
                            .add(channelName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(outbound))
                        .add(53, 53, 53))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        channelOverviewLayout.linkSize(new java.awt.Component[] {cancelButton, nextButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        channelOverviewLayout.setVerticalGroup(
            channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, channelOverviewLayout.createSequentialGroup()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(channelName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 30, Short.MAX_VALUE)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(inbound))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(outbound)
                .add(98, 98, 98)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nextButton)
                    .add(cancelButton))
                .addContainerGap())
        );

        channelPattern.setBackground(new java.awt.Color(255, 255, 255));
        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                finishButtonActionPerformed(evt);
            }
        });

        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelButton2ActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(112, 151, 226));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Channel Type");
        jLabel4.setOpaque(true);

        broadcast.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(broadcast);
        broadcast.setSelected(true);
        broadcast.setText("Broadcast");
        broadcast.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        broadcast.setMargin(new java.awt.Insets(0, 0, 0, 0));

        router.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(router);
        router.setText("Router");
        router.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        router.setMargin(new java.awt.Insets(0, 0, 0, 0));

        applicationIntegration.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(applicationIntegration);
        applicationIntegration.setText("Application Integration");
        applicationIntegration.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        applicationIntegration.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout channelPatternLayout = new org.jdesktop.layout.GroupLayout(channelPattern);
        channelPattern.setLayout(channelPatternLayout);
        channelPatternLayout.setHorizontalGroup(
            channelPatternLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelPatternLayout.createSequentialGroup()
                .add(58, 58, 58)
                .add(channelPatternLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(broadcast)
                    .add(applicationIntegration)
                    .add(router))
                .addContainerGap())
            .add(channelPatternLayout.createSequentialGroup()
                .addContainerGap()
                .add(channelPatternLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, channelPatternLayout.createSequentialGroup()
                        .add(backButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancelButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(finishButton)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        channelPatternLayout.linkSize(new java.awt.Component[] {backButton, cancelButton2, finishButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        channelPatternLayout.setVerticalGroup(
            channelPatternLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, channelPatternLayout.createSequentialGroup()
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(broadcast)
                .add(19, 19, 19)
                .add(router)
                .add(18, 18, 18)
                .add(applicationIntegration)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 106, Short.MAX_VALUE)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelPatternLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(finishButton)
                    .add(cancelButton2)
                    .add(backButton))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverview, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(channelPattern, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverview, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(channelPattern, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void channelNameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_channelNameKeyReleased
    {//GEN-HEADEREND:event_channelNameKeyReleased
        if(channelName.getText().trim().equals(""))
            nextButton.setEnabled(false);      
        else
            nextButton.setEnabled(true);
        
    }//GEN-LAST:event_channelNameKeyReleased

    private void outboundActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_outboundActionPerformed
    {//GEN-HEADEREND:event_outboundActionPerformed
        this.nextButton.setText("Finish");
    }//GEN-LAST:event_outboundActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_finishButtonActionPerformed
    {//GEN-HEADEREND:event_finishButtonActionPerformed
        createChannel();
    }//GEN-LAST:event_finishButtonActionPerformed

    private void createChannel()
    {
        for (int i = 0; i < parent.channels.size(); i++)
        {
            if (parent.channels.get(i).getName().equals(channelName.getText()))
            {
                JOptionPane.showMessageDialog(this, "Channel name already exists.");
                return;
            }
        }
        channel = new Channel();
        channel.setName(channelName.getText());
        if(inbound.isSelected())
            channel.setDirection(Channel.Direction.INBOUND);
        else
            channel.setDirection(Channel.Direction.OUTBOUND);
        
        if(inbound.isSelected())
        {
            if(broadcast.isSelected())
                channel.setMode(Channel.Mode.BROADCAST);
            else if(router.isSelected())
                channel.setMode(Channel.Mode.ROUTER);
            else if(applicationIntegration.isSelected())
                channel.setMode(Channel.Mode.APPLICATION);
        }
        parent.setupChannel(channel);
        parent.channelEditPage.saveChanges();       
        
        this.dispose();
    }
    
    private void inboundActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_inboundActionPerformed
    {//GEN-HEADEREND:event_inboundActionPerformed
        this.nextButton.setText("Next");
    }//GEN-LAST:event_inboundActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButton2ActionPerformed
    {//GEN-HEADEREND:event_cancelButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        channelOverview.setVisible(true);
        channelPattern.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        for (int i = 0; i < parent.channels.size(); i++)
        {
            if (parent.channels.get(i).getName().equals(channelName.getText()))
            {
                JOptionPane.showMessageDialog(this, "Channel name already exists.");
                return;
            }
        }
        
        if(this.nextButton.getText().equals("Next"))
        {
            channelOverview.setVisible(false);
            channelPattern.setVisible(true);
        }
        else
        {
            createChannel();
        }
    }//GEN-LAST:event_nextButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton applicationIntegration;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton broadcast;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JTextField channelName;
    private javax.swing.JPanel channelOverview;
    private javax.swing.JPanel channelPattern;
    private javax.swing.JButton finishButton;
    private javax.swing.JRadioButton inbound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton outbound;
    private javax.swing.JRadioButton router;
    // End of variables declaration//GEN-END:variables
    
}
