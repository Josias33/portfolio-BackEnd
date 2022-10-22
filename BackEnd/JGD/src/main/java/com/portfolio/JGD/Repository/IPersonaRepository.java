
package com.portfolio.JGD.Repository;

import com.portfolio.JGD.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
}

/** 1= EXTENDEMOS EL JPAREPOSITORY PARA QUE TOME LOS METODOS Y JpaRepository y los aplique*/
/** 2= EXPECIFICAMOS DE DONDE LOS TOMA, <> TENEMOS QUE TOMAR LA CLASE PERSONA Y EL TIPO DE LA PRIMARI KIT OSEA LONG*/


