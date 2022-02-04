package com.hrm.company.controller;

import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.company.service.CompanyService;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

/**
 * @author AsheOne
 * @date 2022/2/3
 * 1. Save Company Info
 * 2. Update Company by ID
 * 3. Delete Company by ID
 * 4. Select Company By ID
 * 5. Select All Company
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // 1. Save Company Info
    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result save(@RequestBody Company company){
        companyService.add(company);

        return new Result(ResultCode.SUCCESS);
    }

    // 2. Update Company by ID
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id")String id,@RequestBody Company company){
        company.setId(id);
        companyService.update(company);

        return new Result(ResultCode.SUCCESS);
    }

    // 3. Delete Company by ID
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id")String id){
        companyService.deleteById(id);

        return new Result(ResultCode.SUCCESS);
    }

    // 4. Select Company by ID
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value = "id")String id) {
        Company company = companyService.findById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);

        return result;
    }

    // 5. Select All Company
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){
        List<Company> list = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);

        return result;
    }
}
