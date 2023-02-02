package com.adr.ad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adr.ad.model.AsignarExamen;

@Repository
public interface AsignarExamRespository extends JpaRepository<AsignarExamen, Long> {

	
}
