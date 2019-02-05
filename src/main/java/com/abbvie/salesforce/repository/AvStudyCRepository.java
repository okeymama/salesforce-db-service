/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvStudyC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvStudyCRepository extends JpaRepository<AvStudyC, Long>{

	public AvStudyC findByAvStudyNumberC(String studyNumber);
	
}
