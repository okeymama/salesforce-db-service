/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.IdrpTemplatesC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface IdrpTemplatesCRepository extends JpaRepository<IdrpTemplatesC, String>{

	
	
}
