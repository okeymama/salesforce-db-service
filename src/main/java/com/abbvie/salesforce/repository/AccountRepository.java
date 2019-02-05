/**
 * 
 */
package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.Account;

/**
 * @author cchaubey
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
