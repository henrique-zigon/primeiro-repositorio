/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista018;

/**
 *
 * @author User
 */
public class Tela1 extends javax.swing.JFrame {
    Elevador elevador1=new Elevador();
    Elevador elevador2=new Elevador();
    
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

        btHomem1 = new javax.swing.JButton();
        btMulher1 = new javax.swing.JButton();
        btCrianca1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTotalPassageiros1 = new javax.swing.JLabel();
        lbPesoTotal1 = new javax.swing.JLabel();
        btHomem2 = new javax.swing.JButton();
        btMulher2 = new javax.swing.JButton();
        btCrianca2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbTotalPassageiros2 = new javax.swing.JLabel();
        lbPesoTotal2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btHomem1.setText("Entrar Homem");
        btHomem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomem1ActionPerformed(evt);
            }
        });

        btMulher1.setText("Entrar Mulher");
        btMulher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMulher1ActionPerformed(evt);
            }
        });

        btCrianca1.setText("Entrar Criança");
        btCrianca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrianca1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total de passageiros:");

        jLabel2.setText("Peso total do Elevador:");

        lbTotalPassageiros1.setText("0");

        lbPesoTotal1.setText("0");

        btHomem2.setText("Entrar Homem");
        btHomem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomem2ActionPerformed(evt);
            }
        });

        btMulher2.setText("Entrar Mulher");
        btMulher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMulher2ActionPerformed(evt);
            }
        });

        btCrianca2.setText("Entrar Criança");
        btCrianca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrianca2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total de passageiros:");

        jLabel4.setText("Peso total do Elevador:");

        lbTotalPassageiros2.setText("0");

        lbPesoTotal2.setText("0");

        jLabel5.setText("Kg");

        jLabel6.setText("Kg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btHomem2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btMulher2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCrianca2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTotalPassageiros2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPesoTotal2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(btHomem1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btMulher1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btCrianca1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTotalPassageiros1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbPesoTotal1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHomem1)
                    .addComponent(btMulher1)
                    .addComponent(btCrianca1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTotalPassageiros1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbPesoTotal1)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHomem2)
                    .addComponent(btMulher2)
                    .addComponent(btCrianca2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbTotalPassageiros2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbPesoTotal2)
                    .addComponent(jLabel6))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHomem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomem1ActionPerformed
        elevador1.Entrar(elevador1,lbPesoTotal1, lbTotalPassageiros1,1);
    }//GEN-LAST:event_btHomem1ActionPerformed

    private void btMulher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMulher1ActionPerformed
        elevador1.Entrar(elevador1,lbPesoTotal1, lbTotalPassageiros1,2);
    }//GEN-LAST:event_btMulher1ActionPerformed

    private void btCrianca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrianca1ActionPerformed
        elevador1.Entrar(elevador1,lbPesoTotal1, lbTotalPassageiros1,3);
    }//GEN-LAST:event_btCrianca1ActionPerformed

    private void btHomem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomem2ActionPerformed
        elevador2.Entrar(elevador2,lbPesoTotal2, lbTotalPassageiros2,1);
    }//GEN-LAST:event_btHomem2ActionPerformed

    private void btMulher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMulher2ActionPerformed
        elevador2.Entrar(elevador2,lbPesoTotal2, lbTotalPassageiros2,2);
    }//GEN-LAST:event_btMulher2ActionPerformed

    private void btCrianca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrianca2ActionPerformed
        elevador2.Entrar(elevador2,lbPesoTotal2, lbTotalPassageiros2,3);
    }//GEN-LAST:event_btCrianca2ActionPerformed

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
    private javax.swing.JButton btCrianca1;
    private javax.swing.JButton btCrianca2;
    private javax.swing.JButton btHomem1;
    private javax.swing.JButton btHomem2;
    private javax.swing.JButton btMulher1;
    private javax.swing.JButton btMulher2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbPesoTotal1;
    private javax.swing.JLabel lbPesoTotal2;
    private javax.swing.JLabel lbTotalPassageiros1;
    private javax.swing.JLabel lbTotalPassageiros2;
    // End of variables declaration//GEN-END:variables
}
