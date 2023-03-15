package com.Proyecto.service;
import com.Proyecto.entity.MyT;
import com.Proyecto.repository.MyTRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class MyTService implements IMyTService {

    @Autowired
    private MyTRepository mytRepository;

    @Override
    public List<MyT> getAll() {
        return (List<MyT>) mytRepository.findAll();
    }
     @Override
    public MyT getMyTById(long id) {
        return mytRepository.findById(id).orElse(null);
    }
        @Override
    public void saveMyT(MyT myt) {
        mytRepository.save(myt);
    }
        @Override
    public void delete(long id) {
        mytRepository.deleteById(id);
    }   
    
    
    
    
    
    
    
    
}
