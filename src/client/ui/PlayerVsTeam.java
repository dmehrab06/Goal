/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DIPTO
 */
public class PlayerVsTeam extends javax.swing.JFrame {

	/**
	 * Creates new form VsFrame
	 */
	public PlayerVsTeam() {

	}

	public PlayerVsTeam(String player, String club, int goals, int assists,Connection con,Statement st) {
		initComponents(player, club, goals, assists,con,st);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents(String player, String club, int goals,
			int assists,Connection con,Statement st) {

		jPanel1 = new javax.swing.JPanel();
		projnameLabel = new javax.swing.JLabel();
		playerphoto = new javax.swing.JLabel();
		clubphoto = new javax.swing.JLabel();
		playernameLabel = new javax.swing.JLabel();
		goalLabel = new javax.swing.JLabel();
		assistLabel = new javax.swing.JLabel();
		goal = new javax.swing.JTextField();
		assist = new javax.swing.JTextField();
		backButton = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		
		String label1sql = "select playerid from player where playername = '"
				+ player + "'";
		String label1find = null;
		try {
			ResultSet rs = st.executeQuery(label1sql);
			while (rs.next()) {
				label1find = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String label2sql = "select clubid from club where clubname = '"
				+ club + "'";
		String label2find = null;
		try {
			ResultSet rs = st.executeQuery(label2sql);
			while (rs.next()) {
				label2find = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
		setTitle("Player Comparision");
		setResizable(false);

		jPanel1.setLayout(null);

		projnameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
		projnameLabel.setText("Goal!!!");
		jPanel1.add(projnameLabel);
		projnameLabel.setBounds(10, 10, 110, 51);

		playerphoto.setIcon(new javax.swing.ImageIcon(
				"E:\\BUET\\Level 3 Term 1\\CSE 304\\project\\players\\"+label1find+".jpg")); // NOI18N
		playerphoto.setText("jLabel2");
		jPanel1.add(playerphoto);
		playerphoto.setBounds(30, 80, 150, 414);

		clubphoto.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\DIPTO\\workspace\\Goal\\club_logos\\"+label2find+".png")); // NOI18N
		clubphoto.setText("jLabel2");
		jPanel1.add(clubphoto);
		clubphoto.setBounds(790, 170, 200, 200);

		playernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		playernameLabel.setText(player + " VS " + club);
		jPanel1.add(playernameLabel);
		playernameLabel.setBounds(280, 80, 480, 32);

		goalLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		goalLabel.setText("Goal");
		jPanel1.add(goalLabel);
		goalLabel.setBounds(290, 220, 48, 32);

		assistLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		assistLabel.setText("Assist");
		jPanel1.add(assistLabel);
		assistLabel.setBounds(290, 280, 70, 40);

		goal.setText("" + goals);
		goal.setEditable(false);
		jPanel1.add(goal);
		goal.setBounds(440, 220, 320, 30);

		assist.setText("" + assists);
		assist.setEditable(false);
		jPanel1.add(assist);
		assist.setBounds(440, 280, 320, 30);

		backButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
		backButton.setText("Back");
		jPanel1.add(backButton);
		backButton.setBounds(670, 440, 90, 41);
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});

		jLabel1.setIcon(new javax.swing.ImageIcon(
				"E:\\BUET\\Level 3 Term 1\\CSE 304\\project\\vsback.jpg")); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 1024, 540);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PlayerVsTeam.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PlayerVsTeam.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PlayerVsTeam.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PlayerVsTeam.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PlayerVsTeam().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JTextField assist;
	private javax.swing.JLabel assistLabel;
	private javax.swing.JButton backButton;
	private javax.swing.JLabel clubphoto;
	private javax.swing.JTextField goal;
	private javax.swing.JLabel goalLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel playernameLabel;
	private javax.swing.JLabel playerphoto;
	private javax.swing.JLabel projnameLabel;
	// End of variables declaration
}
