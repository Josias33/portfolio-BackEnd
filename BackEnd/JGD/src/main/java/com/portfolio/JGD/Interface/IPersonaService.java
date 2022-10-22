
package com.portfolio.JGD.Interface;

import com.portfolio.JGD.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    /**PARA TRAER UNA LISTA DE PERSONA TENEMOS QUE COMITIAR LA SIGUIENTE LINIA DE CODIGO 
     DECIMOS: TRAEME UNA LISTA DE PERSONA CUANDO YO LLAME AL METODO GET PERSONA**/
    public List<Persona> getPersona();
    
    /**GUARDAMOS UN OBJETO DE TIPO PERSNA**/
    public void savePersona(Persona persona);
    
    /**ELIMINAR UN USUARIO PERSONA BUSCADO POR ID**/
    public void deletePersona(Long id);
    
    /**BUSCAMOS UNA PERSONA POR ID**/
    public Persona findPersona(Long id);
    
}
