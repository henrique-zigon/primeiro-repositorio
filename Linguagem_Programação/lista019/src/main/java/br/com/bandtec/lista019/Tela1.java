/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista019;

/**
 *
 * @author User
 */
public class Tela1 extends javax.swing.JFrame {

    Clube clube1=new Clube();
    Clube clube2= new Clube();
    public Tela1() {
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

        btVitoria1 = new javax.swing.JButton();
        btEmpate1 = new javax.swing.JButton();
        btDerrota1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbVitoria1 = new javax.swing.JLabel();
        lbEmpate1 = new javax.swing.JLabel();
        lbDerrota1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPontuacao = new javax.swing.JLabel();
        lbDerrota2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbPontuacao1 = new javax.swing.JLabel();
        btVitoria2 = new javax.swing.JButton();
        btEmpate2 = new javax.swing.JButton();
        btDerrota2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbVitoria2 = new javax.swing.JLabel();
        lbEmpate2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btVitoria1.setText("Registrar Vitória");
        btVitoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVitoria1ActionPerformed(evt);
            }
        });

        btEmpate1.setText("Registrar Empate");
        btEmpate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpate1ActionPerformed(evt);
            }
        });

        btDerrota1.setText("Registrar Derrota");
        btDerrota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDerrota1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Vitórias:                                 Empates:                              Derrotas:");

        lbVitoria1.setText("0");

        lbEmpate1.setText("0");

        lbDerrota1.setText("0");

        jLabel2.setText("Pontuação:");

        lbPontuacao.setText("0");

        lbDerrota2.setText("0");

        jLabel3.setText("Pontuação:");

        lbPontuacao1.setText("0");

        btVitoria2.setText("Registrar Vitória");
        btVitoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVitoria2ActionPerformed(evt);
            }
        });

        btEmpate2.setText("Registrar Empate");
        btEmpate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpate2ActionPerformed(evt);
            }
        });

        btDerrota2.setText("Registrar Derrota");
        btDerrota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDerrota2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Vitórias:                                 Empates:                              Derrotas:");

        lbVitoria2.setText("0");

        lbEmpate2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVitoria1)
                        .addGap(18, 18, 18)
                        .addComponent(btEmpate1)
                        .addGap(18, 18, 18)
                        .addComponent(btDerrota1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbVitoria1)
                                .addGap(141, 141, 141)
                                .addComponent(lbEmpate1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDerrota1)
                                .addGap(47, 47, 47)))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lbPontuacao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVitoria2)
                        .addGap(18, 18, 18)
                        .addComponent(btEmpate2)
                        .addGap(18, 18, 18)
                        .addComponent(btDerrota2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbVitoria2)
                                .addGap(141, 141, 141)
                                .addComponent(lbEmpate2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDerrota2)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(lbPontuacao1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVitoria1)
                    .addComponent(btDerrota1)
                    .addComponent(btEmpate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVitoria1)
                    .addComponent(lbEmpate1)
                    .addComponent(lbDerrota1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPontuacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVitoria2)
                    .addComponent(btDerrota2)
                    .addComponent(btEmpate2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVitoria2)
                    .addComponent(lbEmpate2)
                    .addComponent(lbDerrota2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPontuacao1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVitoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVitoria1ActionPerformed
        clube1.Registrar(clube1, "vitoria", lbVitoria1, lbEmpate1, lbDerrota1, lbPontuacao);
    }//GEN-LAST:event_btVitoria1ActionPerformed

    private void btEmpate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpate1ActionPerformed
        clube1.Registrar(clube1, "empate", lbVitoria1, lbEmpate1, lbDerrota1, lbPontuacao);
    }//GEN-LAST:event_btEmpate1ActionPerformed

    private void btDerrota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDerrota1ActionPerformed
        clube1.Registrar(clube1, "derrota", lbVitoria1, lbEmpate1, lbDerrota1, lbPontuacao);
    }//GEN-LAST:event_btDerrota1ActionPerformed

    private void btVitoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVitoria2ActionPerformed
        clube2.Registrar(clube2, "vitoria", lbVitoria2, lbEmpate2, lbDerrota2, lbPontuacao1);
    }//GEN-LAST:event_btVitoria2ActionPerformed

    private void btEmpate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpate2ActionPerformed
         clube2.Registrar(clube2, "empate", lbVitoria2, lbEmpate2, lbDerrota2, lbPontuacao1);
    }//GEN-LAST:event_btEmpate2ActionPerformed

    private void btDerrota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDerrota2ActionPerformed
         clube2.Registrar(clube2, "derrota", lbVitoria2, lbEmpate2, lbDerrota2, lbPontuacao1);
    }//GEN-LAST:event_btDerrota2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDerrota1;
    private javax.swing.JButton btDerrota2;
    private javax.swing.JButton btEmpate1;
    private javax.swing.JButton btEmpate2;
    private javax.swing.JButton btVitoria1;
    private javax.swing.JButton btVitoria2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDerrota1;
    private javax.swing.JLabel lbDerrota2;
    private javax.swing.JLabel lbEmpate1;
    private javax.swing.JLabel lbEmpate2;
    private javax.swing.JLabel lbPontuacao;
    private javax.swing.JLabel lbPontuacao1;
    private javax.swing.JLabel lbVitoria1;
    private javax.swing.JLabel lbVitoria2;
    // End of variables declaration//GEN-END:variables
}
