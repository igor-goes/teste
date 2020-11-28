/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sprint3.igor;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Artilheiros = new javax.swing.JTextArea();
        btSaoPaulo = new javax.swing.JButton();
        btPalmeiras = new javax.swing.JButton();
        btSantos = new javax.swing.JButton();
        btJuventus = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Artilheiros");

        Artilheiros.setColumns(20);
        Artilheiros.setRows(5);
        jScrollPane1.setViewportView(Artilheiros);

        btSaoPaulo.setBackground(new java.awt.Color(255, 0, 0));
        btSaoPaulo.setText("São Paulo");
        btSaoPaulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaoPauloActionPerformed(evt);
            }
        });

        btPalmeiras.setBackground(new java.awt.Color(0, 204, 0));
        btPalmeiras.setText("Palmeiras");
        btPalmeiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalmeirasActionPerformed(evt);
            }
        });

        btSantos.setText("Santos");
        btSantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSantosActionPerformed(evt);
            }
        });

        btJuventus.setBackground(new java.awt.Color(102, 0, 0));
        btJuventus.setText("Juventus");
        btJuventus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJuventusActionPerformed(evt);
            }
        });

        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        jLabel2.setText("Maior Ídolo:");

        jLabel3.setText("Maior Freguês:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btsair)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btSaoPaulo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(btPalmeiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSantos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btJuventus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btsair)
                        .addGap(114, 114, 114)
                        .addComponent(btSaoPaulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btPalmeiras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSantos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btJuventus)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaoPauloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaoPauloActionPerformed
Artilheiros.setText("TOP 1 - Serginho Chulapa - Gols - 242 \n"
        + "TOP 2 - Gino Orlando - Gols - 233 \n"
        + "TOP 3 - Luís Fabiano - Gols - 212 \n"
        + "TOP 4 - Teixeirinha - Gols - 188 \n"
        + "TOP 5 - França - Gols - 182");
    }//GEN-LAST:event_btSaoPauloActionPerformed

    private void btSantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSantosActionPerformed
        Artilheiros.setText("TOP 1 - Pelé - 763 \n"
                + "TOP 2 - Pepe - Gols - 405 \n"
                + "TOP 3 - Coutinho - Gols - 370 \n"
                + "TOP 4 - Toninho Ferreiro - Gols - 283 \n"
                + "TOP 5 - Feitiço - Gols 216 ");
    }//GEN-LAST:event_btSantosActionPerformed

    private void btPalmeirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalmeirasActionPerformed
        Artilheiros.setText("TOP 1 - Heitor - 315 \n"
                + "TOP 2 - César Maluco - Gols - 182 \n"
                + "TOP 3 - Ademir da Guia - Gols - 155 \n"
                + "TOP 4 - Eduardo Lima - Gols - 148 \n"
                + "TOP 5 - Servillo - Gols 139 "); 

    }//GEN-LAST:event_btPalmeirasActionPerformed

    private void btJuventusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJuventusActionPerformed
        Artilheiros.setText("TOP 1 - Zuza - 89 \n"
                + "TOP 2 - Nenê - Gols - 74 \n"
                + "TOP 3 - Careca - Gols - 71 \n"
                + "TOP 4 - Augusto - Gols - 65 \n"
                + "TOP 5 - Zequinha - Gols 43 ");
    }//GEN-LAST:event_btJuventusActionPerformed

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        TelaUsuario login = new TelaUsuario();
        login.setVisible(true);
    }//GEN-LAST:event_btsairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Artilheiros;
    private javax.swing.JButton btJuventus;
    private javax.swing.JButton btPalmeiras;
    private javax.swing.JButton btSantos;
    private javax.swing.JButton btSaoPaulo;
    private javax.swing.JButton btsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
