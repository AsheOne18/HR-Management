package com.hrm.company.service;

import com.hrm.common.utils.IdWorker;
import com.hrm.company.dao.CompanyDao;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AsheOne
 * @date 2022/2/3
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;
    /**
     * Add Company
     * 1. Configure IdWorker from `hrm_common`
     * 2. Inject IdWorker in Server
     * 3. Use IdWorker to generate IDs.
     * 4. Add or Save Company
     */
    public void add(Company company){
        // Basic properties
        String id = idWorker.nextId()+"";
        company.setId(id);

        // Default state
        company.setAuditState("0");// 0: no audit   1: audited
        company.setState("1");// 0: no activation   2: activated

        // Save
        companyDao.save(company);
    }
    /**
     * Update Company
     * 1. Parameter: Company
     * 2. Select Company Object by ID
     * 3. Set the attribute value of update
     * 4. Update operation
     */
    public void update(Company company){

        Company temp = companyDao.findById(company.getId()).get();
        temp.setName(company.getName());
        temp.setCompanyPhone(company.getCompanyPhone());

        // Update
        companyDao.save(temp);
    }

    /**
     * Delete Company
     */
    public void deleteById(String id){
        companyDao.deleteById(id);
    }

    /**
     * Select Company by id
     */
    public Company findById(String id){
        return companyDao.findById(id).get();
    }

    /**
     * Select All Company
     */
    public List<Company> findAll(){
        return companyDao.findAll();
    }
}
