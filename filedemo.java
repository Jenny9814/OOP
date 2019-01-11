/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class filedemo extends javax.swing.JFrame {

    /**
     * Creates new form filedemo
     */
    public filedemo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_view = new javax.swing.JTextArea();
        bt_exit = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        bt_open = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_view.setColumns(20);
        ta_view.setRows(5);
        jScrollPane1.setViewportView(ta_view);

        bt_exit.setText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_save.setText("Save");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_open.setText("Open");
        bt_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_open)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_exit)
                        .addGap(23, 23, 23)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_save)
                    .addComponent(bt_open)
                    .addComponent(bt_exit))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView()); //Chọn file 
        int returnvalue = jfc.showSaveDialog(null);  // Show dialog, chọn thư mục cần lưu
        // Hiển thị đường dẫn
        if(returnvalue == JFileChooser.APPROVE_OPTION){ // trả về giá trị yes/ok
            File selectedfile = jfc.getSelectedFile(); // Lấy ra đường dẫn r đặt trong text area để xem lấy đúng k
            try {
                // Thiết lập luồng dữ liệu -> đọc dl .. Nhập dữ liệu từ Text area sau đó bấm save thì lưu trong 1 file txt tạo tại thời điểm đó sau đó thông báo lưu thành công hay chưa? 
                // Đọc dữ liệu từ Text area sau đó lưu trong file dữ liệu
                FileWriter fw = new FileWriter(selectedfile.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(ta_view.getText()); // Lấy nội dung được nhập trong text area sau đó truyền cho bw.write
                bw.close();
                JOptionPane.showMessageDialog(null, " Đã lưu thành công! ","Thông báo",JOptionPane.INFORMATION_MESSAGE); // Thông báo đã lưu thành công hay chưa? 
            } catch (IOException ex) {
                Logger.getLogger(filedemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            //ta_view.setText(selectedfile.getAbsolutePath()); // Hiển thị đường dẫn của file trên text area
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void bt_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_openActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView()); //Chọn file 
        int returnvalue = jfc.showOpenDialog(null);  // Mở file
        if(returnvalue == JFileChooser.APPROVE_OPTION){ // trả về giá trị yes/ok
            File selectedfile = jfc.getSelectedFile(); // Lấy ra đường dẫn r đặt trong text area để xem lấy đúng k
            try {
                // Thiết lập luồng dữ liệu -> Đọc dữ liệu từ file lên text areaa
                FileReader fr = new FileReader(selectedfile.getAbsoluteFile());
                BufferedReader br = new BufferedReader(fr);
                String line = null; // hiển thị null thì k còn gì hiển thị nữa
                do{
                    line = br.readLine();
                    if(line != null){
                        ta_view.append(line + "\n");
                    }
                } while (line!=null);
                //ta_view.setText(selectedfile.getAbsolutePath()); // Hiển thị đường dẫn của file trên text area
            } catch (FileNotFoundException ex) {
                Logger.getLogger(filedemo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(filedemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bt_openActionPerformed

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
            java.util.logging.Logger.getLogger(filedemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filedemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filedemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filedemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filedemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_open;
    private javax.swing.JButton bt_save;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_view;
    // End of variables declaration//GEN-END:variables
}