package com.abbvie.salesforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abbvie.salesforce.entity.AvCompanyPersonnelAssignmentC;


@Repository
public interface AvCompanyPersonnelAssignmentCRepository extends JpaRepository<AvCompanyPersonnelAssignmentC, Long>{

}
