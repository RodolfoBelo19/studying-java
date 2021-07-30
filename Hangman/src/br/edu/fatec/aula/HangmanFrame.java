/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1711 MXTI
 */
public class HangmanFrame extends javax.swing.JFrame {

    /**
     * Creates new form HangmanFrame
     */
    public HangmanFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        aButton = new javax.swing.JButton();
        bButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        dButton = new javax.swing.JButton();
        eButton = new javax.swing.JButton();
        fButton = new javax.swing.JButton();
        gButton = new javax.swing.JButton();
        hButton = new javax.swing.JButton();
        iButton = new javax.swing.JButton();
        jButton = new javax.swing.JButton();
        kButton = new javax.swing.JButton();
        lButton = new javax.swing.JButton();
        mButton = new javax.swing.JButton();
        nButton = new javax.swing.JButton();
        oButton = new javax.swing.JButton();
        pButton = new javax.swing.JButton();
        qButton = new javax.swing.JButton();
        rButton = new javax.swing.JButton();
        sButton = new javax.swing.JButton();
        tButton = new javax.swing.JButton();
        uButton = new javax.swing.JButton();
        vButton = new javax.swing.JButton();
        wButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        yButton = new javax.swing.JButton();
        zButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        dicaLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        respostaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 9 - Hangman");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new java.awt.GridLayout(2, 13, 2, 2));

        aButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        aButton.setForeground(new java.awt.Color(44, 62, 80));
        aButton.setText("A");
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });
        jPanel2.add(aButton);

        bButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        bButton.setForeground(new java.awt.Color(44, 62, 80));
        bButton.setText("B");
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bButton);

        cButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cButton.setForeground(new java.awt.Color(44, 62, 80));
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cButton);

        dButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        dButton.setForeground(new java.awt.Color(44, 62, 80));
        dButton.setText("D");
        jPanel2.add(dButton);

        eButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        eButton.setForeground(new java.awt.Color(44, 62, 80));
        eButton.setText("E");
        jPanel2.add(eButton);

        fButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        fButton.setForeground(new java.awt.Color(44, 62, 80));
        fButton.setText("F");
        jPanel2.add(fButton);

        gButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        gButton.setForeground(new java.awt.Color(44, 62, 80));
        gButton.setText("G");
        jPanel2.add(gButton);

        hButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        hButton.setForeground(new java.awt.Color(44, 62, 80));
        hButton.setText("H");
        jPanel2.add(hButton);

        iButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        iButton.setForeground(new java.awt.Color(44, 62, 80));
        iButton.setText("I");
        jPanel2.add(iButton);

        jButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton.setForeground(new java.awt.Color(44, 62, 80));
        jButton.setText("J");
        jPanel2.add(jButton);

        kButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        kButton.setForeground(new java.awt.Color(44, 62, 80));
        kButton.setText("K");
        jPanel2.add(kButton);

        lButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lButton.setForeground(new java.awt.Color(44, 62, 80));
        lButton.setText("L");
        jPanel2.add(lButton);

        mButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        mButton.setForeground(new java.awt.Color(44, 62, 80));
        mButton.setText("M");
        mButton.setToolTipText("");
        jPanel2.add(mButton);

        nButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        nButton.setForeground(new java.awt.Color(44, 62, 80));
        nButton.setText("N");
        jPanel2.add(nButton);

        oButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        oButton.setForeground(new java.awt.Color(44, 62, 80));
        oButton.setText("O");
        jPanel2.add(oButton);

        pButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        pButton.setForeground(new java.awt.Color(44, 62, 80));
        pButton.setText("P");
        jPanel2.add(pButton);

        qButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        qButton.setForeground(new java.awt.Color(44, 62, 80));
        qButton.setText("Q");
        jPanel2.add(qButton);

        rButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        rButton.setForeground(new java.awt.Color(44, 62, 80));
        rButton.setText("R");
        jPanel2.add(rButton);

        sButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        sButton.setForeground(new java.awt.Color(44, 62, 80));
        sButton.setText("S");
        jPanel2.add(sButton);

        tButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tButton.setForeground(new java.awt.Color(44, 62, 80));
        tButton.setText("T");
        jPanel2.add(tButton);

        uButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        uButton.setForeground(new java.awt.Color(44, 62, 80));
        uButton.setText("U");
        uButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uButtonActionPerformed(evt);
            }
        });
        jPanel2.add(uButton);

        vButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        vButton.setForeground(new java.awt.Color(44, 62, 80));
        vButton.setText("V");
        vButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vButtonActionPerformed(evt);
            }
        });
        jPanel2.add(vButton);

        wButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        wButton.setForeground(new java.awt.Color(44, 62, 80));
        wButton.setText("W");
        wButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wButtonActionPerformed(evt);
            }
        });
        jPanel2.add(wButton);

        xButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        xButton.setForeground(new java.awt.Color(44, 62, 80));
        xButton.setText("X");
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });
        jPanel2.add(xButton);

        yButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        yButton.setForeground(new java.awt.Color(44, 62, 80));
        yButton.setText("Y");
        yButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yButtonActionPerformed(evt);
            }
        });
        jPanel2.add(yButton);

        zButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        zButton.setForeground(new java.awt.Color(44, 62, 80));
        zButton.setText("Z");
        zButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zButtonActionPerformed(evt);
            }
        });
        jPanel2.add(zButton);

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        dicaLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        dicaLabel.setForeground(new java.awt.Color(255, 255, 255));
        dicaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dicaLabel.setText("A dica fica aqui");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dicaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        respostaLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        respostaLabel.setForeground(new java.awt.Color(255, 255, 255));
        respostaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respostaLabel.setText("RESPOSTA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respostaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respostaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<String> lista = new ArrayList<>();
    private String respostaCorreta = "";
    private String respostaAtual = "";
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String caminho = "src/br/edu/fatec/arquivo/dados.txt";
        File arquivo = new File(caminho);
        try {
            Scanner entrada = new Scanner(arquivo);
            while (entrada.hasNext()) {
                String linha = entrada.nextLine();      // Le uma linha do arquivo
                lista.add(linha);                       // adiciona na Lista  
            }
            
            Collections.shuffle(lista);                 // Embaralhar a lista

            adicionarInformacoesNaTela();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Falha ao ler o arquivo!",
                    "Erro de Arquivo",
                    JOptionPane.ERROR_MESSAGE);

            dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        verificarLetra('A');
        aButton.setEnabled(false);
    }//GEN-LAST:event_aButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
        verificarLetra('B');
        bButton.setEnabled(false);
    }//GEN-LAST:event_bButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        verificarLetra('C');
        cButton.setEnabled(false);
    }//GEN-LAST:event_cButtonActionPerformed

    private void zButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zButtonActionPerformed
        verificarLetra('Z');
        cButton.setEnabled(false);
    }//GEN-LAST:event_zButtonActionPerformed

    private void yButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yButtonActionPerformed
        verificarLetra('Y');
        cButton.setEnabled(false);
    }//GEN-LAST:event_yButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        verificarLetra('X');
        cButton.setEnabled(false);
    }//GEN-LAST:event_xButtonActionPerformed

    private void wButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wButtonActionPerformed
        verificarLetra('W');
        cButton.setEnabled(false);
    }//GEN-LAST:event_wButtonActionPerformed

    private void vButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vButtonActionPerformed
        verificarLetra('V');
        cButton.setEnabled(false);
    }//GEN-LAST:event_vButtonActionPerformed

    private void uButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uButtonActionPerformed
        verificarLetra('U');
        cButton.setEnabled(false);
    }//GEN-LAST:event_uButtonActionPerformed

    private void adicionarInformacoesNaTela() {
        String linha = lista.remove(0);
        String[] partes = linha.split("[;]");
        dicaLabel.setText(partes[0].toUpperCase());
        
        respostaCorreta = partes[1].toUpperCase();
        respostaAtual = respostaCorreta.replaceAll("[a-zA-Z0-9]", "-");
        respostaLabel.setText(respostaAtual);
    }
    
    private void verificarLetra(char letra){
        for (int i = 0; i < respostaCorreta.length(); i++){
            if (respostaCorreta.charAt(i) == letra){
                char[] letras = respostaAtual.toCharArray();
                letras[i] = letra;
                respostaAtual = String.valueOf(letras); 
            }
        }
        
        respostaLabel.setText(respostaAtual);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangmanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aButton;
    private javax.swing.JButton bButton;
    private javax.swing.JButton cButton;
    private javax.swing.JButton dButton;
    private javax.swing.JLabel dicaLabel;
    private javax.swing.JButton eButton;
    private javax.swing.JButton fButton;
    private javax.swing.JButton gButton;
    private javax.swing.JButton hButton;
    private javax.swing.JButton iButton;
    private javax.swing.JButton jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton kButton;
    private javax.swing.JButton lButton;
    private javax.swing.JButton mButton;
    private javax.swing.JButton nButton;
    private javax.swing.JButton oButton;
    private javax.swing.JButton pButton;
    private javax.swing.JButton qButton;
    private javax.swing.JButton rButton;
    private javax.swing.JLabel respostaLabel;
    private javax.swing.JButton sButton;
    private javax.swing.JButton tButton;
    private javax.swing.JButton uButton;
    private javax.swing.JButton vButton;
    private javax.swing.JButton wButton;
    private javax.swing.JButton xButton;
    private javax.swing.JButton yButton;
    private javax.swing.JButton zButton;
    // End of variables declaration//GEN-END:variables
}