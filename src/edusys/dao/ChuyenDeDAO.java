package edusys.dao;

import edusys.helper.XJDBC;
import edusys.entity.ChuyenDe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{

    @Override
    public void insert(ChuyenDe chuyende){
        String sql="Insert into ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) values (?, ?, ?, ?, ?, ?)";
        XJDBC.update(sql,chuyende.getMaCD(),chuyende.getTenCD(),chuyende.getHocPhi(),chuyende.getThoiLuong(), chuyende.getHinh(),chuyende.getMoTa());
    }
    
    @Override
    public void update(ChuyenDe chuyende){
        String sql="Update ChuyenDe set TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? where MaCD=?";
        XJDBC.update(sql,chuyende.getTenCD(),chuyende.getHocPhi(), chuyende.getThoiLuong(), chuyende.getHinh(), chuyende.getMoTa(),chuyende.getMaCD());
    }
    
    @Override
    public void delete(String MaCD){
        String sql="Delete ChuyenDe where MaCD=?";
        XJDBC.update(sql, MaCD);
    }
    
    @Override
    public List<ChuyenDe> selectAll(){
        String sql="Select * from ChuyenDe";
        return selectBySql(sql);
    }
    
    @Override
    public ChuyenDe selectById(String MaCd){
        String sql="Select * from ChuyenDe where MaCD=?";
        List<ChuyenDe> list = selectBySql(sql,  MaCd);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object...args){
        List<ChuyenDe> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJDBC.query(sql, args);
                while(rs.next()){
                    ChuyenDe cd = new ChuyenDe();
                    cd.setMaCD(rs.getString("MaCD"));
                    cd.setHinh(rs.getString("Hinh"));
                    cd.setHocPhi(rs.getDouble("HocPhi"));
                    cd.setMoTa(rs.getString("MoTa"));
                    cd.setTenCD(rs.getString("TenCD"));
                    cd.setThoiLuong(rs.getInt("ThoiLuong"));
                    list.add(cd);
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
}
