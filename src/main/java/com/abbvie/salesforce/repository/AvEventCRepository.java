/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvEventC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvEventCRepository extends JpaRepository<AvEventC, Long>{

}
