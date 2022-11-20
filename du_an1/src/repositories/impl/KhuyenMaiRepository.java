package repositories.impl;

import domainmodels.KhuyenMai;
import java.util.ArrayList;
import repositories.IKhuyenMaiRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hung
 */
public class KhuyenMaiRepository implements IKhuyenMaiRepository {

    @Override
    public ArrayList<KhuyenMai> getAll() {
        ArrayList<KhuyenMai> listkm = new ArrayList<>();
        try {
            Connection conn = utilities.DB_Context.getConnection();
            String query = "select * from khuyenmai";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                String hinhThuc = rs.getString(4);
                String giaTri = rs.getString(5);
                Date ngayBatDau = rs.getDate(6);
                Date ngayKetThuc = rs.getDate(7);
                int trangThai = rs.getInt(8);
                double dongiakhiGiam = rs.getDouble(9);
                KhuyenMai km = new KhuyenMai(id, ma, ten, hinhThuc, giaTri, ngayBatDau, ngayKetThuc, trangThai, dongiakhiGiam);
                listkm.add(km);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkm;
    }

    @Override
    public void create(KhuyenMai km) {
        try {
            Connection conn = utilities.DB_Context.getConnection();
            String query = "insert into khuyenmai(ma,ten,hinhthuc,giatri,ngaybatdau,ngayketthuc,trangthai) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setObject(1, km.getMa());
            ps.setObject(2, km.getTen());
            ps.setObject(3, km.getHinhThuc());
            ps.setObject(4, km.getGiaTri());
            ps.setObject(5, km.getNgayBatDau());
            ps.setObject(6, km.getNgayKetThuc());
            ps.setObject(7, km.getTrangThai());
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(KhuyenMai km, String id) {
    }

}
