package com.Proyecto.repository;

import com.Proyecto.entity.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pablo Guerrero
 */
@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    
}
