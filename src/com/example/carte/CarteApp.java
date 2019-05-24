package com.example.carte;

import java.awt.Container;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.example.swing.FrameForDemoMaker;
import com.example.util.ResourceUtility;

public class CarteApp extends FrameForDemoMaker {

	private ImageIcon dosCarte = ResourceUtility.loadImage("dos.png");

	public CarteApp() throws IOException{
		super("Mémoire");
		setDefaultBounds(100,100,900,600);
	}

	@Override
	public void init(JFrame frame) {
		Container cp = frame.getContentPane();
		cp.add(createButton());
	}
	
	public JComponent createButton() {
		JButton button = new JButton(dosCarte);
		return button;
	}
	
	public static void main(String[] args) throws IOException {
		CarteApp example = new CarteApp();
		SwingUtilities.invokeLater(example);
	}
}
