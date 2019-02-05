/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvRoleC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AvRoleCRepository extends JpaRepository<AvRoleC, Long>{

}
