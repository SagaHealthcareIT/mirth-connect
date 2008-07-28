/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Mirth.
 *
 * The Initial Developer of the Original Code is
 * WebReach, Inc.
 * Portions created by the Initial Developer are Copyright (C) 2006
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Gerald Bortis <geraldb@webreachinc.com>
 *
 * ***** END LICENSE BLOCK ***** */

package com.webreach.mirth.client.ui;

import java.awt.Dimension;
import java.awt.Point;
import java.io.UnsupportedEncodingException;

import javax.swing.Icon;
import javax.swing.UIManager;

/** Creates the error dialog. */
public class ErrorDialog extends javax.swing.JDialog
{
    private Frame parent;

    public ErrorDialog(java.awt.Frame owner, String message)
    {
        super(owner);
        initialize(message);
    }
    
    public ErrorDialog(java.awt.Dialog owner, String message)
    {
        super(owner);
        initialize(message);
    }
    
    private void initialize(String message) {
    	this.parent = PlatformUI.MIRTH_FRAME;
        initComponents();
        question.setBackground(UIManager.getColor("Control"));
        errorContent.setBackground(UIManager.getColor("Control"));
        image.setIcon((Icon) UIManager.get("OptionPane.errorIcon"));
        questionPane.setBorder(null);
        try
        {
            message = java.net.URLDecoder.decode(message, "UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {

        }
        loadContent(message);
        errorContent.setCaretPosition(0);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        pack();
        Dimension dlgSize = getPreferredSize();
        Dimension frmSize = parent.getSize();
        Point loc = parent.getLocation();
        setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
        setVisible(true);
    }

    /** Loads the contents of the error */
    public void loadContent(String message)
    {
        if (emailAddress.getText().length() > 0)
            message = emailAddress.getText() + " " + message;

        errorContent.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code
    // <editor-fold defaultstate="collapsed" desc=" Generated Code
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorContent = new javax.swing.JTextPane();
        questionPane = new javax.swing.JScrollPane();
        question = new javax.swing.JTextPane();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submit Error");
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setText("Email Address (optional):");

        cancel.setText("Close");
        cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelActionPerformed(evt);
            }
        });

        errorContent.setBackground(new java.awt.Color(224, 223, 227));
        errorContent.setEditable(false);
        jScrollPane1.setViewportView(errorContent);

        question.setBackground(new java.awt.Color(224, 223, 227));
        question.setBorder(null);
        question.setEditable(false);
        question.setText("An unexpected error has occurred.  Would you like to submit this error to MirthProject.org?");
        question.setFocusable(false);
        questionPane.setViewportView(question);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(emailAddress, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(submit)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancel))
                    .add(layout.createSequentialGroup()
                        .add(image)
                        .add(20, 20, 20)
                        .add(questionPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .add(20, 20, 20))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {cancel, submit}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, image, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, questionPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(cancel)
                    .add(emailAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(submit))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_cancelActionPerformed
    {// GEN-HEADEREND:event_cancelActionPerformed
        this.dispose();
    }// GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_submitActionPerformed
    {// GEN-HEADEREND:event_submitActionPerformed
        if (parent.alertOkCancel(this, "The information collected is anonymous, but please verify that the error message itself does not contain any personal health information."))
            parent.sendError(errorContent.getText());
        this.dispose();
    }// GEN-LAST:event_submitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextPane errorContent;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane question;
    private javax.swing.JScrollPane questionPane;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

}
