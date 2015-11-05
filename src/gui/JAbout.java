/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mr.J
 */
public class JAbout implements ActionListener {

        JDialog boite;
	JButton ok;
	JPanel pan;	

	public JAbout (int x, int y, int lg, int ht, JFrame fen)
	{
		boite = new JDialog (fen, ".: A propos", false);
		boite.setBounds (x, y, lg, ht);
		boite.setVisible (true);

		pan = new pan_about();
		pan.setBackground (new java.awt.Color(72,175,255));
		pan.setBounds (0, 0, lg, ht);
		pan.setLayout (null);
		boite.getContentPane().add (pan);
		

		ok = new JButton ("Ok");
		ok.setBounds (lg/2-35, ht-65, 70, 25);
		pan.add (ok);
		ok.setEnabled (true);
		ok.addActionListener(this);						
	}
	
	public void actionPerformed (ActionEvent e)
	{

		Object source =	e.getSource();
		
		if (source == ok)
		{
			boite.setVisible(false);
		}		
	}


	void setVoir(boolean B)
	{
		if (B)
		{
			boite.setVisible (true);
		}
		else
		{
			boite.setVisible (false);	
		}	
	}
}


class pan_about extends JPanel
{


	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
			
		//super.paintComponent(g);
		g.setColor (Color.lightGray);
		g.drawRect(45, 60, 180, 20);  // Cadre titre.
		g.drawRoundRect(10, 10, 230, 155, 50, 50);  // Cadre 1.
		g.drawRoundRect(190, -20, 300, 70, 50, 50);  // Cadre logo. 

		g.setColor (Color.white);	
		g.drawString ("Atelier IA - Systeme Expert", 63, 75);

		g.setColor (Color.black);
		g.drawString ("Version 1.0", 30, 40);

		g.drawString ("Application realisee dans le cadre", 43, 100);
		g.drawString ("de l'Atelier Intelligence Artificielle.", 43, 115);
		
		g.drawString ("Hechem El Jed & Ghazi Abcha", 42, 140);
		g.drawString ("INSAT | GL4-3 | 2013-2014", 50, 155);							
	}
}
