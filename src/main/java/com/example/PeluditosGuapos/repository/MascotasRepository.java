package com.example.PeluditosGuapos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PeluditosGuapos.models.MascotasModel;


@Repository
public interface MascotasRepository extends CrudRepository<MascotasModel, Integer>{

    
} 