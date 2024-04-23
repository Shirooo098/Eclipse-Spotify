package ContentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;


public class termscondition extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					termscondition frame = new termscondition();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public termscondition() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 801);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(15, 11, 26));
		panel.setBounds(0, 0, 1097, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\logo.png"));
		lblNewLabel.setBounds(20, 10, 250, 80);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Terms and Conditions");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblNewLabel_1.setBounds(380, 140, 360, 50);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 200, 800, 400);
		contentPane.add(scrollPane);
		
		JTextArea tc = new JTextArea();
		tc.setFont(new Font("Segoe UI", Font.BOLD, 15));
		tc.setEditable(false);
		tc.setText("Parties:\r\nThis Agreement is entered into on [Date], between “TuneWave”, a corporation organized and existing under the laws of Philippines, with its principal place of business at Bahay ni Jarl Binangonan branch, and [Artist Name], an individual artist, with their principal place of business at [Address] (\"Artist\").\r\n\r\n1. Grant of Rights:\r\n1.1 Artist hereby grants Platform the non-exclusive right to distribute, stream, and make available the musical recordings owned or controlled by Artist (the \"Content\") on Platform's digital music player platform.\r\n\r\n2. Term:\r\n2.1 This Agreement shall commence on the Effective Date and shall continue in full force and effect until terminated by either party in accordance with the terms herein.\r\n\r\n3. Royalties and Payment Terms:\r\n3.1 Platform shall pay Artist royalties in accordance with the following terms:\r\n\r\n70% of Net Revenue generated from the exploitation of the Content on Platform's platform.\r\nRoyalties shall be payable [Monthly/Quarterly/Annually], within 7 days following the end of each [Month/Quarter/Year].\r\n4. Content Delivery and Quality Standards:\r\n4.1 Artist shall deliver the Content to Platform in accordance with Platform's technical specifications and quality standards, including but not limited to file format, metadata, and audio quality.\r\n\r\n5. Territory:\r\n5.1 This Agreement grants Platform the right to distribute the Content worldwide on Platform's platform.\r\n\r\n6. Reporting and Auditing:\r\n6.1 Platform shall provide Artist with monthly usage reports and royalty statements, detailing the usage and revenue generated from the exploitation of the Content. Artist shall have the right to audit Platform's records relating to the exploitation of the Content upon 14 days' written notice.\r\n\r\n7. Promotion and Marketing:\r\n7.1 Platform shall use commercially reasonable efforts to promote and market the Content on its platform, including featuring the Content on curated playlists and promotional campaigns.\r\n\r\n8. Copyright and Ownership:\r\n8.1 Artist represents and warrants that they own or control all necessary rights in and to the Content and hereby grants Platform the rights necessary for the exploitation of the Content on its platform.\r\n\r\n9. Indemnification and Liability:\r\n9.1 Each party shall indemnify, defend, and hold harmless the other party from and against any claims, damages, liabilities, and expenses arising out of or in connection with any breach of this Agreement or infringement of any third-party rights.\r\n\r\n10. Confidentiality:\r\n10.1 Both parties agree to keep confidential all proprietary and sensitive information disclosed by the other party in connection with this Agreement.\r\n\r\n11. Termination:\r\n11.1 Either party may terminate this Agreement upon 14 days' written notice if the other party breaches any material term of this Agreement and fails to cure such breach within the specified cure period.\r\n\r\n12. Governing Law and Dispute Resolution:\r\n12.1 This Agreement shall be governed by and construed in accordance with the laws of Binangonan Rizal, Philippines. Any disputes arising out of or in connection with this Agreement shall be resolved through arbitration administered by “PIArb” (Philippine Institute of Arbitrators) in accordance with its rules.\r\n");
		scrollPane.setViewportView(tc);
		
		JButton tcbtn = new JButton("I Agree");
		tcbtn.setBorderPainted(false);		
		tcbtn.setFont(new Font("Segoe UI", Font.BOLD, 11));
		tcbtn.setForeground(new Color(255, 255, 255));
		tcbtn.setBackground(new Color(15, 11, 26));
		tcbtn.setBounds(325, 620, 150, 50);
		contentPane.add(tcbtn);
		
		JButton tcbtn2 = new JButton("I Disagree");
		tcbtn2.setBorderPainted(false);	
		tcbtn2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		tcbtn2.setForeground(new Color(255, 255, 255));
		tcbtn2.setBackground(new Color(15, 11, 26));
		tcbtn2.setBounds(650, 620, 150, 50);
		contentPane.add(tcbtn2);
	}
}
