package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvCompoundC;

@Repository
public interface AvCompoundCRepository extends JpaRepository<AvCompoundC, Long>{

	
	//List<String> findNameCBy
}
