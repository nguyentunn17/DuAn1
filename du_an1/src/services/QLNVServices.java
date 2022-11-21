/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import DOMAINMODELS.NhanVien;
import DOMAINMODELS.NhanVienVMD;
import java.util.ArrayList;

/**
 *
 * @author Quang
 */
public interface QLNVServices {

    ArrayList<NhanVien> listAll();

    void insert(NhanVien nv);

    void update(String ma, NhanVien nv);

    void delete(String ma);
    
    ArrayList<NhanVienVMD>listViewMoDel();
}
