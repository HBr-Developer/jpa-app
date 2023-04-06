package ma.emsi.jpa_app.repositories;


import ma.emsi.jpa_app.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository <Patient, Long> {

    public List<Patient> findByMalade(boolean m);

    Page<Patient> findByMalade(boolean m, Pageable pageable);

    List<Patient> findByMaladeAndScoreLessThan(boolean m, int score);

    List<Patient> findByMaladeIsTrueAndScoreLessThan(int score);

    List<Patient> findByDateNaissanceBetweenAAndMaladeIsTrueOrNomLike(Date d1, Date d2,String mc);

//    @Query("select p from Patient p where p.dateNaissance between :x and :y or p.nom like :z);
//    List<Patient> chercherPatients(@Param("x") Date d1, @Param("y") Date d2, @Param("z") String nom);
}
