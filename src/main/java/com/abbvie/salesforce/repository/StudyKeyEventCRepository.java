/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.StudyKeyEventC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface StudyKeyEventCRepository extends JpaRepository<StudyKeyEventC, String>{

	public List<StudyKeyEventC> findByidrpConfigRuleC(String idrpConfigRuleCId);
	
}
