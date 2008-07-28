package com.webreach.mirth.client.ui;

import java.util.Properties;

import com.webreach.mirth.client.core.ClientException;

public class ServerIdentPanel extends javax.swing.JPanel {

    /** Creates new form ServerIdentificationPanel */
    public ServerIdentPanel() {
        initComponents();
    }
    
    public void loadSettings(Properties serverProperties) {
        
        String serverIdValue = "";
        try {
        	serverIdValue = PlatformUI.MIRTH_FRAME.mirthClient.getServerId();
        } catch (ClientException e) {
        	PlatformUI.MIRTH_FRAME.alertException(this, e.getStackTrace(), e.getMessage());
        }
        
        serverId.setText(serverIdValue);
        
        if (serverProperties.getProperty("ident.serverName") != null)
            identServerName.setText((String) serverProperties.getProperty("ident.serverName"));
        else
        	identServerName.setText("");
        
        if (serverProperties.getProperty("ident.firstName") != null)
            identFirstName.setText((String) serverProperties.getProperty("ident.firstName"));
        else
        	identFirstName.setText("");
        
        if (serverProperties.getProperty("ident.lastName") != null)
            identLastName.setText((String) serverProperties.getProperty("ident.lastName"));
        else
        	identLastName.setText("");
        
        if (serverProperties.getProperty("ident.company") != null)
            identCompany.setText((String) serverProperties.getProperty("ident.company"));
        else
        	identCompany.setText("");
        
        if (serverProperties.getProperty("ident.email") != null)
            identEmail.setText((String) serverProperties.getProperty("ident.email"));
        else
        	identEmail.setText("");

        if (serverProperties.getProperty("ident.phone") != null)
            identPhone.setText((String) serverProperties.getProperty("ident.phone"));
        else
        	identPhone.setText("");
    }
    
    public void saveSettings(Properties serverProperties) {
        serverProperties.put("ident.serverName", identServerName.getText());
        serverProperties.put("ident.firstName", identFirstName.getText());
        serverProperties.put("ident.lastName", identLastName.getText());
        serverProperties.put("ident.company", identCompany.getText());
        serverProperties.put("ident.email", identEmail.getText());
        serverProperties.put("ident.phone", identPhone.getText());        
    }
    
    public String validateServerIdentSettings() {
    	if (identServerName.getText().length() == 0) {
    		return "Plese enter a valid server name.";
    	}
    	if (identFirstName.getText().length() == 0) {
    		return "Plese enter a valid first name.";
    	}
    	if (identLastName.getText().length() == 0) {
    		return "Plese enter a valid last name.";
    	}
    	if (identEmail.getText().length() == 0) {
    		return "Plese enter a valid email.";
    	}
    	
    	return null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identServerNameLabel = new javax.swing.JLabel();
        identServerName = new com.webreach.mirth.client.ui.components.MirthTextField();
        identFirstName = new com.webreach.mirth.client.ui.components.MirthTextField();
        identFirstNameLabel = new javax.swing.JLabel();
        identLastNameLabel = new javax.swing.JLabel();
        identLastName = new com.webreach.mirth.client.ui.components.MirthTextField();
        identCompany = new com.webreach.mirth.client.ui.components.MirthTextField();
        identCompanyLabel = new javax.swing.JLabel();
        identEmailLabel = new javax.swing.JLabel();
        identEmail = new com.webreach.mirth.client.ui.components.MirthTextField();
        identPhone = new com.webreach.mirth.client.ui.components.MirthTextField();
        identPhoneLabel = new javax.swing.JLabel();
        asteriskLabel = new javax.swing.JLabel();
        asteriskLabel1 = new javax.swing.JLabel();
        asteriskLabel2 = new javax.swing.JLabel();
        asteriskLabel3 = new javax.swing.JLabel();
        serverIdLabel = new javax.swing.JLabel();
        serverId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)), "Server Identification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        identServerNameLabel.setText("Server Name:");

        identFirstNameLabel.setText("First Name:");

        identLastNameLabel.setText("Last Name:");

        identCompanyLabel.setText("Company:");

        identEmailLabel.setText("Email:");

        identEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identEmailActionPerformed(evt);
            }
        });

        identPhoneLabel.setText("Phone:");

        asteriskLabel.setForeground(new java.awt.Color(255, 0, 0));
        asteriskLabel.setText("*");

        asteriskLabel1.setForeground(new java.awt.Color(255, 0, 0));
        asteriskLabel1.setText("*");

        asteriskLabel2.setForeground(new java.awt.Color(255, 0, 0));
        asteriskLabel2.setText("*");

        asteriskLabel3.setForeground(new java.awt.Color(255, 0, 0));
        asteriskLabel3.setText("*");

        serverIdLabel.setText("Server ID:");

        serverId.setText("{id}");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, serverIdLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identServerNameLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identFirstNameLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identLastNameLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identCompanyLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identEmailLabel)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, identPhoneLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(identServerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(asteriskLabel))
                    .add(layout.createSequentialGroup()
                        .add(identFirstName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(asteriskLabel1))
                    .add(layout.createSequentialGroup()
                        .add(identLastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(asteriskLabel2))
                    .add(identCompany, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(identEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(asteriskLabel3))
                    .add(identPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(serverId))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(serverIdLabel)
                    .add(serverId))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identServerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(identServerNameLabel)
                    .add(asteriskLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identFirstNameLabel)
                    .add(identFirstName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(asteriskLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identLastNameLabel)
                    .add(identLastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(asteriskLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identCompanyLabel)
                    .add(identCompany, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identEmailLabel)
                    .add(identEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(asteriskLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(identPhoneLabel)
                    .add(identPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void identEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identEmailActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_identEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asteriskLabel;
    private javax.swing.JLabel asteriskLabel1;
    private javax.swing.JLabel asteriskLabel2;
    private javax.swing.JLabel asteriskLabel3;
    private com.webreach.mirth.client.ui.components.MirthTextField identCompany;
    private javax.swing.JLabel identCompanyLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField identEmail;
    private javax.swing.JLabel identEmailLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField identFirstName;
    private javax.swing.JLabel identFirstNameLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField identLastName;
    private javax.swing.JLabel identLastNameLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField identPhone;
    private javax.swing.JLabel identPhoneLabel;
    private com.webreach.mirth.client.ui.components.MirthTextField identServerName;
    private javax.swing.JLabel identServerNameLabel;
    private javax.swing.JLabel serverId;
    private javax.swing.JLabel serverIdLabel;
    // End of variables declaration//GEN-END:variables

}
