
package prueba1.com.service.Impl;


import prueba1.com.dao.LibroDao;
import prueba1.com.domain.Libro;
import prueba1.com.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImpl implements LibroService {
    
    @Autowired
    private LibroDao libroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libro> getLibros() {
        return libroDao.findAll();
    }
}
