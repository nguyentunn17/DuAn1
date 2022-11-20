/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import domainmodels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Hung
 */
public interface IKhuyenMaiRepository {

    ArrayList<KhuyenMai> getAll();

    void create(KhuyenMai km);

    void update(KhuyenMai km, String id);
}
