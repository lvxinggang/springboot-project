package com.project.mes.systemmanage.service;

import com.project.mes.systemmanage.dao.SysOrganizationMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
public interface SysOrganizationService {
    boolean addSysOrganization(String params);
}
