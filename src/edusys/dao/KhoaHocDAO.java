package edusys.dao;

import edusys.helper.XJDBC;
import edusys.entity.KhoaHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer>{

    @Override
    public void insert(KhoaHoc khoaHoc){
        String sql="Insert into KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) values (?, ?, ?, ?, ?, ?)";
        XJDBC.update(sql, khoaHoc.getMaCD(), khoaHoc.getHocPhi(), khoaHoc.getThoiLuong(), khoaHoc.getNgayKG(),khoaHoc.getGhiChu(),khoaHoc.getMaNV());
    }
    
    @Override
    public void update(KhoaHoc khoaHoc){
        String sql="Update KhoaHoc set MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? where MaKH=?";
        XJDBC.update(sql, khoaHoc.getMaCD(), khoaHoc.getHocPhi(), khoaHoc.getThoiLuong(), khoaHoc.getNgayKG(), khoaHoc.getGhiChu(),khoaHoc.getMaNV(),khoaHoc.getMaKH());
    }
    
    @Override
    public void delete(Integer MaKH){
        String sql="Delete from KhoaHoc where MaKH=?";
        XJDBC.update(sql, MaKH);
    }
    
    @Override
    public List<KhoaHoc> selectAll(){
        String sql="Select * from KhoaHoc";
        return selectBySql(sql);
    }
    
    @Override
    public KhoaHoc selectById(Integer MaKh){
        String sql="Select * from KhoaHoc where MaKH=?";
        List<KhoaHoc> list = selectBySql(sql, MaKh);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object...args){
        List<KhoaHoc> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while(rs.next()){
                    KhoaHoc kh = new KhoaHoc();
                    kh.setMaKH(rs.getInt("MaKH"));
                    kh.setHocPhi(rs.getDouble("HocPhi"));
                    kh.setThoiLuong(rs.getInt("ThoiLuong"));
                    kh.setNgayKG(rs.getDate("NgayKG"));
                    kh.setGhiChu(rs.getString("GhiChu"));
                    kh.setMaNV(rs.getString("MaNV"));
                    kh.setNgayTao(rs.getDate("NgayTao"));
                    kh.setMaCD(rs.getString("MaCD"));
                    list.add(kh);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    public List<KhoaHoc> selectByChuyenDe(String macd){
        String sql="Select * from KhoaHoc where MaCD=?";
        return this.selectBySql(sql, macd);
    }

    public List<Integer> selectYears() {
        String sql="Select distinct year(NgayKG) Year from KhoaHoc order by Year desc";
        List<Integer> list=new ArrayList<>();
        try {
           ResultSet rs = XJDBC.query(sql);
           while(rs.next()){
                 list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } 
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
