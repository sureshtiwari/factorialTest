package com.suresh.dynamic.multitenant.tenant.config;

import com.suresh.dynamic.multitenant.mastertenant.config.DBContextHolder;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;


public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

    private static final String DEFAULT_TENANT_ID = "client_tenant_1";

    @Override
    public String resolveCurrentTenantIdentifier() {
        String tenant = DBContextHolder.getCurrentDb();
        return StringUtils.isNotBlank(tenant) ? tenant : DEFAULT_TENANT_ID;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
