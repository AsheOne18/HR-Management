package com.hrm.company.dao;

import com.hrm.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author AsheOne
 * @date 2022/2/2
 */
public interface CompanyDao extends JpaRepository<Company,String> , JpaSpecificationExecutor<Company> {
}
