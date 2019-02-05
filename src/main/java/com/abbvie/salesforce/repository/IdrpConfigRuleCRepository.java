/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.IdrpConfigRuleC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface IdrpConfigRuleCRepository extends JpaRepository<IdrpConfigRuleC, Long>{

	public IdrpConfigRuleC findByStudyNumberC(String studyNumber);
	
}
