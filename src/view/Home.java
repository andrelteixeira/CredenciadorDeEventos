/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.credenciamento.CadastroCredenciamento;
import view.evento.ConsultaEventos;
import view.json.JsonExporta;
import view.json.JsonImporta;
import view.pessoas.ConsultaPessoas;
import view.usuario.CadastroUsuarios;
import view.usuario.ConsultaUsuarios;

/**
 *
 * @author Andre Teixeira
 */
public class Home extends javax.swing.JFrame {

    private String[] usuario;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String[] info) {
        inicia();
        usuario = info;
        if (!usuario[1].equals("true")) {
            menu_json.setVisible(false);
            menu_usuario.setVisible(false);
        }

    }

    private void inicia() {
        initComponents();
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_desk = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        menu_evento = new javax.swing.JMenu();
        menu_pessoa = new javax.swing.JMenu();
        menu_usuario = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menu_json = new javax.swing.JMenu();
        menu_json_importar = new javax.swing.JMenuItem();
        menu_json_exportar = new javax.swing.JMenuItem();
        menu_ajuda = new javax.swing.JMenu();
        menu_ajuda_informacoes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_ajuda_trocar = new javax.swing.JMenuItem();
        menu_ajuda_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Credenciador De Eventos");

        pn_desk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pn_deskLayout = new javax.swing.GroupLayout(pn_desk);
        pn_desk.setLayout(pn_deskLayout);
        pn_deskLayout.setHorizontalGroup(
            pn_deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        pn_deskLayout.setVerticalGroup(
            pn_deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        menu_evento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/event.png"))); // NOI18N
        menu_evento.setText("Eventos");
        menu_evento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_eventoMouseClicked(evt);
            }
        });
        menu.add(menu_evento);

        menu_pessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/person.png"))); // NOI18N
        menu_pessoa.setText("Pessoas");
        menu_pessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_pessoaMouseClicked(evt);
            }
        });
        menu.add(menu_pessoa);

        menu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/supervisor.png"))); // NOI18N
        menu_usuario.setText("Usuarios");
        menu_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_usuarioMouseClicked(evt);
            }
        });
        menu.add(menu_usuario);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/share.png"))); // NOI18N
        jMenu1.setText("Inscrições");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        menu.add(jMenu1);

        menu_json.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/cloud.png"))); // NOI18N
        menu_json.setText("JSON");

        menu_json_importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/cloud_download.png"))); // NOI18N
        menu_json_importar.setText("Importar");
        menu_json_importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_json_importarActionPerformed(evt);
            }
        });
        menu_json.add(menu_json_importar);

        menu_json_exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/cloud_upload.png"))); // NOI18N
        menu_json_exportar.setText("Exportar");
        menu_json_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_json_exportarActionPerformed(evt);
            }
        });
        menu_json.add(menu_json_exportar);

        menu.add(menu_json);

        menu_ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/info.png"))); // NOI18N
        menu_ajuda.setText("Ajuda");

        menu_ajuda_informacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/account.png"))); // NOI18N
        menu_ajuda_informacoes.setText("Minhas Informações");
        menu_ajuda_informacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ajuda_informacoesActionPerformed(evt);
            }
        });
        menu_ajuda.add(menu_ajuda_informacoes);
        menu_ajuda.add(jSeparator1);

        menu_ajuda_trocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/loop.png"))); // NOI18N
        menu_ajuda_trocar.setText("Trocar Usuario");
        menu_ajuda_trocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ajuda_trocarActionPerformed(evt);
            }
        });
        menu_ajuda.add(menu_ajuda_trocar);

        menu_ajuda_sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menu_ajuda_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sistema/1x/power_settings_new.png"))); // NOI18N
        menu_ajuda_sair.setText("Sair");
        menu_ajuda_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ajuda_sairActionPerformed(evt);
            }
        });
        menu_ajuda.add(menu_ajuda_sair);

        menu.add(menu_ajuda);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_desk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_eventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_eventoMouseClicked
        ConsultaEventos tela = new ConsultaEventos(usuario);
        tela.setVisible(true);
        pn_desk.add("Lista Eventos", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_eventoMouseClicked

    private void menu_pessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_pessoaMouseClicked
        ConsultaPessoas tela = new ConsultaPessoas(usuario);
        tela.setVisible(true);
        pn_desk.add("Lista Pessoas", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_pessoaMouseClicked

    private void menu_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_usuarioMouseClicked
        ConsultaUsuarios tela = new ConsultaUsuarios(usuario);
        tela.setVisible(true);
        pn_desk.add("Lista Usuarios", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_usuarioMouseClicked

    private void menu_json_importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_json_importarActionPerformed
        JsonImporta tela = new JsonImporta();
        tela.setVisible(true);
        pn_desk.add("Importa Arquivos", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_json_importarActionPerformed

    private void menu_json_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_json_exportarActionPerformed
        JsonExporta tela = new JsonExporta();
        tela.setVisible(true);
        pn_desk.add("Exporta Json", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_json_exportarActionPerformed

    private void menu_ajuda_informacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ajuda_informacoesActionPerformed
        CadastroUsuarios tela = new CadastroUsuarios(Integer.parseInt(usuario[0]), usuario);
        tela.setVisible(true);
        pn_desk.add("Cadastro De Usuarios", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_menu_ajuda_informacoesActionPerformed

    private void menu_ajuda_trocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ajuda_trocarActionPerformed
        Login tela = new Login();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_ajuda_trocarActionPerformed

    private void menu_ajuda_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ajuda_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_ajuda_sairActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        CadastroCredenciamento tela = new CadastroCredenciamento(usuario);
        tela.setVisible(true);
        pn_desk.add("Cadastro De Usuarios", tela);
        pn_desk.moveToFront(tela);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_ajuda;
    private javax.swing.JMenuItem menu_ajuda_informacoes;
    private javax.swing.JMenuItem menu_ajuda_sair;
    private javax.swing.JMenuItem menu_ajuda_trocar;
    private javax.swing.JMenu menu_evento;
    private javax.swing.JMenu menu_json;
    private javax.swing.JMenuItem menu_json_exportar;
    private javax.swing.JMenuItem menu_json_importar;
    private javax.swing.JMenu menu_pessoa;
    private javax.swing.JMenu menu_usuario;
    private javax.swing.JDesktopPane pn_desk;
    // End of variables declaration//GEN-END:variables
}
