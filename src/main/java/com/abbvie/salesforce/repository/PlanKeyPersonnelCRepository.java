/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.PlanKeyPersonnelC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface PlanKeyPersonnelCRepository extends JpaRepository<PlanKeyPersonnelC, Long>{

	public List<PlanKeyPersonnelC> findByRoleC(List<String> roleIds);
	
}
	