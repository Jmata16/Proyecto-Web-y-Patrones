package com.Proyecto.service;

import com.Proyecto.entity.Monitor;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IMonitorService {

    public List<Monitor> getAll();

    public Monitor getMonitorById(long id);

    public void saveMonitor(Monitor monitor);

    public void delete(long id);
}
