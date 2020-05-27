/**
 * HrmServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice;

public class HrmServiceTestCase extends junit.framework.TestCase {
    public HrmServiceTestCase(String name) {
        super(name);
    }

    public void testHrmServiceHttpPortWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new HrmServiceLocator().getHrmServiceHttpPortAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new HrmServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1HrmServiceHttpPortSynSubCompany() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.synSubCompany(new String(), new String());
        // TBD - validate results
    }

    public void test2HrmServiceHttpPortGetHrmSubcompanyInfoXML() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.getHrmSubcompanyInfoXML(new String());
        // TBD - validate results
    }

    public void test3HrmServiceHttpPortGetHrmDepartmentInfo() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        DepartmentBean[] value = null;
        value = binding.getHrmDepartmentInfo(new String(), new String());
        // TBD - validate results
    }

    public void test4HrmServiceHttpPortGetHrmUserInfo() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        UserBean[] value = null;
        value = binding.getHrmUserInfo(new String(), new String(), new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test5HrmServiceHttpPortGetHrmUserInfoXML() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.getHrmUserInfoXML(new String(), new String(), new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test6HrmServiceHttpPortCheckUser() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.checkUser(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test7HrmServiceHttpPortGetHrmJobTitleInfo() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        JobTitleBean[] value = null;
        value = binding.getHrmJobTitleInfo(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test8HrmServiceHttpPortChangeUserPassword() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.changeUserPassword(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test9HrmServiceHttpPortSynDepartment() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.synDepartment(new String(), new String());
        // TBD - validate results
    }

    public void test10HrmServiceHttpPortSynJobtitle() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.synJobtitle(new String(), new String());
        // TBD - validate results
    }

    public void test11HrmServiceHttpPortSynHrmResource() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.synHrmResource(new String(), new String());
        // TBD - validate results
    }

    public void test12HrmServiceHttpPortGetHrmSubcompanyInfo() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        SubCompanyBean[] value = null;
        value = binding.getHrmSubcompanyInfo(new String());
        // TBD - validate results
    }

    public void test13HrmServiceHttpPortGetHrmJobTitleInfoXML() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.getHrmJobTitleInfoXML(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test14HrmServiceHttpPortGetHrmDepartmentInfoXML() throws Exception {
        HrmServiceHttpBindingStub binding;
        try {
            binding = (HrmServiceHttpBindingStub)
                          new HrmServiceLocator().getHrmServiceHttpPort();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.getHrmDepartmentInfoXML(new String(), new String());
        // TBD - validate results
    }

}
