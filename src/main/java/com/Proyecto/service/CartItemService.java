package com.Proyecto.service;

import com.Proyecto.entity.Audifono;
import com.Proyecto.entity.CartItem;
import com.Proyecto.entity.Monitor;
import com.Proyecto.entity.MyT;
import com.Proyecto.repository.CartItemRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo Guerrero
 */
@Service
public class CartItemService implements ICartItemService {
    
    CartItem cartItem;
    
    @Autowired
    private CartItemRepository cartRepository;
    
    public void addAudifonoToCart(Audifono audifono){
        CartItem cartItem = new CartItem();
        cartItem.setNombre(audifono.getNombre_audifono());
        cartItem.setMarca(audifono.getMarca().getMarca());
        cartItem.setPrecio(audifono.getPrecio_audifono());
        cartItem.setCantidad(1);
        cartRepository.save(cartItem);
    }
    
    public void addMonitorToCart(Monitor monitor){
        CartItem cartItem = new CartItem();
        cartItem.setNombre(monitor.getModelo());
        cartItem.setMarca(monitor.getMarca().getMarca());
        cartItem.setPrecio(monitor.getCosto());
        cartItem.setCantidad(1);
        cartRepository.save(cartItem);
    }
    
    public void addMyTToCart(MyT myt){
        CartItem cartItem = new CartItem();
        cartItem.setNombre(myt.getNombre_myt());
        cartItem.setMarca(myt.getMarca().getMarca());
        cartItem.setPrecio(myt.getPrecio_myt());
        cartItem.setCantidad(1);
        cartRepository.save(cartItem);
    }
    
    @Override
    public List<CartItem> getAll(){
        return (List<CartItem>) cartRepository.findAll();
    }
    
    private List<CartItem> cartItems = new ArrayList<>();
    
    public void borrarCarrito(){
        cartRepository.deleteAll();
    }
    
    public void borrarItem(Long id){
        cartRepository.deleteById(id);
    }

    
    public void getById(Long id){
        cartRepository.findById(id);
    }
    
    
}
