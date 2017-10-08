package Calculator;

import java.awt.*;

import javax.swing.*;

public class CalculatorUI extends JFrame {

	JPanel[] row=new JPanel[5];
	JButton[] button=new JButton[19];
	String buttonString[]= {"7","8","9","+","C","4","5","6","-","?",
			"1","2","3","*","+/-","0",".","/","="};

	JTextArea display=new JTextArea(2,50);
	Font font=new Font("Chiller",Font.BOLD,20);

	CalculatorUI() {
		super("Calculator");
		setDesign();
		setSize(250,350);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(5,5);
		setLayout(grid);

		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		FlowLayout f2=new FlowLayout(FlowLayout.CENTER,1,1);

		for(int i=0;i<5;i++)
			row[i]=new JPanel();
		row[0].setLayout(f1);
		for(int i=1;i<5;i++)
			row[i].setLayout(f2);

		for(int i=0;i<19;i++){
			button[i]=new JButton();
			button[i].setText(buttonString[i]);
			button[i].setBackground(Color.GRAY);
			button[i].setFont(font);
		}


	}

}
