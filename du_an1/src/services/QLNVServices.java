/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import viewmodel.NhanVienVMD;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author Quang
 */
public interface QLNVServices {

    ArrayList<NhanVien> listAll();

    void insert(NhanVien nv);

    void update(int id, NhanVien nv);

    void delete(int id);
    
    ArrayList<NhanVienVMD>listLuong();
}
