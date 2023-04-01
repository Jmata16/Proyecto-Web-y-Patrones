package com.Proyecto.repository;


import com.Proyecto.entity.MyT;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jdmat
 */
@Repository
public interface MyTRepository extends CrudRepository<MyT, Long> {
    
}
