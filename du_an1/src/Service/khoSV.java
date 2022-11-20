/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.ArrayList;
import viewModel.kho;

/**
 *
 * @author Phuong
 */
public interface khoSV {
    ArrayList<kho> getlist();
    String insert(kho k);
    String Update(String MaKho ,kho k);
    String delete(String MaKho);
}
