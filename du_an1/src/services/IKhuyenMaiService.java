package services;

/*
 * Click nbfs://nsbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import domainmodels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Hung
 */
public interface IKhuyenMaiService {

    ArrayList<KhuyenMai> getAll();

    void create(KhuyenMai km);

    void update(KhuyenMai km, String id);

}
