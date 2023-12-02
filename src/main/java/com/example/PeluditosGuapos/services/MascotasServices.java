package com.example.PeluditosGuapos.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PeluditosGuapos.models.MascotasModel;
import com.example.PeluditosGuapos.repository.MascotasRepository;

@Service
public class MascotasServices {
    @Autowired
    MascotasRepository  mascotasRepository;

    public ArrayList<MascotasModel> obtenerMascotas(){
        return (ArrayList<MascotasModel>)mascotasRepository.findAll();
    }

    public boolean eliminarMascota(int idMascota){

        try {        
            
            mascotasRepository.deleteById(idMascota);
            return true;

            
        } catch (Exception e) {
           
            return false;
        }
    }

    public MascotasModel agregarMascota(MascotasModel mascotaModel){


        return mascotasRepository.save(mascotaModel);

    }

    public Optional<MascotasModel> buscarPorID(int idMascota){

        return mascotasRepository.findById(idMascota);



    }
}
