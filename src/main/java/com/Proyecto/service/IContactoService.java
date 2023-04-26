package com.Proyecto.service;

import com.Proyecto.entity.Contacto;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IContactoService {

    public List<Contacto> getAll();

    public Contacto getContactoById(long id);

    public void saveContactos(Contacto contacto);

    public void delete(long id);
}
