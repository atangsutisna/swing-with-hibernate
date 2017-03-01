/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.model;


import java.util.List;
import javax.swing.table.AbstractTableModel;
import simplepresenceapp.HibernateUtil;

/**
 *
 * @author atang
 */
public class JabatanTableModel extends AbstractTableModel {
    private static final String[] columnNames = {"ID", "Nama Jabatan"};
    private List<Jabatan> data;
    
    public JabatanTableModel(List<Jabatan> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        if (data == null) {
            return 0;
        }
        
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return data.get(rowIndex).getId();
            case 1: return data.get(rowIndex).getNama();
        }
        
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Integer.class;
        }
        
        if (columnIndex == 1) {
            return String.class;
        }
        
        throw new IllegalArgumentException(String.format("Undefined columnIndex %s", columnIndex));        
    }
    
}
