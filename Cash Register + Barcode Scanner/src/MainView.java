import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;

import cashregister.itemsManagement.Item;

import java.awt.event.ActionListener;
import java.lang.invoke.WrongMethodTypeException;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainView{
	String a;
	long b;
	float c;
	float count;
	private JFrame frmCashRegister;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	
	
	public static Map<Long,Item> productMap = Map.of(110L, new Item("Milk", 110L, 1000),
											111L, new Item("Computer", 111L, 1100));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frmCashRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		
		initialize();
		
		
		System.out.println("Running");
		
	}

	/**
	 * Initialize the contents of the frame. sure
	 */
	private void initialize() {
		
		frmCashRegister = new JFrame();
		frmCashRegister.setTitle("Cash Register");
		frmCashRegister.setResizable(false);
		frmCashRegister.setBounds(100, 100, 715, 500);
		frmCashRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCashRegister.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		frmCashRegister.getContentPane().add(tabbedPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setFocusable(false);
		splitPane.setResizeWeight(0.5);
		tabbedPane.addTab("New tab", null, splitPane, null);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 11, 153, 409);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(184, 12, 149, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(184, 46, 149, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(184, 80, 149, 23);
		panel.add(btnNewButton_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(184, 185, 149, 23);
		panel.add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEditable(false);
		textArea_1_1.setBounds(184, 238, 149, 23);
		panel.add(textArea_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(184, 114, 149, 10);
		panel.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Item Property");
		lblNewLabel_4.setBounds(215, 135, 107, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setBounds(184, 160, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Code");
		lblNewLabel_6.setBounds(184, 219, 46, 14);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "5");

			}
		});
		btnNewButton_3.setBounds(218, 196, 50, 50);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("6");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "6");

			}
		});
		btnNewButton_3_1.setBounds(268, 196, 50, 50);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("4");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "4");

			}
		});
		btnNewButton_3_2.setBounds(168, 196, 50, 50);
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_4_1 = new JButton("OK");
		btnNewButton_3_4_1.setBounds(268, 357, 66, 63);
		panel_1.add(btnNewButton_3_4_1);
		
		JButton btnNewButton_3_3_2 = new JButton("8");
		btnNewButton_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "8");

			}
		});
		btnNewButton_3_3_2.setBounds(218, 147, 50, 50);
		panel_1.add(btnNewButton_3_3_2);
		
		JButton btnNewButton_3_4_2 = new JButton("9");
		btnNewButton_3_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "9");

			}
		});
		btnNewButton_3_4_2.setBounds(268, 147, 50, 50);
		panel_1.add(btnNewButton_3_4_2);
		
		JButton btnNewButton_3_5_2 = new JButton("7");
		btnNewButton_3_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "7");

			}
		});
		btnNewButton_3_5_2.setBounds(168, 147, 50, 50);
		panel_1.add(btnNewButton_3_5_2);
		
		JButton btnNewButton_3_3 = new JButton("00");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "00");

			}
		});
		btnNewButton_3_3.setBounds(218, 294, 50, 50);
		panel_1.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_1_1 = new JButton(".");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + ".");

			}
		});
		btnNewButton_3_1_1.setBounds(268, 294, 50, 50);
		panel_1.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("0");
		btnNewButton_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "0");

			}
		});
		btnNewButton_3_2_1.setBounds(168, 294, 50, 50);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_3_2_1 = new JButton("2");
		btnNewButton_3_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "2");

			}
		});
		btnNewButton_3_3_2_1.setBounds(218, 245, 50, 50);
		panel_1.add(btnNewButton_3_3_2_1);
		
		JButton btnNewButton_3_4_2_1 = new JButton("3");
		btnNewButton_3_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "3");

			}
		});
		btnNewButton_3_4_2_1.setBounds(268, 245, 50, 50);
		panel_1.add(btnNewButton_3_4_2_1);
		
		JButton btnNewButton_3_5_2_1 = new JButton("1");
		btnNewButton_3_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(textField_1.getText() + "1");
			}
		});
		btnNewButton_3_5_2_1.setBounds(168, 245, 50, 50);
		panel_1.add(btnNewButton_3_5_2_1);
		
		JButton btnNewButton_3_4_1_1 = new JButton("DEL");
		btnNewButton_3_4_1_1.setBounds(190, 357, 66, 63);
		panel_1.add(btnNewButton_3_4_1_1);
		
		JButton btnNewButton_3_4_1_1_1 = new JButton("ADD");
		

				btnNewButton_3_4_1_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					String unProcessedCodeOne = textField_2.getText();
					System.out.println("Debug " + unProcessedCodeOne);
					Long ProcessedCodeTwo = Long.valueOf(unProcessedCodeOne);
					String productName = textField.getText();

					String unProcessedPriceOne = textField_1.getText();
					Float ProcessedPriceTwo = Float.valueOf(unProcessedPriceOne);
				
					Item product = new Item(productName,ProcessedCodeTwo, ProcessedPriceTwo);
					
				
			
					System.out.println("Price = " + product.getPrice() + " Code = " + product.getCode() + " Name = " + product.getName());
					textField.setText(null); 
					textField_1.setText(null);
					textField_2.setText(null);
					String textAreaContentAKApassedProducts = textArea.getText();
					textAreaContentAKApassedProducts = textAreaContentAKApassedProducts + product.getName() + "  |  " + product.getPrice() + "\n";
					textArea.setText(textAreaContentAKApassedProducts);

				} catch (Exception e2) {
					//System.out.println("Try Again");
				}
				
				
				
			}
			

			
		});
				
		btnNewButton_3_4_1_1_1.setBounds(30, 210, 76, 23);
		panel_1.add(btnNewButton_3_4_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(30, 38, 289, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setBounds(30, 13, 125, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(30, 125, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 147, 66, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("€");
		lblNewLabel_2.setBounds(30, 150, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Product Code");
		lblNewLabel_3.setBounds(30, 69, 125, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(29, 94, 289, 20);
		panel_1.add(textField_2);
		
		JButton btnNewButton_3_4_1_1_1_1 = new JButton("NEW");
		btnNewButton_3_4_1_1_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				
				
			}
		});
		btnNewButton_3_4_1_1_1_1.setBounds(30, 176, 76, 23);
		panel_1.add(btnNewButton_3_4_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("0.00");
		textField_3.setBounds(30, 260, 114, 44);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		 //&& textField_1!=null && textField_2!=null
		new Thread(()->{
			while(true) {
				String text = textField.getText();
				String code =  textField_2.getText();
				if("".equals(text)&&"".equals(code)) {
					btnNewButton_3_4_1_1_1.setEnabled(false);
				}
				else{
					if(productMap.containsKey(Long.valueOf(code))) {
						 
						 Item item = productMap.get(Long.valueOf(code));
						 System.out.println(item.getName());
						 textField.setText(item.getName());
						 textField_3.setText(String.valueOf(item.getPrice()));
					}
					btnNewButton_3_4_1_1_1.setEnabled(true);
					}
				}
        }).start();
		
		/*
*/
		}

		
		
		
	}

