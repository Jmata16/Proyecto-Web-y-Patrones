package com.Proyecto.repository;

import com.Proyecto.entity.Audifono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jdmat
 */
@Repository
public interface AudifonoRepository extends CrudRepository<Audifono, Long> {
}
