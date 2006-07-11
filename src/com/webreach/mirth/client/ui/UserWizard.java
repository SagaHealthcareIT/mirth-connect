package com.webreach.mirth.client.ui;

import com.webreach.mirth.client.core.ClientException;
import com.webreach.mirth.model.User;
import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UserWizard extends javax.swing.JDialog
{
    private Frame parent;
    private int index = -1;
    
    /** Creates new form UserDialog */
    public UserWizard(int row)
    {
        super(PlatformUI.MIRTH_FRAME);
        this.parent = PlatformUI.MIRTH_FRAME;
        initComponents();
        finishButton.setEnabled(false);
        
        if(row != -1)
        {
            jLabel2.setText("Edit User");
            jLabel2.setForeground(UIConstants.TITLE_TEXT_COLOR);
            index = this.parent.adminPanel.u.getUserIndex();
            username.setText(this.parent.users.get(index).getUsername());     
            password1.setText(this.parent.users.get(index).getPassword());
            password2.setText(this.parent.users.get(index).getPassword());
        }
        else
        {
            jLabel2.setText("New User");
            jLabel2.setForeground(UIConstants.TITLE_TEXT_COLOR);
        }
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        channelOverview = new javax.swing.JPanel();
        finishButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        mirthHeadingPanel1 = new com.webreach.mirth.client.ui.MirthHeadingPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Wizard");
        channelOverview.setBackground(new java.awt.Color(255, 255, 255));
        channelOverview.setName("");
        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                finishButtonActionPerformed(evt);
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

        username.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                usernameKeyReleased(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel3.setText("Password:");

        jLabel4.setText("Re-type Password:");

        password1.setFont(new java.awt.Font("Tahoma", 0, 11));
        password1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                password1KeyReleased(evt);
            }
        });

        password2.setFont(new java.awt.Font("Tahoma", 0, 11));
        password2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                password2KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Wizard");

        org.jdesktop.layout.GroupLayout mirthHeadingPanel1Layout = new org.jdesktop.layout.GroupLayout(mirthHeadingPanel1);
        mirthHeadingPanel1.setLayout(mirthHeadingPanel1Layout);
        mirthHeadingPanel1Layout.setHorizontalGroup(
            mirthHeadingPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mirthHeadingPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        mirthHeadingPanel1Layout.setVerticalGroup(
            mirthHeadingPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mirthHeadingPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout channelOverviewLayout = new org.jdesktop.layout.GroupLayout(channelOverview);
        channelOverview.setLayout(channelOverviewLayout);
        channelOverviewLayout.setHorizontalGroup(
            channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverviewLayout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .add(cancelButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(finishButton)
                .add(9, 9, 9))
            .add(mirthHeadingPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, channelOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, channelOverviewLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel4)
                    .add(jLabel3)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(username, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .add(password1)
                    .add(password2))
                .add(59, 59, 59))
        );

        channelOverviewLayout.linkSize(new java.awt.Component[] {cancelButton, finishButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        channelOverviewLayout.setVerticalGroup(
            channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, channelOverviewLayout.createSequentialGroup()
                .add(mirthHeadingPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(password1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(password2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 74, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(channelOverviewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(finishButton))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverview, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(channelOverview, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_password2KeyReleased
    {//GEN-HEADEREND:event_password2KeyReleased
        if(!checkIfAbleToFinish())
            return;
        if(evt.getKeyCode() == evt.VK_ENTER)
            finishButtonActionPerformed(null);
    }//GEN-LAST:event_password2KeyReleased

    private void password1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_password1KeyReleased
    {//GEN-HEADEREND:event_password1KeyReleased
        if(!checkIfAbleToFinish())
            return;
        if(evt.getKeyCode() == evt.VK_ENTER)
            finishButtonActionPerformed(null);
        
    }//GEN-LAST:event_password1KeyReleased

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_finishButtonActionPerformed
    {//GEN-HEADEREND:event_finishButtonActionPerformed
        for (int i = 0; i < parent.users.size(); i++)
        {
            if (parent.users.get(i).getUsername().equals(username.getText()))
            {
                parent.alertWarning("Username already exists.");
                return;
            }
        }
        if(!String.valueOf(password1.getPassword()).equals(String.valueOf(password2.getPassword())))
        {
            parent.alertWarning("Passwords must be the same.");
            return;
        }
        else
        {
            User temp = new User();
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            try
            {
                if(index != -1)
                    temp.setId(this.parent.users.get(index).getId());
                else
                    temp.setId(parent.mirthClient.getNextId());
                temp.setUsername(username.getText());
                temp.setPassword(String.valueOf(password1.getPassword()));
                parent.updateUser(temp);
            } 
            catch (ClientException e)
            {
                parent.alertException(e.getStackTrace());
            }
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            this.dispose();
        }
    }//GEN-LAST:event_finishButtonActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_usernameKeyReleased
    {//GEN-HEADEREND:event_usernameKeyReleased
        if(!checkIfAbleToFinish())
            return;
        if(evt.getKeyCode() == evt.VK_ENTER)
            finishButtonActionPerformed(null);
    }//GEN-LAST:event_usernameKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    public boolean checkIfAbleToFinish()
    {
        if(String.valueOf(password1.getPassword()).equals("") || String.valueOf(password2.getPassword()).trim().equals("") || username.getText().trim().equals(""))
            finishButton.setEnabled(false);
        else
        {
            finishButton.setEnabled(true);
            return true;
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel channelOverview;
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private com.webreach.mirth.client.ui.MirthHeadingPanel mirthHeadingPanel1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    
}
