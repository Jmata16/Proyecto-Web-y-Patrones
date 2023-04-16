
package com.Proyecto.service;

import com.Proyecto.entity.MyT;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IMyTService {
    public List<MyT> getAll();
    public MyT getMyTById(long id);
    public void saveMyT(MyT myt);
    public void delete(long id);
}
