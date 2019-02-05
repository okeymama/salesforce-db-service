/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvRelatedCompoundsC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvRelatedCompoundsCRepository extends JpaRepository<AvRelatedCompoundsC, Long>{

}
