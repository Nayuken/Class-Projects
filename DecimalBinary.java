import java.awt.Button;

import java.awt.Label;

import java.awt.TextField;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class DecimalBinary {

public static void main(String[] args) {
	
JFrame frame=new JFrame(); //Create a frame

frame.setTitle("Decimal-Binary Converter"); //Set its label

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setSize(300, 300); //Set size fo frame

JPanel panel=new JPanel(); //Create a panel to contain controls

frame.add(panel); //add panel to frame

panel.setLayout(null);

Label decimalLabel=new Label("Decimal"); //Create label for decimal

decimalLabel.setBounds(10, 10, 60, 20); //Set position (x,y) and width,height

Label binaryLabel=new Label("Binary"); //Create lable for binary

binaryLabel.setBounds(10, 30, 60, 20); //Set position (x,y) and width,height

TextField decimalArea=new TextField(20); //Create textfield for decimal number

decimalArea.setBounds(100, 10, 150, 20); //Set position (x,y) and width,height

TextField binaryArea=new TextField(20); //Create textfield for binary number

binaryArea.setBounds(100, 30, 150, 20); //Set position (x,y) and width,height

Button button=new Button("Convert"); //Create button to initiate conversion

button.setBounds(70, 70, 50, 20); //Set position (x,y) and width,height

//Add all the conrols to panel

panel.add(decimalLabel);

panel.add(decimalArea);

panel.add(binaryLabel);

panel.add(binaryArea);

panel.add(button);

frame.setVisible(true);

//Add action listener to button, to handle click event

button.addActionListener(new ActionListener(){

@Override

public void actionPerformed(ActionEvent e) {

// Store entered decimal number in variable decimal

int decimal=Integer.parseInt(decimalArea.getText());

int remain=0;

String binary=""; //Variable to hold binary number

//Create a loop to go through each digit of number and find out remainder

//on division by 2. This remainder will be added to output.

while(decimal>0){

remain=decimal%2;

decimal/=2;

binary=remain+binary;

}

//Set result on binaryArea

binaryArea.setText(binary);

}

});

}

}