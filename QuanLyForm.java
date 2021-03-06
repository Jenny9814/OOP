/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTENDS_BAI1;

import java.util.ArrayList;

/**
 *
 * @author Nguyễn Xuân Anh Thư
 */
public class QuanLyForm extends javax.swing.JFrame {
    ArrayList<ChuyenXeNoiThanh> listXeNoi  = new ArrayList<>();
    ArrayList<ChuyenXeNgoaiThanh> listXeNgoai = new ArrayList<>();
    public QuanLyForm() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_machuyen = new javax.swing.JTextField();
        tf_taixe = new javax.swing.JTextField();
        tf_soxe = new javax.swing.JTextField();
        tf_Doanhthu = new javax.swing.JTextField();
        tf_loai = new javax.swing.JTextField();
        tf_sotuyen = new javax.swing.JTextField();
        tf_sokm = new javax.swing.JTextField();
        tf_noiden = new javax.swing.JTextField();
        tf_songaydi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_hienthi = new javax.swing.JTextArea();
        bt_thoat = new javax.swing.JButton();
        bt_themxe = new javax.swing.JButton();
        bt_dsxenoi = new javax.swing.JButton();
        bt_dsxengoai = new javax.swing.JButton();
        bt_dtxenoi = new javax.swing.JButton();
        bt_dtxengoai = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cb_loaixe = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Mã Chuyến");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Tài xế");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Số xe");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("DoanhThu");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Loại");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Số tuyến xe");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Số km đi được");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Nơi đến");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Số ngày đi");

        tf_machuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_machuyenActionPerformed(evt);
            }
        });

        tf_taixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_taixeActionPerformed(evt);
            }
        });

        tf_soxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_soxeActionPerformed(evt);
            }
        });

        tf_Doanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_DoanhthuActionPerformed(evt);
            }
        });

        tf_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_loaiActionPerformed(evt);
            }
        });

        tf_sotuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sotuyenActionPerformed(evt);
            }
        });

        tf_sokm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sokmActionPerformed(evt);
            }
        });

        tf_noiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_noidenActionPerformed(evt);
            }
        });

        tf_songaydi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_songaydiActionPerformed(evt);
            }
        });

        ta_hienthi.setColumns(20);
        ta_hienthi.setRows(5);
        jScrollPane1.setViewportView(ta_hienthi);

        bt_thoat.setForeground(new java.awt.Color(255, 51, 0));
        bt_thoat.setText("Thoát");
        bt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thoatActionPerformed(evt);
            }
        });

        bt_themxe.setForeground(new java.awt.Color(255, 0, 102));
        bt_themxe.setText("Thêm xe");
        bt_themxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themxeActionPerformed(evt);
            }
        });

        bt_dsxenoi.setForeground(new java.awt.Color(204, 102, 0));
        bt_dsxenoi.setText("DS Xe nội thành");
        bt_dsxenoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dsxenoiActionPerformed(evt);
            }
        });

        bt_dsxengoai.setForeground(new java.awt.Color(255, 51, 0));
        bt_dsxengoai.setText("DS Xe ngoại thành");
        bt_dsxengoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dsxengoaiActionPerformed(evt);
            }
        });

        bt_dtxenoi.setForeground(new java.awt.Color(51, 102, 0));
        bt_dtxenoi.setText("DT Xe nội thành");
        bt_dtxenoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dtxenoiActionPerformed(evt);
            }
        });

        bt_dtxengoai.setForeground(new java.awt.Color(153, 153, 0));
        bt_dtxengoai.setText("DT Xe ngoại thành");
        bt_dtxengoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dtxengoaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("QUẢN LÍ CÁC CHUYẾN XE");

        cb_loaixe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xe nội thành", "Xe ngoại thành" }));
        cb_loaixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loaixeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_themxe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_dsxenoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_dsxengoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_dtxenoi)
                        .addGap(18, 18, 18)
                        .addComponent(bt_dtxengoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_thoat)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_sokm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_sotuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_loai, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_soxe, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_machuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_taixe, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_Doanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_songaydi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_noiden, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(cb_loaixe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel10)))
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_machuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_soxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_loaixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_sotuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_sokm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_taixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_Doanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_noiden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_songaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_thoat)
                    .addComponent(bt_themxe)
                    .addComponent(bt_dsxenoi)
                    .addComponent(bt_dsxengoai)
                    .addComponent(bt_dtxenoi)
                    .addComponent(bt_dtxengoai))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_machuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_machuyenActionPerformed
       
    }//GEN-LAST:event_tf_machuyenActionPerformed

    private void tf_taixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_taixeActionPerformed
        
    }//GEN-LAST:event_tf_taixeActionPerformed

    private void tf_soxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_soxeActionPerformed
        
    }//GEN-LAST:event_tf_soxeActionPerformed

    private void tf_DoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_DoanhthuActionPerformed
        
    }//GEN-LAST:event_tf_DoanhthuActionPerformed

    private void tf_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_loaiActionPerformed
        
    }//GEN-LAST:event_tf_loaiActionPerformed

    private void tf_sotuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sotuyenActionPerformed
        
    }//GEN-LAST:event_tf_sotuyenActionPerformed

    private void tf_sokmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sokmActionPerformed
        
    }//GEN-LAST:event_tf_sokmActionPerformed

    private void tf_noidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_noidenActionPerformed
        
    }//GEN-LAST:event_tf_noidenActionPerformed

    private void tf_songaydiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_songaydiActionPerformed
        
    }//GEN-LAST:event_tf_songaydiActionPerformed

    private void bt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_thoatActionPerformed

    private void bt_themxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themxeActionPerformed
        String mc = this.tf_machuyen.getText();
        String tx = this.tf_taixe.getText();
        String sx = this.tf_soxe.getText();
        float dt = Float.parseFloat(this.tf_Doanhthu.getText()); // Chuyển kiểu dữ liệu Double sang chuỗi
        String lx = this.tf_loai.getText();
        String st = this.tf_sotuyen.getText(); 
        float sokm = Float.parseFloat(this.tf_sokm.getText()); //Chuyển kiểu dữ liệu từ float sang chuỗi
        String nd = this.tf_noiden.getText();
        int songaydi = Integer.parseInt(this.tf_songaydi.getText()); // Chuyển kiểu dữ liệu từ int sang chuỗi
        if(lx.equals("1")){
            ChuyenXeNoiThanh xenoi = new ChuyenXeNoiThanh(st,sokm,mc,tx,sx,dt);
            listXeNoi.add(xenoi);
            this.ta_hienthi.setText(xenoi.toString() + "\n");
        }
        else {
            ChuyenXeNgoaiThanh xengoai = new ChuyenXeNgoaiThanh(nd,songaydi,mc,tx,sx,dt);
            listXeNgoai.add(xengoai);
            this.ta_hienthi.setText(xengoai.toString() +"\n");
        }
        ta_hienthi.setText((String)cb_loaixe.getSelectedItem()); // Lấy nội dung của combo box -> Nhớ ép kiểu về String
        ta_hienthi.setText(cb_loaixe.getSelectedIndex() + " "); // Lấy vị trí của combo box - > Trả về kiểu số
        //this.ta_hienthi.append(this.tf_machuyen.getText() + "\n"); 
        // Lấy nội dung của test View dùng get, còn hiển thị ra nội dung thì dùng set
        // setText() là hiển thị nội dung nhưng khi thêm nd khác vô thì nó xóa nd cũ
        // append() là hiển thị nội dung và khi thêm nd khác vô thì nó vẫn giữ cái cũ
    }//GEN-LAST:event_bt_themxeActionPerformed

    private void bt_dsxenoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dsxenoiActionPerformed
        this.ta_hienthi.setText("");
        for(int i = 0;i<listXeNoi.size();i++){
            this.ta_hienthi.append(listXeNoi.get(i).toString() + "\n" );
        }
    }//GEN-LAST:event_bt_dsxenoiActionPerformed

    private void bt_dsxengoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dsxengoaiActionPerformed
        this.ta_hienthi.setText("");
        for(int i = 0;i<listXeNgoai.size();i++){
            this.ta_hienthi.append(listXeNgoai.get(i).toString() + "\n" );
        }
    }//GEN-LAST:event_bt_dsxengoaiActionPerformed

    private void bt_dtxenoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dtxenoiActionPerformed
        double doanhthu = 0.0;
        this.ta_hienthi.setText("");
        for(int i = 0;i<listXeNoi.size();i++){
            doanhthu += listXeNoi.get(i).getDoanhThu();
        }
        this.ta_hienthi.append("Tổng doanh thu xe nội: "+doanhthu);
    }//GEN-LAST:event_bt_dtxenoiActionPerformed

    private void bt_dtxengoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dtxengoaiActionPerformed
        double doanhthu = 0.0;
        this.ta_hienthi.setText("");
        for(int i = 0;i<listXeNgoai.size();i++){
            doanhthu += listXeNgoai.get(i).getDoanhThu();
        }
        this.ta_hienthi.append("Tổng doanh thu xe ngoại: " +doanhthu);
    }//GEN-LAST:event_bt_dtxengoaiActionPerformed

    private void cb_loaixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loaixeActionPerformed

    }//GEN-LAST:event_cb_loaixeActionPerformed
    
    

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dsxengoai;
    private javax.swing.JButton bt_dsxenoi;
    private javax.swing.JButton bt_dtxengoai;
    private javax.swing.JButton bt_dtxenoi;
    private javax.swing.JButton bt_themxe;
    private javax.swing.JButton bt_thoat;
    private javax.swing.JComboBox<String> cb_loaixe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_hienthi;
    private javax.swing.JTextField tf_Doanhthu;
    private javax.swing.JTextField tf_loai;
    private javax.swing.JTextField tf_machuyen;
    private javax.swing.JTextField tf_noiden;
    private javax.swing.JTextField tf_sokm;
    private javax.swing.JTextField tf_songaydi;
    private javax.swing.JTextField tf_sotuyen;
    private javax.swing.JTextField tf_soxe;
    private javax.swing.JTextField tf_taixe;
    // End of variables declaration//GEN-END:variables
}
