package com.pc.test.cqutil.test;
import static org.junit.Assert.assertNotNull;

import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.service.cm.ConfigurationAdmin;
import org.apache.sling.jcr.resource.*;

/** Test OSGi services injection */
@RunWith(SlingAnnotationsTestRunner.class)
public class OsgiAwareTest {
    
    @TestReference
    private ConfigurationAdmin configAdmin;
    
    @Test
    public void testConfigAdmin() throws Exception {
        assertNotNull(
                "Expecting ConfigurationAdmin to be injected by Sling test runner", 
                configAdmin);
        
        final String name = "TEST_" + getClass().getName() + System.currentTimeMillis();
        assertNotNull("Expecting config " + name + " to be created",
                configAdmin.getConfiguration(name));
    }
    
    public ResourceResolver getResourceResolver() {
        try {
            return getResourceResolverFactory().
                    getAdministrativeResourceResolver(null);
        } catch (LoginException e) {
            fail(e.toString());
        }
        return null;
    }
    
    @Test
    public void testCreateFutureAttachment()
            throws Exception {
        assertTrue(true);
    }
}