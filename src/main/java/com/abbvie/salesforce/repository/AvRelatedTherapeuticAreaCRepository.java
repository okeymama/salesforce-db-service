/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvRelatedTherapeuticAreaC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvRelatedTherapeuticAreaCRepository extends JpaRepository<AvRelatedTherapeuticAreaC, Long>{

}
