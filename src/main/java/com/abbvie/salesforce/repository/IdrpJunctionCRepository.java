/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.IdrpJunctionC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface IdrpJunctionCRepository extends JpaRepository<IdrpJunctionC, String>{

	List<IdrpJunctionC> findByChildOfIdrpTemplateCIn(List<String> idrpTemplatesIds);

}
