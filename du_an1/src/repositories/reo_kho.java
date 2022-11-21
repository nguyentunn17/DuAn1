/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import viewmodels.kho;

/**
 *
 * @author Phuong
 */
public interface reo_kho {
    ArrayList<kho> getAll();

    boolean insert(kho k);

    boolean Update(String MaKho, kho k);

    boolean delete(String MaKho);
}
