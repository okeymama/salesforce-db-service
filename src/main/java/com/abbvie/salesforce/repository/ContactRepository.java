/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.Contact;

/**
 * @author cchaubey
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
