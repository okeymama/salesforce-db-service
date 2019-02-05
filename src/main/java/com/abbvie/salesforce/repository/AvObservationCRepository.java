/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvObservationC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvObservationCRepository extends JpaRepository<AvObservationC, Long>{

}
