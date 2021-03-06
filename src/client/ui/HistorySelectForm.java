/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author DIPTO
 */
public class HistorySelectForm extends javax.swing.JFrame {

    /**
     * Creates new form TransferFrame
     */
	public HistorySelectForm(){
		
	}
	
    public HistorySelectForm(Connection con, Statement st,String[] allplayers) {
        initComponents(con,st,allplayers);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Connection con, Statement st, String[] allplayers) {

        jPanel1 = new javax.swing.JPanel();
        projNameLabel = new javax.swing.JLabel();
        playerList = new javax.swing.JComboBox();
        showButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("History window");
        setResizable(false);

        jPanel1.setLayout(null);

        projNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        projNameLabel.setText("Goal!!!");
        jPanel1.add(projNameLabel);
        projNameLabel.setBounds(20, 20, 110, 51);

        playerList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playerList.setModel(new javax.swing.DefaultComboBoxModel(allplayers));
        jPanel1.add(playerList);
        playerList.setBounds(20, 90, 360, 38);

        showButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        showButton.setText("Show History");
        jPanel1.add(showButton);
        showButton.setBounds(200, 170, 180, 41);
        showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String playername = (String)playerList.getSelectedItem();
				String playeridsql = "select playerid from player where playername ='"+playername+"'";
				int playerid = 0;
				try {
					ResultSet rs = st.executeQuery(playeridsql);
					while(rs.next()){
						playerid = rs.getInt(1);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				CallableStatement historystatement = null;
				
				try {
					historystatement = con.prepareCall("{call EFFECTIVE_IMPROVEMENT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
					historystatement.setString(1, playername);
					historystatement.registerOutParameter(2, Types.INTEGER);
					historystatement.registerOutParameter(3, Types.INTEGER);
					historystatement.registerOutParameter(4, Types.INTEGER);
					historystatement.registerOutParameter(5, Types.INTEGER);
					historystatement.registerOutParameter(6, Types.INTEGER);
					historystatement.registerOutParameter(7, Types.INTEGER);
					historystatement.registerOutParameter(8, Types.INTEGER);
					historystatement.registerOutParameter(9, Types.INTEGER);
					historystatement.registerOutParameter(10, Types.INTEGER);
					historystatement.registerOutParameter(11, Types.INTEGER);
					historystatement.registerOutParameter(12, Types.INTEGER);
					historystatement.registerOutParameter(13, Types.INTEGER);
					historystatement.registerOutParameter(14, Types.INTEGER);
					historystatement.registerOutParameter(15, Types.INTEGER);
					historystatement.registerOutParameter(16, Types.INTEGER);
					historystatement.registerOutParameter(17, Types.INTEGER);
					historystatement.registerOutParameter(18, Types.INTEGER);
					historystatement.registerOutParameter(19, Types.INTEGER);
					historystatement.execute();
					int goal1 = historystatement.getInt(2);
					int goal2 = historystatement.getInt(3);
					int goal3 = historystatement.getInt(4);
					int assist1 = historystatement.getInt(5);
					int assist2 = historystatement.getInt(6);
					int assist3 = historystatement.getInt(7);
					int pass1 = historystatement.getInt(8);
					int pass2 = historystatement.getInt(9);
					int pass3 = historystatement.getInt(10);
					int int1 = historystatement.getInt(11);
					int int2 = historystatement.getInt(12);
					int int3 = historystatement.getInt(13);
					int save1 = historystatement.getInt(14);
					int save2 = historystatement.getInt(15);
					int save3 = historystatement.getInt(16);
					int val1 = historystatement.getInt(17);
					int val2 = historystatement.getInt(18);
					int val3 = historystatement.getInt(19);
					
					history = new HistoryForm(playername,playerid,goal1,goal2,goal3,assist1,assist2,assist3,pass1,pass2,pass3,int1,int2,int3,save1,save2,save3,val1,val2,val3);
					history.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

        backButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        backButton.setText("Back");
        jPanel1.add(backButton);
        backButton.setBounds(20, 380, 57, 23);
        backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\BUET\\Level 3 Term 1\\CSE 304\\project\\Transfer.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistorySelectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorySelectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorySelectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorySelectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorySelectForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox playerList;
    private javax.swing.JLabel projNameLabel;
    private javax.swing.JButton showButton;
    private HistoryForm history;
    // End of variables declaration                   
}
