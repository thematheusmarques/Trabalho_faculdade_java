package principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*; 


public class JogoDaVelha extends JFrame{
    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    public JogoDaVelha(){
        setVisible(true);
        setTitle("Jogo da Velha 1.0");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250,100,700,500);
        int cont = 0;
        
        for (int i = 0; i <3; i++){
            for (int j = 0; j <3; j++){
                bt [cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100*i) + 50, (100 * j) + 50, 95, 95);
                bt[cont].setFont(new Font("Arial",Font.BOLD,20)); 
                cont++;
            }
        }
        for (int i = 0; i < 9; i++) {
            click [i] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false) {
                    click[0] = true;
                      mudar(bt[0]);
                }
            
            }
        });
                bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[1] == false) {
                    click[1] = true;
                      mudar(bt[1]);
                }
            
            }
        });
                  bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[2] == false) {
                    click[2] = true;
                      mudar(bt[2]);
                }
            
            }
        });
                                bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[0] == false) {
                    click[0] = true;
                      mudar(bt[0]);
                }
            
            }
        });
                                        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[3] == false) {
                    click[3] = true;
                      mudar(bt[3]);
                }
            
            }
        });
                                                bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[4] == false) {
                    click[4] = true;
                      mudar(bt[4]);
                }
            
            }
        });
                                                        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[5] == false) {
                    click[5] = true;
                      mudar(bt[5]);
                }
            
            }
        });
             bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[6] == false) {
                    click[6] = true;
                      mudar(bt[6]);
                }
            
            }
        });
                     bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[7] == false) {
                    click[7] = true;
                      mudar(bt[7]);
                }
            
            }
        });
                             bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(click[8] == false) {
                    click[8] = true;
                      mudar(bt[8]);
                }
            
            }
        });

    }

    
    public void mudar(JButton btn){
        if (xo) {
            btn.setText("BOLA");
            xo = false;
        }
        else {
            btn.setText("CERQUILHA");
            xo = true; 
        }
        ganhou();
    }
    
    public void ganhou(){
        if ((bt[0].getText()=="BOLA" && bt[1].getText()=="BOLA" && bt[1].getText()=="BOLA" ) || 
                (bt[3].getText()=="BOLA" && bt[4].getText()=="BOLA" && bt[5].getText()=="BOLA" ) ||
                (bt[6].getText()=="BOLA" && bt[7].getText()=="BOLA" && bt[8].getText()=="BOLA" ) ||
                        (bt[0].getText()=="BOLA" && bt[3].getText()=="BOLA" && bt[6].getText()=="BOLA" ) ||
                        (bt[1].getText()=="BOLA" && bt[4].getText()=="BOLA" && bt[7].getText()=="BOLA" ) ||
                        (bt[2].getText()=="BOLA" && bt[5].getText()=="BOLA" && bt[8].getText()=="BOLA" ) ||
                        (bt[0].getText()=="BOLA" && bt[4].getText()=="BOLA" && bt[8].getText()=="BOLA" ) ||
                        (bt[6].getText()=="BOLA" && bt[4].getText()=="BOLA" && bt[2].getText()=="BOLA" )) {
            JOptionPane.showMessageDialog(null, "BOLA ganhou");
            limpar();
            
            
        }
               else if ((bt[0].getText()=="CERQUILHA" && bt[1].getText()=="CERQUILHA" && bt[1].getText()=="CERQUILHA" ) || 
                (bt[3].getText()=="CERQUILHA" && bt[4].getText()=="CERQUILHA" && bt[5].getText()=="CERQUILHA" ) ||
                (bt[6].getText()=="CERQUILHA" && bt[7].getText()=="CERQUILHA" && bt[8].getText()=="CERQUILHA" ) ||
                        (bt[0].getText()=="CERQUILHA" && bt[3].getText()=="CERQUILHA" && bt[6].getText()=="CERQUILHA" ) ||
                        (bt[1].getText()=="CERQUILHA" && bt[4].getText()=="CERQUILHA" && bt[7].getText()=="CERQUILHA" ) ||
                        (bt[2].getText()=="CERQUILHA" && bt[5].getText()=="CERQUILHA" && bt[8].getText()=="CERQUILHA" ) ||
                        (bt[0].getText()=="CERQUILHA" && bt[4].getText()=="CERQUILHA" && bt[8].getText()=="CERQUILHA" ) ||
                        (bt[6].getText()=="CERQUILHA" && bt[4].getText()=="CERQUILHA" && bt[2].getText()=="CERQUILHA" )) {
            JOptionPane.showMessageDialog(null, "CERQUILHA ganhou");
            limpar();
            
            
        }
    }
    public void limpar(){
        for (int i =0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false; 
        }
    }
    public static void main(String[] args) {
        new JogoDaVelha();
    }
}
