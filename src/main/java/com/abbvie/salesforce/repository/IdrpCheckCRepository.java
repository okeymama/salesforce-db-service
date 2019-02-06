/**
 * 
 */
package com.abbvie.salesforce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.IdrpCheckC;

/**
 * @author cchaubey
 *
 */
@Repository
public interface IdrpCheckCRepository extends JpaRepository<IdrpCheckC, String> {

	List<IdrpCheckC> findAllBySfidIn(List values);

}
