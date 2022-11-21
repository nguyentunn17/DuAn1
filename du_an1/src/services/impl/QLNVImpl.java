/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import model.NhanVien;
import repositories.QLNVRepo;
import services.QLNVServices;
import viewmodel.NhanVienVMD;

/**
 *
 * @author Quang
 */
public class QLNVImpl implements QLNVServices {

    private QLNVRepo qLNVRepo;

    public QLNVImpl() {
        qLNVRepo = new QLNVRepo();
    }

    @Override
    public ArrayList<NhanVien> listAll() {
        return qLNVRepo.listall();
    }

    @Override
    public void insert(NhanVien nv) {
        qLNVRepo.insert(nv);
    }

    @Override
    public void update(int id, NhanVien nv) {
        qLNVRepo.update(id, nv);
    }

    @Override
    public void delete(int id) {
        qLNVRepo.delete(id);
    }

    @Override
    public ArrayList<NhanVienVMD> listLuong() {
        return qLNVRepo.listLuong();
    }

}
