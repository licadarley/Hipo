/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Natália
 */
public class Interface extends javax.swing.JFrame {
    
    Hipo h = new Hipo();
           
    
    public Interface() {
        initComponents();
        
        
        DefaultTableModel modeloTabela = (DefaultTableModel)registradores.getModel();
        
    }
    


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        executa = new javax.swing.JButton();
        executaLinha = new javax.swing.JButton();
        campoAI = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        registradores = new javax.swing.JTable();
        carregaArquivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoAC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoIO = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hipo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        hipo.setText("HIPO");

        entrada.setEditable(false);
        entrada.setColumns(20);
        entrada.setRows(5);
        jScrollPane2.setViewportView(entrada);

        executa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hipo/oie_1921911aa0uCJdB.png"))); // NOI18N
        executa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executaActionPerformed(evt);
            }
        });

        executaLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hipo/oie_J9gCctTJXiCS.png"))); // NOI18N
        executaLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executaLinhaActionPerformed(evt);
            }
        });

        campoAI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAIActionPerformed(evt);
            }
        });

        registradores.setAutoCreateRowSorter(true);
        registradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00", null},
                {"01", null},
                {"02", null},
                {"03", null},
                {"04", null},
                {"05", null},
                {"06", null},
                {"07", null},
                {"08", null},
                {"09", null},
                {"10", null},
                {"11", null},
                {"12", null},
                {"13", null},
                {"14", null},
                {"15", null},
                {"16", null},
                {"17", null},
                {"18", null},
                {"19", null},
                {"20", null},
                {"21", null},
                {"22", null},
                {"23", null},
                {"24", null},
                {"25", null},
                {"26", null},
                {"27", null},
                {"28", null},
                {"29", null},
                {"30", null},
                {"31", null},
                {"32", null},
                {"33", null},
                {"34", null},
                {"35", null},
                {"36", null},
                {"37", null},
                {"38", null},
                {"39", null},
                {"40", null},
                {"41", null},
                {"42", null},
                {"43", null},
                {"44", null},
                {"45", null},
                {"46", null},
                {"47", null},
                {"48", null},
                {"49", null},
                {"50", null},
                {"51", null},
                {"52", null},
                {"53", null},
                {"54", null},
                {"55", null},
                {"56", null},
                {"57", null},
                {"58", null},
                {"59", null},
                {"60", null},
                {"61", null},
                {"62", null},
                {"63", null},
                {"64", null},
                {"65", null},
                {"66", null},
                {"67", null},
                {"68", null},
                {"69", null},
                {"70", null},
                {"71", null},
                {"72", null},
                {"73", null},
                {"74", null},
                {"75", null},
                {"76", null},
                {"77", null},
                {"78", null},
                {"79", null},
                {"80", null},
                {"81", null},
                {"82", null},
                {"83", null},
                {"84", null},
                {"85", null},
                {"86", null},
                {"87", null},
                {"88", null},
                {"89", null},
                {"90", null},
                {"91", null},
                {"92", null},
                {"93", null},
                {"94", null},
                {"95", null},
                {"96", null},
                {"97", null},
                {"98", null},
                {"99", null}
            },
            new String [] {
                "Registrador", "Conteudo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registradores.setColumnSelectionAllowed(true);
        registradores.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(registradores);
        registradores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        carregaArquivo.setText("Carregar arquivo");
        carregaArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregaArquivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText(" Instrução");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Acumulador");

        campoAC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoACActionPerformed(evt);
            }
        });

        campoIO.setColumns(20);
        campoIO.setRows(5);
        jScrollPane1.setViewportView(campoIO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(executaLinha)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(executa)
                                        .addComponent(campoAI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoAC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(carregaArquivo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(hipo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hipo)
                .addGap(110, 110, 110)
                .addComponent(executa)
                .addGap(18, 18, 18)
                .addComponent(executaLinha)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carregaArquivo)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAIActionPerformed

    private void carregaArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregaArquivoActionPerformed
        // carrega arquivo na tela
        int end;
        
        DefaultTableModel modeloTabela = (DefaultTableModel)registradores.getModel();
        for(int k=0;k<100;k++){
            modeloTabela.setValueAt(0, k, 1);
        }               
        
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();

        try {
            FileReader reader = new FileReader(f);
            BufferedReader br = new BufferedReader(reader);
            Scanner in = new Scanner(f);

            entrada.read(br,null);
            br.close();
            entrada.requestFocus();                           
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_carregaArquivoActionPerformed

    private void executaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executaActionPerformed
        //executa toda entrada
        int cont;
        int quant = entrada.getLineCount();   
        String vetor[] = new String[quant];
        
        String l1[] = new String[quant];
        String l2[] = new String[quant];
        String l3[] = new String[quant];
        
        DefaultTableModel modeloTabela = (DefaultTableModel)registradores.getModel();

        
        for(int i=0;i<quant;i++){         //copia entrada para vetor (cada vetor contem uma intrucao)
           
            try {
                int inicio = entrada.getLineStartOffset(i);
                int fim = entrada.getLineEndOffset(i);
                String linha = entrada.getText(inicio, fim - inicio);
                vetor[i] = linha;
                //System.out.println(linha);
                
            } catch (BadLocationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(int i=0;i<quant;i++){
            
            cont = i+1;
            String ai = Integer.toString(cont);
            campoAI.setText(ai);
            h.setAI(i); //atualiza contador de intrucao
            
                       
            String acNum= Integer.toString(h.getAC());
            campoAC.setText(acNum);

            l1[i] = vetor[i].substring(0, 1);  // sinal
            l2[i] = vetor[i].substring(1, 3);  // instrucao
            l3[i] = vetor[i].substring(3, 5);  // endereco
           //System.out.println(l1[i]);
            //System.out.println(l2[i]);
            //System.out.println(l3[i]);
        
            if("00".equals(l2[i])){
                //eh um dado
                
                String dado = h.caracteres(l1[i],l3[i]);
                System.out.println(dado);
                if(dado == "0"
                        || dado=="-1" 
                        || dado=="1" 
                        || dado=="-2" 
                        || dado=="2" 
                        || dado=="-3" 
                        || dado=="3" 
                        || dado=="-4" 
                        || dado=="4" 
                        || dado=="-5" 
                        || dado=="5" 
                        || dado=="-6" 
                        || dado=="6"
                        || dado=="-7"
                        || dado=="7" 
                        || dado=="-8" 
                        || dado=="8" 
                        || dado=="-9" 
                        || dado=="9"){
                   int dadoNum = Integer.parseInt(dado);        
                   modeloTabela.setValueAt(dadoNum, i, 1);  //coloca numero na tabela
                   h.memoria[i] = dadoNum;
                }else{
                   modeloTabela.setValueAt(dado, i, 1);     //coloca letra na tabela
                }               
            }
            
            else{
                //eh instrucao
                int testajump =h.executa(l1[i], l2[i], l3[i]);      //pular de instrucao, troca a iteracao do for (gambiarra)
                if(testajump!=100){
                    i=testajump-1;
                }
            }
            
        }
        
        for(int k=0;k<100;k++){
            modeloTabela.setValueAt(h.memoria[k], k, 1);
        }
        
        
    }//GEN-LAST:event_executaActionPerformed

    private void executaLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executaLinhaActionPerformed
        /*
        int cont;
        int quant = entrada.getLineCount();   
        String vetor[] = new String[quant];
        
        String l1[] = new String[quant];
        String l2[] = new String[quant];
        String l3[] = new String[quant];
        
        DefaultTableModel modeloTabela = (DefaultTableModel)registradores.getModel();

        
        for(int i=0;i<quant;i++){         //copia entrada para vetor (cada vetor contem uma intrucao)
           
            try {   
                int inicio = entrada.getLineStartOffset(i);
                int fim = entrada.getLineEndOffset(i);
                String linha = entrada.getText(inicio, fim - inicio);
                vetor[i] = linha;
                //System.out.println(vetor[i]);
                
            } catch (BadLocationException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        int inst=h.getAI();
        String ai = Integer.toString(inst);
        campoAI.setText(ai);
        
        //String acNum= Integer.toString(h.getAC());
        //campoAC.setText(acNum); 
        
        int testajump =h.executa(l1[inst], l2[inst], l3[inst]);      //pular de instrucao, troca a iteracao do for (gambiarra)
        
        if(testajump!=100){
            inst=testajump-1;
            h.setAI(inst);
        }
        
        for(int k=0;k<100;k++){
            modeloTabela.setValueAt(h.memoria[k], k, 1);
        }*/
    }//GEN-LAST:event_executaLinhaActionPerformed

    private void campoACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoACActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoAC;
    private javax.swing.JTextField campoAI;
    private javax.swing.JTextArea campoIO;
    private javax.swing.JButton carregaArquivo;
    private javax.swing.JTextArea entrada;
    private javax.swing.JButton executa;
    private javax.swing.JButton executaLinha;
    private javax.swing.JLabel hipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable registradores;
    // End of variables declaration//GEN-END:variables

}
