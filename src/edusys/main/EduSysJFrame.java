/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edusys.main;

import edusys.helper.Auth;
import edusys.helper.MsgBox;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class EduSysJFrame extends javax.swing.JFrame {

    public EduSysJFrame() {
        initComponents();
        init();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnBangDiem = new javax.swing.JButton();
        btnLuongNguoiHoc = new javax.swing.JButton();
        btnDiemChuyenDe = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        pnlTrump = new javax.swing.JPanel();
        lblTrump = new javax.swing.JLabel();
        pnlStatusBar = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniBangDiem = new javax.swing.JMenuItem();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        mniDiemChuyenDe = new javax.swing.JMenuItem();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");

        toolBar.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/dangxuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        toolBar.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/ketthuc.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        toolBar.add(btnKetThuc);
        toolBar.add(jSeparator6);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/chuyende.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        toolBar.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/nguoihoc.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        toolBar.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/khoahoc.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        toolBar.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/hocvien.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        toolBar.add(btnHocVien);

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/nhanvien.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        toolBar.add(btnNhanVien);
        toolBar.add(jSeparator7);

        btnBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/diem.png"))); // NOI18N
        btnBangDiem.setText("Bảng điểm");
        btnBangDiem.setFocusable(false);
        btnBangDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBangDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangDiemActionPerformed(evt);
            }
        });
        toolBar.add(btnBangDiem);

        btnLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/luongnguoihoc.png"))); // NOI18N
        btnLuongNguoiHoc.setText("Lượng người học");
        btnLuongNguoiHoc.setFocusable(false);
        btnLuongNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLuongNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuongNguoiHocActionPerformed(evt);
            }
        });
        toolBar.add(btnLuongNguoiHoc);

        btnDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/diemchuyende.png"))); // NOI18N
        btnDiemChuyenDe.setText("Điểm chuyên đề");
        btnDiemChuyenDe.setFocusable(false);
        btnDiemChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiemChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemChuyenDeActionPerformed(evt);
            }
        });
        toolBar.add(btnDiemChuyenDe);

        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/doanhthu.png"))); // NOI18N
        btnDoanhThu.setText("Doanh thu");
        btnDoanhThu.setFocusable(false);
        btnDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoanhThu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        toolBar.add(btnDoanhThu);
        toolBar.add(jSeparator1);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/huongdan.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        toolBar.add(btnHuongDan);

        getContentPane().add(toolBar, java.awt.BorderLayout.NORTH);

        lblTrump.setBackground(new java.awt.Color(255, 255, 255));
        lblTrump.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrump.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/logo.png"))); // NOI18N
        lblTrump.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTrump.setOpaque(true);

        javax.swing.GroupLayout pnlTrumpLayout = new javax.swing.GroupLayout(pnlTrump);
        pnlTrump.setLayout(pnlTrumpLayout);
        pnlTrumpLayout.setHorizontalGroup(
            pnlTrumpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrumpLayout.createSequentialGroup()
                .addComponent(lblTrump, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        pnlTrumpLayout.setVerticalGroup(
            pnlTrumpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTrump, java.awt.BorderLayout.CENTER);

        pnlStatusBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlStatusBar.setLayout(new java.awt.BorderLayout());

        lblTrangThai.setText("Hệ quản lý đào tạo");
        lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        pnlStatusBar.add(lblTrangThai, java.awt.BorderLayout.CENTER);

        lblDongHo.setText("10:55 PM");
        lblDongHo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        pnlStatusBar.add(lblDongHo, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlStatusBar, java.awt.BorderLayout.SOUTH);

        mnuHeThong.setText("Hệ thống");

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/doimatkhau.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);

        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/dangxuat.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/ketthuc.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/chuyende.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên đề");
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/nguoihoc.png"))); // NOI18N
        mniNguoiHoc.setText("Người học");
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/khoahoc.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa học");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/hocvien.png"))); // NOI18N
        mniHocVien.setText("Học viên");
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);

        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/nhanvien.png"))); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        menuBar.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");

        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/diem.png"))); // NOI18N
        mniBangDiem.setText("Bảng điểm");
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiem);

        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/luongnguoihoc.png"))); // NOI18N
        mniLuongNguoiHoc.setText("Lượng người học");
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLuongNguoiHoc);

        mniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/diemchuyende.png"))); // NOI18N
        mniDiemChuyenDe.setText("Điểm chuyên đề");
        mniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemChuyenDe);

        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/doanhthu.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        menuBar.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/huongdan.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edusys/icon/gioithieu.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        menuBar.add(mnuTroGiup);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
        // TODO add your handling code here:
        openThongKe(0);
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void mniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemChuyenDeActionPerformed
        // TODO add your handling code here:
        openThongKe(2);
    }//GEN-LAST:event_mniDiemChuyenDeActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        // TODO add your handling code here:
        openThongKe(3);
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        // TODO add your handling code here:
        openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
        openThongKe(3);
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangDiemActionPerformed
        // TODO add your handling code here:
        openThongKe(0);
    }//GEN-LAST:event_btnBangDiemActionPerformed

    private void btnLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuongNguoiHocActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
    }//GEN-LAST:event_btnLuongNguoiHocActionPerformed

    private void btnDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemChuyenDeActionPerformed
        // TODO add your handling code here:
        openThongKe(2);
    }//GEN-LAST:event_btnDiemChuyenDeActionPerformed

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
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EduSysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangDiem;
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDiemChuyenDe;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnLuongNguoiHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrump;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemChuyenDe;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JPanel pnlStatusBar;
    private javax.swing.JPanel pnlTrump;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
private void init() {
  
        setLocationRelativeTo(null);

        new ManHinhChao(this, true).setVisible(true);
        new DangNhap(this, true).setVisible(true);
        this.startDongHo();
    }

    private void dangXuat() {
        Auth.clear();
        new DangNhap(this, true).setVisible(true);
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc chương trình !")) {
            System.exit(0);
        }
    }

    private void openNguoiHoc() {
        if (Auth.isLogin()) {
            new NguoiHocJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void openKhoaHoc() {
        if (Auth.isLogin()) {
            new KhoaHocJDialog(this, true).setVisible(true);

        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void openDoiMatKhau() {
        if (Auth.isLogin()) {
            new DoiMatKhau(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void openChuyenDe() {
        if (Auth.isLogin()) {
            new ChuyenDeJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void openNhanVien() {
        if (Auth.isLogin()) {
            new NhanVienJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }



    private void openThongKe(int index) {
        if (Auth.isLogin()) {
            if (index == 3 && !Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu");
            } else {
                ThongKeJDialog tkwin = new ThongKeJDialog(this, true);
                tkwin.setVisible(true);
                tkwin.selectTab(index);
            }
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

   

    private void openHocVien() {
        if (Auth.isLogin()) {
            new HocVienJDialog(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập !");
        }
    }

    private void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            lblDongHo.setText(formater.format(new Date()));
        }).start();
    }

}
