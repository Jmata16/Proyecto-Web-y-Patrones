package com.Proyecto.service;

import com.Proyecto.entity.Marca;
import java.util.List;

/**
 *
 * @author Pablo Guerrero
 */
public interface IMarcaService {
    public List<Marca> getAll();
    public Marca getMarcaById(long id);
    public void saveMarca(Marca Marca);
    public void delete(long id);
}
