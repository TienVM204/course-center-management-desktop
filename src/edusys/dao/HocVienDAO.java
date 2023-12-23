package edusys.dao;

import edusys.helper.XJDBC;
import edusys.entity.HocVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocVienDAO extends EduSysDAO<HocVien, Integer>{

    @Override
    public void insert(HocVien hocVien){
        String sql="Insert into HocVien(MaKH, MaNH, Diem) values(?, ?, ?)";
        XJDBC.update(sql,hocVien.getMaKH(), hocVien.getMaNH(),hocVien.getDiem());
    }
    
    @Override
    public void update(HocVien hocVien){
        String sql="Update HocVien set MaKH=?, MaNH=?, Diem=? where MaHV=?";
        XJDBC.update(sql, hocVien.getMaKH(), hocVien.getMaNH(), hocVien.getDiem(), hocVien.getMaHV());
    }
    
    @Override
    public void delete(Integer MaHV){
        String sql="Delete from HocVien where MaHV=?";
        XJDBC.update(sql, MaHV);
    }
    
    @Override
    public List<HocVien> selectAll(){
        String sql="Select * from HocVien";
        return selectBySql(sql);
    }
    
    @Override
    public HocVien selectById(Integer MaHv){
        String sql="Select * from HocVien where MaHV=?";
        List<HocVien> list = selectBySql(sql, MaHv);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<HocVien> selectBySql(String sql, Object...args){
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while(rs.next()){
                    HocVien hv =new HocVien();
                    hv.setMaHV(rs.getInt("MaHV"));
                    hv.setMaKH(rs.getInt("MaKH"));
                    hv.setMaNH(rs.getString("MaNH"));
                    hv.setDiem(rs.getDouble("Diem"));
                    list.add(hv);
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

    public List<HocVien> selectByKhoaHoc(int makh) {
        String sql="Select * from HocVien where MaKH=?";
        return this.selectBySql(sql, makh);
    }
}
