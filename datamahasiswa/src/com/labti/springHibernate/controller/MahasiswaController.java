package com.labti.springHibernate.controller;

import com.labti.springHibernate.app;
import com.labti.springHibernate.config.MahasiswaTableModel;
import com.labti.springHibernate.model.Mahasiswa;
import com.labti.springHibernate.view.ViewMahasiswa;
import com.labti.springHibernate.service.MahasiswaService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
        
public class MahasiswaController {
    private final ViewMahasiswa viewMahasiswa;
    private MahasiswaTableModel mahasiswaTableModel;
    private List<Mahasiswa> mahasiswas;
    
    public MahasiswaController(ViewMahasiswa viewMahasiswa) {
        this.viewMahasiswa = viewMahasiswa;
    }
    
    public void tampilData() {
        mahasiswas = app.getMahasiswaService().getMahasiswas();
        mahasiswaTableModel = new MahasiswaTableModel(mahasiswas);
        this.viewMahasiswa.getTabel().setModel(mahasiswaTableModel);
    }
    
    public void show() {
        int index = this.viewMahasiswa.getTabel().getSelectedRow();
        this.viewMahasiswa.getNama().setText(String.valueOf(
        this.viewMahasiswa.getTabel().getValueAt(index, 0)));
        this.viewMahasiswa.getNpm().setText(String.valueOf(
        this.viewMahasiswa.getTabel().getValueAt(index, 1)));
        this.viewMahasiswa.getAlamat().setText(String.valueOf(
        this.viewMahasiswa.getTabel().getValueAt(index, 2)));
        this.viewMahasiswa.getKelas().setText(String.valueOf(
        this.viewMahasiswa.getTabel().getValueAt(index, 3)));
        this.viewMahasiswa.getUmur().setText(String.valueOf(
        this.viewMahasiswa.getTabel().getValueAt(index, 4)));
    }
    
    public void clear() {
        this.viewMahasiswa.getNama().setText("");
        this.viewMahasiswa.getNpm().setText("");
        this.viewMahasiswa.getAlamat().setText("");
        this.viewMahasiswa.getKelas().setText("");
        this.viewMahasiswa.getUmur().setText("");
    }
    
    public void saveMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(this.viewMahasiswa.getNama().getText());
        mahasiswa.setNpm(this.viewMahasiswa.getNpm().getText());
        mahasiswa.setAlamat(this.viewMahasiswa.getAlamat().getText());
        mahasiswa.setKelas(this.viewMahasiswa.getKelas().getText());
        mahasiswa.setUmur(this.viewMahasiswa.getUmur().getText());
        app.getMahasiswaService().save(mahasiswa);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info",
        JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateMahasiswa() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(this.viewMahasiswa.getNama().getText());
        mahasiswa.setNpm(this.viewMahasiswa.getNpm().getText());
        mahasiswa.setAlamat(this.viewMahasiswa.getAlamat().getText());
        mahasiswa.setKelas(this.viewMahasiswa.getKelas().getText());
        mahasiswa.setUmur(this.viewMahasiswa.getUmur().getText());
        app.getMahasiswaService().save(mahasiswa);
        JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info",
        JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteMahasiswa() {
        if(this.viewMahasiswa.getNama().getText() == null){
            JOptionPane.showMessageDialog(null, "Mahasiswa belum dipilih", "error",JOptionPane.ERROR_MESSAGE);
        }else{
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(this.viewMahasiswa.getNama().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(pilih == JOptionPane.YES_OPTION){
                app.getMahasiswaService().delete(mahasiswa);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}