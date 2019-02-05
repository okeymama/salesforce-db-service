/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.StudyPersonnelConfigurationC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface StudyPersonnelConfigurationCRepository extends JpaRepository<StudyPersonnelConfigurationC, String>{

	List<StudyPersonnelConfigurationC> findByIdrpConfigRuleC(String ruleIdC);

}
