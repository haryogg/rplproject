package com.labti.springHibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mahasiswa")

public class Mahasiswa {
    @Id
    @Column(name = "nama", length = 50)
    private String nama;
    
    @Column(name = "npm", length = 8)
    private String npm;
    
    @Column(name = "alamat", length = 150)
    private String alamat;
    
    @Column(name = "kelas", length = 10)
    private String kelas;
    
    @Column(name = "umur", length = 3)
    private String umur;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNpm() {
        return npm;
    }
    public void setNpm(String npm) {
        this.npm = npm;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getUmur() {
        return umur;
    }
    public void setUmur(String umur) {
        this.umur = umur;
    }
}
