/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAO;

import com.mycompany.dominio.Banner;
import com.mycompany.dominio.Personaje;
import java.util.List;

/**
 *
 * @author joseb
 */
public interface IBannerDAO {
    public List<Banner> rellenarBanner();
    public List<Personaje> rellenarBannerPersonajes(List<Personaje> personajes);
}
