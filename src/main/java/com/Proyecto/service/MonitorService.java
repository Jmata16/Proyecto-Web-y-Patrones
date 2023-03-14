package com.Proyecto.service;

import com.Proyecto.entity.Monitor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Proyecto.repository.MonitorRepository;

/**
 * List<Pelicula> getAllPelicula
 *
 * @author jdmat
 */
@Service
public class MonitorService implements IMonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    @Override
    public List<Monitor> getAll() {
        return (List<Monitor>) monitorRepository.findAll();
    }

    @Override
    public Monitor getMonitorById(long id) {
        return monitorRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMonitor(Monitor monitor) {
        monitorRepository.save(monitor);
    }

    @Override
    public void delete(long id) {
        monitorRepository.deleteById(id);
    }
}
