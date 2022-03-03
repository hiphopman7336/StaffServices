/**
 * StaffServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StaffServiceLocator extends org.apache.axis.client.Service implements org.tempuri.StaffService {

    public StaffServiceLocator() {
    }


    public StaffServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StaffServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StaffServiceSoap
    private java.lang.String StaffServiceSoap_address = "http://intra.tot.co.th/StaffServices/StaffService.asmx";

    public java.lang.String getStaffServiceSoapAddress() {
        return StaffServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StaffServiceSoapWSDDServiceName = "StaffServiceSoap";

    public java.lang.String getStaffServiceSoapWSDDServiceName() {
        return StaffServiceSoapWSDDServiceName;
    }

    public void setStaffServiceSoapWSDDServiceName(java.lang.String name) {
        StaffServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.StaffServiceSoap getStaffServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StaffServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStaffServiceSoap(endpoint);
    }

    public org.tempuri.StaffServiceSoap getStaffServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.StaffServiceSoapStub _stub = new org.tempuri.StaffServiceSoapStub(portAddress, this);
            _stub.setPortName(getStaffServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStaffServiceSoapEndpointAddress(java.lang.String address) {
        StaffServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.StaffServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.StaffServiceSoapStub _stub = new org.tempuri.StaffServiceSoapStub(new java.net.URL(StaffServiceSoap_address), this);
                _stub.setPortName(getStaffServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StaffServiceSoap".equals(inputPortName)) {
            return getStaffServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "StaffService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "StaffServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StaffServiceSoap".equals(portName)) {
            setStaffServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
