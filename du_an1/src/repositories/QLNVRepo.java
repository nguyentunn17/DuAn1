/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import DOMAINMODELS.NhanVien;
import DOMAINMODELS.NhanVienVMD;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import utilities.DBContext;


/**
 *
 * @author Quang
 */
public class QLNVRepo {

    public ArrayList<NhanVien> listall() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from nhanvien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String gioiTinh = rs.getString("gioitinh");
                Date ngaySinh = rs.getDate("ngaysinh");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                int trangThai = rs.getInt("trangThai");
                String anh = rs.getString("anh");
                String idLuong = rs.getString("idluong");
                NhanVien nv = new NhanVien(id, ma, ten, gioiTinh, ngaySinh, diaChi, sdt, trangThai, anh, idLuong);
                list.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void insert(NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "insert into nhanvien "
                    + "(ma,ten,gioitinh,ngasinh,diachi,sdt,trangthai,anh)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getGioiTinh());
            ps.setDate(4, (java.sql.Date) nv.getNgaySinh());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getSdt());
            ps.setInt(7, nv.getTrangThai());
            ps.setString(8, nv.getAnh());
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(int id, NhanVien nv) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "update nhanvien set ma=?,ten=?,gioitinh=?,ngasinh=?,diachi=?,sdt=?,trangthai=?,anh=? where id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getGioiTinh());
            ps.setDate(4, (java.sql.Date) nv.getNgaySinh());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getSdt());
            ps.setInt(7, nv.getTrangThai());
            ps.setString(8, nv.getAnh());
            ps.setInt(9, id);
            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "delete nhanvien where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<NhanVienVMD> listLuong() {
        ArrayList<NhanVienVMD> listView = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select nhanvien.ma,ten,gioitinh,ngaysinh,diachi,sdt,matkhau,trangthai,anh,luong.mucluong from luong inner join nhanvien on luong.id=nhanvien.idluong ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("ma");
                String ten = rs.getString("ten");
                String gioiTinh = rs.getString("gioitinh");
                Date ngaySinh = rs.getDate("ngaysinh");
                String diaChi = rs.getString("diachi");
                String sdt = rs.getString("sdt");
                int trangThai = rs.getInt("trangThai");
                String anh = rs.getString("anh");
                double luong = rs.getDouble("luong");
                NhanVienVMD nhanVienVMD = new NhanVienVMD(ma, ten, gioiTinh, ngaySinh, diaChi, sdt, trangThai, anh, luong);
                listView.add(nhanVienVMD);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listView;
    }
}
