package com.suresh.dynamic.multitenant.mastertenant.service;

import com.suresh.dynamic.multitenant.mastertenant.entity.MasterTenant;


public interface MasterTenantService {

    MasterTenant findByClientId(Integer clientId);
}
