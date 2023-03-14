package com.Proyecto.repository;

import com.Proyecto.entity.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jdmat
 */
@Repository
public interface MonitorRepository extends CrudRepository<Monitor,Long>{
    
}
