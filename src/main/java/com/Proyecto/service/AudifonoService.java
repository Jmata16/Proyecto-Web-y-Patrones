package com.Proyecto.service;

import com.Proyecto.entity.Audifono;
import com.Proyecto.repository.AudifonoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class AudifonoService implements IAudifonoService {

    @Autowired
    private AudifonoRepository audifonoRepository;

    @Override
    public List<Audifono> getAll() {
        return (List<Audifono>) audifonoRepository.findAll();
    }
    @Override
    public Audifono getAudifonoById(long id) {
        return audifonoRepository.findById(id).orElse(null);
    }
        @Override
    public void saveAudifono(Audifono audifono) {
        audifonoRepository.save(audifono);
    }
        @Override
    public void delete(long id) {
        audifonoRepository.deleteById(id);
    }
}
