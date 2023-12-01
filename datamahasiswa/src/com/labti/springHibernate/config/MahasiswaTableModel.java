package com.labti.springHibernate.config;

import com.labti.springHibernate.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MahasiswaTableModel extends AbstractTableModel {
    private List<Mahasiswa> mahasiswas = new ArrayList<>();
    private final String HEADER[] = {"Nama", "Npm", "Alamat", "Kelas", "Umur"};
    
    public MahasiswaTableModel(List<Mahasiswa> mahasiswas) {
	this.mahasiswas = mahasiswas;
    }
    
    @Override
    public int getRowCount() {
	return mahasiswas.size();
    }
    
    @Override
    public int getColumnCount() {
	return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
	return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	Mahasiswa mahasiswa = mahasiswas.get(rowIndex);
            switch (columnIndex) {
		case 0:
                    return mahasiswa.getNama();
		case 1:
                    return mahasiswa.getNpm();
		case 2:
                    return mahasiswa.getAlamat();
		case 3:
                    return mahasiswa.getKelas();
                case 4:
                    return mahasiswa.getUmur();
		default:
                    return null;
		}
    }
}

