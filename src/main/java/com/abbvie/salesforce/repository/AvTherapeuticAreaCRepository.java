/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvTherapeuticAreaC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvTherapeuticAreaCRepository extends JpaRepository<AvTherapeuticAreaC, Long>{

}
