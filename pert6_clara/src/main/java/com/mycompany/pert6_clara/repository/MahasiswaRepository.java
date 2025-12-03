/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pert6_clara.repository;

import com.mycompany.pert6_clara.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author clara
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {
    
}
