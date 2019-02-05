/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.PlanKeyEventC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface PlanKeyEventCRepository extends JpaRepository<PlanKeyEventC, Long>{
	
	public List<PlanKeyEventC> findByEventCIn(List<String> eventCs); 

}
