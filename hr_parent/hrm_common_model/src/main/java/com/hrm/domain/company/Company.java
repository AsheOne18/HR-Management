package com.hrm.domain.company;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author AsheOne
 * @date 2022/2/2
 */
@Entity
@Table(name = "co_company")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {

    private static final long serialVersionUID = 594829320797158219L;
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * Company Name
     */
    private String name;
    /**
     * Enterprise Login ID
     */
    private String managerId;
    /**
     * Current Version
     */
    private String version;
    /**
     * Renewal Time
     */
    private Date renewalDate;
    /**
     * Expiration Date
     */
    private Date expirationDate;
    /**
     * Company Area
     */
    private String companyArea;
    /**
     * Company Address
     */
    private String companyAddress;
    /**
     * License Image ID
     */
    private String businessLicenseId;
    /**
     * Legal Representative
     */
    private String legalRepresentative;
    /**
     * Company Phone
     */
    private String companyPhone;
    /**
     * Email
     */
    private String mailbox;
    /**
     * Company Size
     */
    private String companySize;
    /**
     * Company Industry
     */
    private String industry;
    /**
     * Info Remarks
     */
    private String remarks;
    /**
     * Audit State
     */
    private String auditState;
    /**
     * Current State
     */
    private String state;
    /**
     * Current Balance
     */
    private Double balance;
    /**
     * Create Time
     */
    private Date createTime;

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Company company = (Company) o;
        return id != null && Objects.equals(id, company.id);
    }

    @Override
    public int hashCode () {
        return getClass().hashCode();
    }
}
