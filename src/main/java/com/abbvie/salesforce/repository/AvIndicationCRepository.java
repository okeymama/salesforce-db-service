/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvIndicationC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvIndicationCRepository extends JpaRepository<AvIndicationC, Long>{

}
