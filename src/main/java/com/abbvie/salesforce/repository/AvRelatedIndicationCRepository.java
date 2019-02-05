/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvRelatedIndicationC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvRelatedIndicationCRepository extends JpaRepository<AvRelatedIndicationC, Long>{

}
