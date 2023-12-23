package edusys.dao;

import edusys.helper.XJDBC;
import edusys.entity.NguoiHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String>{

    @Override
    public void insert(NguoiHoc nguoiHoc){
        String sql="Insert into NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) values (?, ?, ?, ?, ?, ?, ?, ?)";
        XJDBC.update(sql, nguoiHoc.getMaNH(), nguoiHoc.getHoTen(), nguoiHoc.getNgaySinh(), nguoiHoc.getGioiTinh(), nguoiHoc.getDienThoai(),nguoiHoc.getEmail(),nguoiHoc.getGhiChu(),nguoiHoc.getMaNV());
    }
    
    @Override
    public void update(NguoiHoc nguoiHoc){
        String sql="Update NguoiHoc set HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?, MaNV=? where MaNH=?";
        XJDBC.update(sql, nguoiHoc.getHoTen(), nguoiHoc.getNgaySinh(), nguoiHoc.getGioiTinh(), nguoiHoc.getDienThoai(),nguoiHoc.getEmail(),nguoiHoc.getGhiChu(),nguoiHoc.getMaNV(),nguoiHoc.getMaNH());
    }
    
    @Override
    public void delete(String MaNH){
        String sql="Delete from NguoiHoc where MaNH=?";
        XJDBC.update(sql, MaNH);
    }
    
    @Override
    public List<NguoiHoc> selectAll(){
        String sql="Select * from NguoiHoc";
        return selectBySql(sql);
    }
    
    @Override
    public NguoiHoc selectById(String MaNh){
        String sql="Select * from NguoiHoc where MaNH=?";
        List<NguoiHoc> list = selectBySql(sql, MaNh);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object...args){
        List<NguoiHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while(rs.next()){
                    NguoiHoc nh = new NguoiHoc();
                    nh.setMaNH(rs.getString("MaNH"));
                    nh.setHoTen(rs.getString("HoTen"));
                    nh.setNgaySinh(rs.getDate("NgaySinh"));
                    nh.setGioiTinh(rs.getBoolean("GioiTinh"));
                    nh.setDienThoai(rs.getString("DienThoai"));
                    nh.setEmail(rs.getString("Email"));
                    nh.setGhiChu(rs.getString("GhiChu"));
                    nh.setMaNV(rs.getString("MaNV"));
                    nh.setNgayDK(rs.getDate("NgayDK"));
                    list.add(nh);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<NguoiHoc> selectByKeyword(String keyword){
        String sql="Select * from NguoiHoc where HoTen like ?";
        return this.selectBySql(sql, "%"+keyword+"%");
    }

    public List<NguoiHoc> selectNotInCourse(int maKh, String keyword) {
        String sql="Select * from NguoiHoc where HoTen like ? and  MaNH not in (Select MaNH from HocVien where MaKH=?)";
        return this.selectBySql(sql, "%"+keyword+"%", maKh);
    }
}
