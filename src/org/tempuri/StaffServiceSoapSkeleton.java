/**
 * StaffServiceSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class StaffServiceSoapSkeleton implements org.tempuri.StaffServiceSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.StaffServiceSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "usr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("checkStaffStatus", _params, new javax.xml.namespace.QName("http://tempuri.org/", "CheckStaffStatusResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "CheckStaffStatus"));
        _oper.setSoapAction("http://tempuri.org/CheckStaffStatus");
        _myOperationsList.add(_oper);
        if (_myOperations.get("checkStaffStatus") == null) {
            _myOperations.put("checkStaffStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("checkStaffStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "staffID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffInfoByID", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByIDResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByIDResponse>GetStaffInfoByIDResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByID"));
        _oper.setSoapAction("http://tempuri.org/GetStaffInfoByID");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffInfoByID") == null) {
            _myOperations.put("getStaffInfoByID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffInfoByID")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "staffID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffInfoByIDWithOrgLevel", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByIDWithOrgLevelResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByIDWithOrgLevelResponse>GetStaffInfoByIDWithOrgLevelResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByIDWithOrgLevel"));
        _oper.setSoapAction("http://tempuri.org/GetStaffInfoByIDWithOrgLevel");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffInfoByIDWithOrgLevel") == null) {
            _myOperations.put("getStaffInfoByIDWithOrgLevel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffInfoByIDWithOrgLevel")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffInfoByUserName", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByUserNameResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByUserNameResponse>GetStaffInfoByUserNameResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByUserName"));
        _oper.setSoapAction("http://tempuri.org/GetStaffInfoByUserName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffInfoByUserName") == null) {
            _myOperations.put("getStaffInfoByUserName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffInfoByUserName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "serviceCenterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSrvCenterMgmtByScName", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetSrvCenterMgmtByScNameResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSrvCenterMgmtByScNameResponse>GetSrvCenterMgmtByScNameResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSrvCenterMgmtByScName"));
        _oper.setSoapAction("http://tempuri.org/GetSrvCenterMgmtByScName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSrvCenterMgmtByScName") == null) {
            _myOperations.put("getSrvCenterMgmtByScName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSrvCenterMgmtByScName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "fName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "lName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffInfoByFNameLName", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByFNameLNameResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByFNameLNameResponse>GetStaffInfoByFNameLNameResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByFNameLName"));
        _oper.setSoapAction("http://tempuri.org/GetStaffInfoByFNameLName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffInfoByFNameLName") == null) {
            _myOperations.put("getStaffInfoByFNameLName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffInfoByFNameLName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "fName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "lName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffInfoByLikeFNameLName", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByLikeFNameLNameResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByLikeFNameLNameResponse>GetStaffInfoByLikeFNameLNameResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByLikeFNameLName"));
        _oper.setSoapAction("http://tempuri.org/GetStaffInfoByLikeFNameLName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffInfoByLikeFNameLName") == null) {
            _myOperations.put("getStaffInfoByLikeFNameLName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffInfoByLikeFNameLName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "headerID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffByHeaderID", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffByHeaderIDResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffByHeaderIDResponse>GetStaffByHeaderIDResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffByHeaderID"));
        _oper.setSoapAction("http://tempuri.org/GetStaffByHeaderID");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffByHeaderID") == null) {
            _myOperations.put("getStaffByHeaderID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffByHeaderID")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "hierachyCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getStaffByAllHierarchy", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffByAllHierarchyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffByAllHierarchyResponse>GetStaffByAllHierarchyResult"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffByAllHierarchy"));
        _oper.setSoapAction("http://tempuri.org/GetStaffByAllHierarchy");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getStaffByAllHierarchy") == null) {
            _myOperations.put("getStaffByAllHierarchy", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getStaffByAllHierarchy")).add(_oper);
    }

    public StaffServiceSoapSkeleton() {
        this.impl = new org.tempuri.StaffServiceSoapImpl();
    }

    public StaffServiceSoapSkeleton(org.tempuri.StaffServiceSoap impl) {
        this.impl = impl;
    }
    public boolean checkStaffStatus(java.lang.String usr) throws java.rmi.RemoteException
    {
        boolean ret = impl.checkStaffStatus(usr);
        return ret;
    }

    public org.tempuri.GetStaffInfoByIDResponseGetStaffInfoByIDResult getStaffInfoByID(java.lang.String staffID) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffInfoByIDResponseGetStaffInfoByIDResult ret = impl.getStaffInfoByID(staffID);
        return ret;
    }

    public org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getStaffInfoByIDWithOrgLevel(java.lang.String staffID) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult ret = impl.getStaffInfoByIDWithOrgLevel(staffID);
        return ret;
    }

    public org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getStaffInfoByUserName(java.lang.String userName) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult ret = impl.getStaffInfoByUserName(userName);
        return ret;
    }

    public org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getSrvCenterMgmtByScName(java.lang.String serviceCenterName) throws java.rmi.RemoteException
    {
        org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult ret = impl.getSrvCenterMgmtByScName(serviceCenterName);
        return ret;
    }

    public org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getStaffInfoByFNameLName(java.lang.String fName, java.lang.String lName) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult ret = impl.getStaffInfoByFNameLName(fName, lName);
        return ret;
    }

    public org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getStaffInfoByLikeFNameLName(java.lang.String fName, java.lang.String lName) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult ret = impl.getStaffInfoByLikeFNameLName(fName, lName);
        return ret;
    }

    public org.tempuri.GetStaffByHeaderIDResponseGetStaffByHeaderIDResult getStaffByHeaderID(java.lang.String headerID) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffByHeaderIDResponseGetStaffByHeaderIDResult ret = impl.getStaffByHeaderID(headerID);
        return ret;
    }

    public org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getStaffByAllHierarchy(java.lang.String hierachyCode) throws java.rmi.RemoteException
    {
        org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult ret = impl.getStaffByAllHierarchy(hierachyCode);
        return ret;
    }

}
