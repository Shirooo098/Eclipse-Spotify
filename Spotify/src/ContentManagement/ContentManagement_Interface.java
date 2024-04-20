package ContentManagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;


public class ContentManagement_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTextField txtSearch;
	private JPanel panel;
	private JPanel panel_1;
	Timer tm;
	Integer pl = 60;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContentManagement_Interface frame = new ContentManagement_Interface();
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
	public ContentManagement_Interface() {
		
		final cmAction cmAct = new cmAction();
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1108, 786);
		container = new JPanel();
		container.setForeground(new Color(0, 0, 0));
		container.setBackground(new Color(18, 18, 18));
		container.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth() / 2, size.height / 2 - getHeight() / 2 );

		setContentPane(container);
		container.setLayout(null);
		
		JPanel navbar = new JPanel();
		navbar.setBounds(0, 0, 1099, 71);
		navbar.setBackground(new Color(35, 26, 66));
		container.add(navbar);
		navbar.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(23, 15, 234, 39);
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearch.setText("  Search");
		txtSearch.setToolTipText("");
		navbar.add(txtSearch);
		txtSearch.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>(cmAct.getOptions());
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> combo = (JComboBox<String>) e.getSource();
				String selectedOption = (String) combo.getSelectedItem();
				
				switch (selectedOption) {
					case "Home":
						cmAct.selectedHome();
						
						break;
					case "Subscription":
						cmAct.selectedSub();
						break;
					case "Contact Us":
						cmAct.selectedCS();
						break;
					case "Logout" :
						
						break;
				}
			}
		});
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(908, 15, 128, 34);
		navbar.add(comboBox);
		
//		final JPanel dropdownBtn = new JPanel();
//		dropdownBtn.setBounds(962, 15, 111, 50);
//		navbar.add(dropdownBtn);
//		container.setComponentZOrder(dropdownBtn, 0);
//		dropdownBtn.setLayout(null);
//		
//		JButton subBtn = new JButton("Subscription");
//		subBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		subBtn.setBounds(0, 47, 111, 50);
//		dropdownBtn.add(subBtn);
//		
//		JButton csBtn = new JButton("Contact Us");
//		csBtn.setBounds(0, 96, 111, 50);
//		dropdownBtn.add(csBtn);
//		
//		JButton logoutBtn = new JButton("Logout");
//		logoutBtn.setBounds(0, 143, 111, 50);
//		dropdownBtn.add(logoutBtn);
//		
//		final JButton homeBtn = new JButton("Home");
//		
//		tm = new Timer(10, new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				// stops if the height is 199.9
//				if(pl > 199.9) {
//					tm.stop();
//				}else {
//				// Increments the height until 199.9
//					dropdownBtn.setSize(dropdownBtn.getWidth(), pl);
//					pl += 10;
//				}
//				
//			}
//		});
//		homeBtn.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				tm.start();
//			}
//			@Override
//		    public void mouseExited(MouseEvent e) {
//		        // Check if the mouse exited the homeBtn and not entered the dropdown panel
//		        if (e.getX() < 0 || e.getY() < 0 || e.getX() >= dropdownBtn.getWidth() || e.getY() >= dropdownBtn.getHeight()) {
//		            tm.stop();
//		            dropdownBtn.setSize(dropdownBtn.getWidth(), 50);
//		            pl = 50; 
//		        }
//		    }
//		});
//		homeBtn.setBounds(0, 0, 111, 53);
//		dropdownBtn.add(homeBtn);
		
		
		
		panel = new JPanel();
		panel.setBackground(new Color(25, 25, 24));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 86, 272, 259);
		container.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Suggested Playlists");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 168, 39);
		panel.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(18, 18, 18));
		panel_3.setBounds(10, 44, 252, 60);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTambaySaBgc = new JLabel("Road Trip Playlist");
		lblTambaySaBgc.setForeground(Color.WHITE);
		lblTambaySaBgc.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblTambaySaBgc.setBounds(10, 10, 234, 39);
		panel_3.add(lblTambaySaBgc);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(18, 18, 18));
		panel_3_1.setBounds(10, 114, 252, 60);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblStudyTime = new JLabel("Study Time");
		lblStudyTime.setForeground(Color.WHITE);
		lblStudyTime.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblStudyTime.setBounds(10, 10, 234, 39);
		panel_3_1.add(lblStudyTime);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(18, 18, 18));
		panel_3_2.setBounds(10, 184, 252, 60);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		
		JLabel lblSeventeen = new JLabel("SEVENTEEN : Follow Tour");
		lblSeventeen.setForeground(Color.WHITE);
		lblSeventeen.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblSeventeen.setBounds(10, 10, 234, 39);
		panel_3_2.add(lblSeventeen);
		
		panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(new Color(25, 25, 24));
		panel_1.setBounds(292, 86, 797, 579);
		container.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBackground(new Color(102, 102, 153));
		panel_1_1.setBounds(22, 59, 754, 223);
		panel_1.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 10, 200, 200);
		panel_1_1.add(lblNewLabel_1);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/bini.png"));
		lblNewLabel_1.setIcon(img);
		
		JLabel lblSoty = new JLabel("PANTROPIKO");
		lblSoty.setForeground(Color.WHITE);
		lblSoty.setFont(new Font("Segoe UI", Font.BOLD, 45));
		lblSoty.setBounds(220, 72, 335, 39);
		panel_1_1.add(lblSoty);
		
		JLabel lblBini = new JLabel("BINI");
		lblBini.setForeground(Color.WHITE);
		lblBini.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblBini.setBounds(222, 121, 244, 39);
		panel_1_1.add(lblBini);
		
		JLabel lblFeatured = new JLabel("Featured Song");
		lblFeatured.setForeground(Color.WHITE);
		lblFeatured.setFont(new Font("Segoe UI", Font.BOLD, 26));
		lblFeatured.setBounds(22, 10, 234, 39);
		panel_1.add(lblFeatured);
		
		JLabel lblFeaturedArtists = new JLabel("Top Artists");
		lblFeaturedArtists.setForeground(Color.WHITE);
		lblFeaturedArtists.setFont(new Font("Segoe UI", Font.BOLD, 26));
		lblFeaturedArtists.setBounds(22, 324, 234, 39);
		panel_1.add(lblFeaturedArtists);
		
		JLabel lblNewLabel_2_1 = new JLabel("1");
		lblNewLabel_2_1.setBounds(22, 373, 125, 125);
		panel_1.add(lblNewLabel_2_1);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/1.png"));
		lblNewLabel_2_1.setIcon(img1);
		
		
		JLabel lblNewLabel_2_2 = new JLabel("2");
		lblNewLabel_2_2.setBounds(186, 373, 125, 125);
		panel_1.add(lblNewLabel_2_2);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/2.png"));
		lblNewLabel_2_2.setIcon(img2);
		
		JLabel lblNewLabel_2_3 = new JLabel("3");
		lblNewLabel_2_3.setBounds(340, 373, 125, 125);
		panel_1.add(lblNewLabel_2_3);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/3.png"));
		lblNewLabel_2_3.setIcon(img3);
		
		JLabel lblNewLabel_2_4 = new JLabel("4");
		lblNewLabel_2_4.setBounds(492, 373, 125, 125);
		panel_1.add(lblNewLabel_2_4);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/4.png"));
		lblNewLabel_2_4.setIcon(img4);
	
		
		JLabel lblNewLabel_2_5 = new JLabel("5");
		lblNewLabel_2_5.setBounds(651, 373, 125, 125);
		panel_1.add(lblNewLabel_2_5);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/5.png"));
		lblNewLabel_2_5.setIcon(img5);
		
		JLabel lblRanzu = new JLabel("RanzU");
		lblRanzu.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanzu.setForeground(Color.WHITE);
		lblRanzu.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRanzu.setBounds(22, 508, 125, 39);
		panel_1.add(lblRanzu);
		
		JLabel lblJarobelo = new JLabel("JaRobelo");
		lblJarobelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblJarobelo.setForeground(Color.WHITE);
		lblJarobelo.setFont(new Font("Calibri", Font.BOLD, 20));
		lblJarobelo.setBounds(186, 508, 125, 39);
		panel_1.add(lblJarobelo);
		
		JLabel lblRanzu_1_1 = new JLabel("CokeTskaJd");
		lblRanzu_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanzu_1_1.setForeground(Color.WHITE);
		lblRanzu_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRanzu_1_1.setBounds(340, 508, 125, 39);
		panel_1.add(lblRanzu_1_1);
		
		JLabel lblRanzu_1_2 = new JLabel("Saint Monard");
		lblRanzu_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanzu_1_2.setForeground(Color.WHITE);
		lblRanzu_1_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRanzu_1_2.setBounds(492, 508, 125, 39);
		panel_1.add(lblRanzu_1_2);
		
		JLabel lblRanzu_1_2_1 = new JLabel("xXxCarloxXx");
		lblRanzu_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanzu_1_2_1.setForeground(Color.WHITE);
		lblRanzu_1_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblRanzu_1_2_1.setBounds(651, 508, 125, 39);
		panel_1.add(lblRanzu_1_2_1);

		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(25, 25, 24));
		panel_2.setBounds(10, 356, 272, 395);
		container.add(panel_2);
		
		JLabel lblNowPlaying = new JLabel("Now Playing");
		lblNowPlaying.setForeground(Color.WHITE);
		lblNowPlaying.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNowPlaying.setBounds(10, 10, 168, 39);
		panel_2.add(lblNowPlaying);
		
		JLabel lblNewLabel_1_2 = new JLabel("sdsdsd");
		lblNewLabel_1_2.setBounds(10, 48, 250, 250);
		panel_2.add(lblNewLabel_1_2);
		ImageIcon img0 = new ImageIcon(this.getClass().getResource("/jarlfile.png"));
		lblNewLabel_1_2.setIcon(img0);
		
		JLabel lblJalosi = new JLabel("JALOSI (Slow and Reverb)");
		lblJalosi.setForeground(Color.WHITE);
		lblJalosi.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblJalosi.setBounds(10, 308, 234, 39);
		panel_2.add(lblJalosi);
		
		JLabel lblJarlRobelo = new JLabel("Jarl Robelo");
		lblJarlRobelo.setForeground(Color.WHITE);
		lblJarlRobelo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblJarlRobelo.setBounds(10, 337, 234, 39);
		panel_2.add(lblJarlRobelo);
		
		
	}
}
