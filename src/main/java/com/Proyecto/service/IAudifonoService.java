/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.service;

import com.Proyecto.entity.Audifono;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IAudifonoService {
    public List<Audifono> getAll();
    public Audifono getAudifonoById(long id);
    public void saveAudifono(Audifono audifono);
    public void delete(long id);
}
