/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;

/**
 *
 * @author danie
 */
public class Calculadora extends javax.swing.JFrame {

  public float primerNumero;
  public float segundoNumero;
  public String operador;

  /**
   * Creates new form Calculadora
   */
  public Calculadora() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within
   * the constructor to initialize the
   * form. WARNING: Do NOT modify this
   * code. The content of this method is
   * always regenerated by the Form
   * Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    panel = new javax.swing.JLabel();
    jBmultiplicar = new javax.swing.JButton();
    jBdivision = new javax.swing.JButton();
    jBborrar = new javax.swing.JButton();
    jBresta = new javax.swing.JButton();
    jBsuma = new javax.swing.JButton();
    jBnueve = new javax.swing.JButton();
    jBsiete = new javax.swing.JButton();
    jBseis = new javax.swing.JButton();
    jBcuatro = new javax.swing.JButton();
    jBigual = new javax.swing.JButton();
    jBtres = new javax.swing.JButton();
    jBdos = new javax.swing.JButton();
    jBuno = new javax.swing.JButton();
    BPunto = new javax.swing.JButton();
    jBcero = new javax.swing.JButton();
    jBocho = new javax.swing.JButton();
    jBcinco = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(153, 255, 255));

    jPanel1.setBackground(new java.awt.Color(51, 153, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));

    panel.setBackground(new java.awt.Color(204, 255, 204));
    panel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
    panel.setForeground(new java.awt.Color(0, 102, 153));
    panel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    panel.setOpaque(true);

    jBmultiplicar.setText("*");
    jBmultiplicar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBmultiplicarActionPerformed(evt);
      }
    });

    jBdivision.setText("/");
    jBdivision.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBdivisionActionPerformed(evt);
      }
    });

    jBborrar.setText("C");
    jBborrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBborrarActionPerformed(evt);
      }
    });

    jBresta.setText("-");
    jBresta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBrestaActionPerformed(evt);
      }
    });

    jBsuma.setText("+");
    jBsuma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBsumaActionPerformed(evt);
      }
    });

    jBnueve.setText("9");
    jBnueve.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBnueveActionPerformed(evt);
      }
    });

    jBsiete.setText("7");
    jBsiete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBsieteActionPerformed(evt);
      }
    });

    jBseis.setText("6");
    jBseis.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBseisActionPerformed(evt);
      }
    });

    jBcuatro.setText("4");
    jBcuatro.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBcuatroActionPerformed(evt);
      }
    });

    jBigual.setText("=");
    jBigual.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBigualActionPerformed(evt);
      }
    });

    jBtres.setText("3");
    jBtres.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtresActionPerformed(evt);
      }
    });

    jBdos.setText("2");
    jBdos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBdosActionPerformed(evt);
      }
    });

    jBuno.setText("1");
    jBuno.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBunoActionPerformed(evt);
      }
    });

    BPunto.setText(".");
    BPunto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BPuntoActionPerformed(evt);
      }
    });

    jBcero.setText("0");
    jBcero.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBceroActionPerformed(evt);
      }
    });

    jBocho.setText("8");
    jBocho.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBochoActionPerformed(evt);
      }
    });

    jBcinco.setText("5");
    jBcinco.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBcincoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jBsiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jBcuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jBuno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(jBborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jBcinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                  .addComponent(jBdos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jBdivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jBocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addComponent(jBcero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jBtres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
              .addComponent(jBseis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(BPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jBmultiplicar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jBnueve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jBresta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jBsuma, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
              .addComponent(jBigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jBdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jBborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jBresta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jBnueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBsiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jBseis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBcuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBcinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jBsuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jBtres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBdos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBuno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(BPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jBcero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jBigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
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
  }// </editor-fold>//GEN-END:initComponents

  private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed

    this.panel.setText("");
  }//GEN-LAST:event_jBborrarActionPerformed

  private void jBochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBochoActionPerformed

    this.panel.setText(this.panel.getText() + "8");
  }//GEN-LAST:event_jBochoActionPerformed

  private void jBceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBceroActionPerformed

    this.panel.setText(this.panel.getText() + "0");
  }//GEN-LAST:event_jBceroActionPerformed

  private void jBmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmultiplicarActionPerformed

    this.primerNumero = Float.parseFloat(this.panel.getText());
    this.operador = "*";
    this.panel.setText("");
  }//GEN-LAST:event_jBmultiplicarActionPerformed

  private void jBdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdosActionPerformed

    this.panel.setText(this.panel.getText() + "2");
  }//GEN-LAST:event_jBdosActionPerformed

  private void BPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPuntoActionPerformed

    if(!this.panel.getText().contains(".")) {
      this.panel.setText(this.panel.getText() + ".");
    }
  }//GEN-LAST:event_BPuntoActionPerformed

  private void jBtresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtresActionPerformed
    // TODO add your handling code here:
    this.panel.setText(this.panel.getText() + "3");
  }//GEN-LAST:event_jBtresActionPerformed

  private void jBunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBunoActionPerformed
    // TODO add your handling code here:
    this.panel.setText(this.panel.getText() + "1");
  }//GEN-LAST:event_jBunoActionPerformed

  private void jBcuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcuatroActionPerformed
    // TODO add your handling code here:
    this.panel.setText(this.panel.getText() + "4");
  }//GEN-LAST:event_jBcuatroActionPerformed

  private void jBcincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcincoActionPerformed
    // TODO add your handling code here:
    this.panel.setText(this.panel.getText() + "5");
  }//GEN-LAST:event_jBcincoActionPerformed

  private void jBseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBseisActionPerformed
    // TODO add your handling code here:
    this.panel.setText(this.panel.getText() + "6");
  }//GEN-LAST:event_jBseisActionPerformed

  private void jBsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsieteActionPerformed

    this.panel.setText(this.panel.getText() + "7");
  }//GEN-LAST:event_jBsieteActionPerformed

  private void jBnueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnueveActionPerformed

    this.panel.setText(this.panel.getText() + "9");
  }//GEN-LAST:event_jBnueveActionPerformed

  private void jBsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsumaActionPerformed

    this.primerNumero = Float.parseFloat(this.panel.getText());
    this.operador = "+";
    this.panel.setText("");
  }//GEN-LAST:event_jBsumaActionPerformed

  private void jBigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBigualActionPerformed

    this.segundoNumero = Float.parseFloat(this.panel.getText());

    switch (this.operador) {
      case "+":
        this.panel.setText(quitarCero(this.primerNumero + this.segundoNumero));
        break;
      case "-":
        this.panel.setText(quitarCero(this.primerNumero - this.segundoNumero));
        break;
      case "*":
        this.panel.setText(quitarCero(this.primerNumero * this.segundoNumero));
        break;
      case "/":
        this.panel.setText(quitarCero(this.primerNumero / this.segundoNumero));
        break;
    }

  }//GEN-LAST:event_jBigualActionPerformed

  private void jBrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrestaActionPerformed

    this.primerNumero = Float.parseFloat(this.panel.getText());
    this.operador = "-";
    this.panel.setText("");
  }//GEN-LAST:event_jBrestaActionPerformed

  private void jBdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdivisionActionPerformed

    this.primerNumero = Float.parseFloat(this.panel.getText());
    this.operador = "/";
    this.panel.setText("");
  }//GEN-LAST:event_jBdivisionActionPerformed

  public String quitarCero(float resultado) {
    String numero = "";
    numero = Float.toString(resultado);
    if(resultado % 1 == 0){
      numero = numero.substring(0, numero.length()-2);
    }
    
    return numero;
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
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Calculadora().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BPunto;
  private javax.swing.JButton jBborrar;
  private javax.swing.JButton jBcero;
  private javax.swing.JButton jBcinco;
  private javax.swing.JButton jBcuatro;
  private javax.swing.JButton jBdivision;
  private javax.swing.JButton jBdos;
  private javax.swing.JButton jBigual;
  private javax.swing.JButton jBmultiplicar;
  private javax.swing.JButton jBnueve;
  private javax.swing.JButton jBocho;
  private javax.swing.JButton jBresta;
  private javax.swing.JButton jBseis;
  private javax.swing.JButton jBsiete;
  private javax.swing.JButton jBsuma;
  private javax.swing.JButton jBtres;
  private javax.swing.JButton jBuno;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel panel;
  // End of variables declaration//GEN-END:variables
}
