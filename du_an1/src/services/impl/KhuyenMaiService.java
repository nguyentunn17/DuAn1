/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodels.KhuyenMai;
import java.util.ArrayList;
import repositories.IKhuyenMaiRepository;
import repositories.impl.KhuyenMaiRepository;
import services.IKhuyenMaiService;

/**
 *
 * @author Hung
 */
public class KhuyenMaiService implements IKhuyenMaiService {

    private IKhuyenMaiRepository khuyenMaiRepository;

    public KhuyenMaiService() {
        this.khuyenMaiRepository = new KhuyenMaiRepository();
    }

    @Override
    public ArrayList<KhuyenMai> getAll() {
        return this.khuyenMaiRepository.getAll();
    }

    @Override
    public void create(KhuyenMai km) {
        this.khuyenMaiRepository.create(km);
    }

    @Override
    public void update(KhuyenMai km, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
