package com.Proyecto.service;

import com.Proyecto.entity.Contacto;
import com.Proyecto.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class ContactoService implements IContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public List<Contacto> getAll() {
        return (List<Contacto>) contactoRepository.findAll();
    }

    @Override
    public Contacto getContactoById(long id) {
        return contactoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveContactos(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public void delete(long id) {
       contactoRepository.deleteById(id);    }

}
