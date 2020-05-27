/**
 * WeatherWebServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice;

public class WeatherWebServiceTestCase extends junit.framework.TestCase {
    public WeatherWebServiceTestCase(String name) {
        super(name);
    }

    public void testWeatherWebServiceSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.webservice.WeatherWebServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WeatherWebServiceSoap12GetSupportCity() throws Exception {
        com.webservice.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap12Stub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
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
        String[] value = null;
        value = binding.getSupportCity(new String());
        // TBD - validate results
    }

    public void test2WeatherWebServiceSoap12GetSupportProvince() throws Exception {
        com.webservice.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap12Stub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
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
        String[] value = null;
        value = binding.getSupportProvince();
        // TBD - validate results
    }

    public void test3WeatherWebServiceSoap12GetSupportDataSet() throws Exception {
        com.webservice.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap12Stub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
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
        com.webservice.GetSupportDataSetResponseGetSupportDataSetResult value = null;
        value = binding.getSupportDataSet();
        // TBD - validate results
    }

    public void test4WeatherWebServiceSoap12GetWeatherbyCityName() throws Exception {
        com.webservice.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap12Stub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
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
        String[] value = null;
        value = binding.getWeatherbyCityName(new String());
        // TBD - validate results
    }

    public void test5WeatherWebServiceSoap12GetWeatherbyCityNamePro() throws Exception {
        com.webservice.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap12Stub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
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
        String[] value = null;
        value = binding.getWeatherbyCityNamePro(new String(), new String());
        // TBD - validate results
    }

    public void testWeatherWebServiceSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.webservice.WeatherWebServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test6WeatherWebServiceSoapGetSupportCity() throws Exception {
        com.webservice.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap_BindingStub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap();
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
        String[] value = null;
        value = binding.getSupportCity(new String());
        // TBD - validate results
    }

    public void test7WeatherWebServiceSoapGetSupportProvince() throws Exception {
        com.webservice.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap_BindingStub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap();
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
        String[] value = null;
        value = binding.getSupportProvince();
        for (String temp: value){
            System.out.println(temp);
        }
        // TBD - validate results
    }

    public void test8WeatherWebServiceSoapGetSupportDataSet() throws Exception {
        com.webservice.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap_BindingStub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap();
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
        com.webservice.GetSupportDataSetResponseGetSupportDataSetResult value = null;
        value = binding.getSupportDataSet();
        // TBD - validate results
    }

    public void test9WeatherWebServiceSoapGetWeatherbyCityName() throws Exception {
        com.webservice.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap_BindingStub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap();
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
        String[] value = null;
        value = binding.getWeatherbyCityName(new String());
        // TBD - validate results
    }

    public void test10WeatherWebServiceSoapGetWeatherbyCityNamePro() throws Exception {
        com.webservice.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (com.webservice.WeatherWebServiceSoap_BindingStub)
                          new com.webservice.WeatherWebServiceLocator().getWeatherWebServiceSoap();
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
        String[] value = null;
        value = binding.getWeatherbyCityNamePro(new String(), new String());
        // TBD - validate results
    }

}
