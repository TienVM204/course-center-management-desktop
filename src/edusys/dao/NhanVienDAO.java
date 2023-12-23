package edusys.dao;

import edusys.helper.XJDBC;
import edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO extends EduSysDAO<NhanVien, String>{
    @Override
    public void insert(NhanVien nhanVien){
        String sql="Insert into NhanVien (MaNV, MatKhau, HoTen, VaiTro) values (?, ?, ?, ?)";
        XJDBC.update(sql, nhanVien.getMaNV(), nhanVien.getMatKhau(), nhanVien.getHoTen(), nhanVien.getVaiTro());
    }
    
    @Override
    public void update(NhanVien nhanVien){
        String sql="Update NhanVien set MatKhau=?, HoTen=?, VaiTro=? where MaNV=?";
        XJDBC.update(sql, nhanVien.getMatKhau(), nhanVien.getHoTen(), nhanVien.getVaiTro(),nhanVien.getMaNV());
    }
    
    @Override
    public void delete(String MaNV){
        String sql="Delete from NhanVien where MaNV=?";
        XJDBC.update(sql, MaNV);
    }
    
    @Override
    public List<NhanVien> selectAll(){
        String sql="Select * from NhanVien";
        return this.selectBySql(sql);
    }
    
    @Override
    public NhanVien selectById(String MaNv){
        String sql="Select * from NhanVien where MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, MaNv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<NhanVien> selectBySql(String sql, Object...args){
        List<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while(rs.next()){
                    NhanVien entity=new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
