package root.controller;

import java.util.List;
import root.dao.TablaDAO;
import root.entity.Tabla;

public class TablaController {
    private TablaDAO tablaDAO = new TablaDAO();

    public List<Tabla> getTablas() {
        return tablaDAO.findAll();
    }
    
    public Tabla getTabla(Integer id) {
        return tablaDAO.findById(id);
    }

    public void createTabla(Tabla tabla) {
        tablaDAO.create(tabla);
    }

    public void updateTabla(Integer id, Tabla tabla) {
        tabla.setId(id);
        tablaDAO.update(tabla);
    }

    public void deleteTabla(Integer id) {
    }
}
