
package gui;

import base.BaseFait;
import base.BaseRegle;
import chainagearriere.ChAr;
import chainageavant.ChAv;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import io.ReadFile;
import io.WriteFile;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu extends JPanel {
    JFrame frame;
    private final JMenuBar barreMenus; 
    private JAbout boite;
    private final JMenu A, B,Ab, Ac;
    private final JMenuItem Aa, Ad, Ah,Aba, Abb, Aca, Acb;

    public Menu() {
 
        initComponents();
        
                barreMenus = new JMenuBar();
                barreMenus.setBackground(new java.awt.Color(196, 238, 250));
		frame = new JFrame("Systeme Expert");
		frame.add(this);
                frame.setJMenuBar(barreMenus);
		frame.setSize(450, 380);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

                
                A = new JMenu ("Système");
		barreMenus.add(A);
                //Sous Menu
                Aa = new JMenuItem ("Nouveau");
			Aa.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NouveauActionPerformed(evt);
            }
        });
			Aa.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
			A.add(Aa);
                        A.addSeparator();
               // Ouvrir.
			Ab = new JMenu ("Ouvrir...");
			Ab.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }});
			A.add(Ab);
                        // Sous menu de "Ouvrir"
                        Aba = new JMenuItem ("Une base de faits");
				Aba.addActionListener (new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        LoadActionPerformed(evt);
                        }});
				Ab.add(Aba);
                       Abb = new JMenuItem ("Une base de regles");
				Abb.addActionListener (new java.awt.event.ActionListener() {
                       @Override
                       public void actionPerformed(java.awt.event.ActionEvent evt) {
                       LoadActionPerformed(evt);
                       }});
				Ab.add(Abb);
                                
                // Enregister
                Ac = new JMenu ("Enregistrer");
			Ac.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }});
			A.add(Ac);
                         // Sous menu de "Enregistrer"
                        Aca = new JMenuItem ("Une base de faits");
				Aca.addActionListener (new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        SaveActionPerformed(evt);
                        }});
				Ac.add(Aca);
                        Acb = new JMenuItem ("Une base de regles");
				Acb.addActionListener (new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        SaveActionPerformed(evt);
                        }});
				Ac.add(Acb);
                                A.addSeparator();
                   // Quitter
                        Ad = new JMenuItem (" Quitter");
			Ad.addActionListener (new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        System.exit(0);
                        }});
                        Ad.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
			A.add(Ad);
                        
                //-------------
                B = new JMenu ("Aide");
		barreMenus.add(B);
                Ah = new JMenuItem ("A propos");
			Ah.addActionListener (new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                        AproposActionPerformed(evt);
                        }});
			B.add(Ah);
                        
                        addWindowListener (new WindowAdapter()
				{@Override
	public void windowClosing (WindowEvent e)
					{ System.exit(0);
					}
				});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        faits = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        regles = new javax.swing.JTextPane();
        choix = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        res = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        but = new javax.swing.JTextPane();
        init_button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 255)));
        setPreferredSize(new java.awt.Dimension(420, 350));

        faits.setBackground(new java.awt.Color(196, 238, 250));
        jScrollPane1.setViewportView(faits);

        regles.setBackground(new java.awt.Color(196, 238, 250));
        jScrollPane2.setViewportView(regles);
        

        choix.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        choix.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chainage Avant", "Chainage Arrière" }));
        choix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixActionPerformed(evt);
            }
        });

        res.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        res.setForeground(new java.awt.Color(255, 51, 0));
        res.setText("Résultat");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 138, 234));
        jLabel1.setText("Liste des Faits");

        jLabel2.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(22, 138, 234));
        jLabel2.setText("Liste des Règles");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 153, 227));
        jLabel3.setText("Algorithme ");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(22, 138, 234));
        jLabel4.setText("But");

        but.setBackground(new java.awt.Color(220, 246, 253));
        jScrollPane3.setViewportView(but);

        init_button.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        init_button.setForeground(new java.awt.Color(51, 153, 255));
        init_button.setText("Initialiser");
        init_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Exemple : a;b;c");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Exemple : a=>b;c=>d");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(res)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(init_button)
                                .addGap(117, 117, 117))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res)
                    .addComponent(init_button))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixActionPerformed
       /* Object source =	evt.getSource();
        if (source == res)
        {JOptionPane.showMessageDialog(this, "Syst�me Expert initialis� !", "Nouveau Syst�me Expert", JOptionPane.INFORMATION_MESSAGE);}*/
    }//GEN-LAST:event_choixActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
       Object source =	evt.getSource();
       
        if (source == res)
        {     
            String bt = but.getText();
            BaseFait bf = new BaseFait(faits.getText());
            BaseRegle br = new BaseRegle(regles.getText());
            int moteur =choix.getSelectedIndex();
            
            if(but.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez choisir un but", "Attention", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(faits.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez choisir une base de faits", "Attention", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(regles.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez choisir une base de regles", "Attention", JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(moteur == 0){
            ChAv fc= new ChAv(bt,br,bf); 
            JOptionPane.showMessageDialog(this, bf.toString()+"\n"+br.toString()+"\n"+fc.executer(), "Résultat Chainage Avant", JOptionPane.INFORMATION_MESSAGE);}
        
        else if (moteur == 1){
            ChAr bc= new ChAr(bt,bf,br);
            JOptionPane.showMessageDialog(this, bf.toString()+"\n"+br.toString()+"\n"+bc.executer(), "Résultat Chainage Arrière", JOptionPane.INFORMATION_MESSAGE);}}
    }//GEN-LAST:event_resActionPerformed
    private void NouveauActionPerformed(ActionEvent evt){
        this.but.setText("");
        this.faits.setText("");
        this.regles.setText("");
        this.choix.setSelectedIndex(0);
    }
            private void AproposActionPerformed(ActionEvent evt) {
                	if (boite == null)
				{
					boite = new JAbout(312, 210, 265, 250, this.frame);
				}
				else
				{
					boite.setVoir(true);	
				}
            }
     private void LoadActionPerformed(ActionEvent evt) {
         Object source =evt.getSource();
         if(source==Aba){
                ReadFile rf;
             try {
                 rf = new ReadFile("bf.txt");
                this.faits.setText(rf.getThisLine());
             } catch (IOException ex) {
                 Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
             }
                
         }
         if(source==Abb){
                ReadFile rf;
             try {
                 rf = new ReadFile("br.txt");
                this.regles.setText(rf.getThisLine());
             } catch (IOException ex) {
                 Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
             }
                
         }
            }
     private void SaveActionPerformed(ActionEvent evt) {
         Object source =evt.getSource();
         
         if(source==Aca){
                if(this.faits.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Pas de faits à Sauvegarder !", "Attention", JOptionPane.ERROR_MESSAGE);
                } else{
                    WriteFile wf;
               wf= new WriteFile(this.faits.getText(),"bf_save.txt");
                JOptionPane.showMessageDialog(this, "Base de faits sauvegardée !", "Information", JOptionPane.INFORMATION_MESSAGE);}
         
         }
         if(source==Acb){
                if(this.regles.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Pas de regles à Sauvegarder !", "Attention", JOptionPane.ERROR_MESSAGE);
                } else{
                    WriteFile wf;
               wf= new WriteFile(this.regles.getText(),"br_save.txt");
                JOptionPane.showMessageDialog(this, "Base de regles sauvegardée !", "Information", JOptionPane.INFORMATION_MESSAGE);}
         
         }
            }
    private void init_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_buttonActionPerformed
        Object source =	evt.getSource();
       
        if (source == init_button)
        {this.but.setText("");
        this.faits.setText("");
        this.regles.setText("");
        this.choix.setSelectedIndex(0);}
    }//GEN-LAST:event_init_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane but;
    private javax.swing.JComboBox choix;
    private javax.swing.JTextPane faits;
    private javax.swing.JButton init_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane regles;
    private javax.swing.JButton res;
    // End of variables declaration//GEN-END:variables
}
