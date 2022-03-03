package org.tempuri;

public class StaffServiceSoapProxy implements org.tempuri.StaffServiceSoap {
  private String _endpoint = null;
  private org.tempuri.StaffServiceSoap staffServiceSoap = null;
  
  public StaffServiceSoapProxy() {
    _initStaffServiceSoapProxy();
  }
  
  public StaffServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initStaffServiceSoapProxy();
  }
  
  private void _initStaffServiceSoapProxy() {
    try {
      staffServiceSoap = (new org.tempuri.StaffServiceLocator()).getStaffServiceSoap();
      if (staffServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)staffServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)staffServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (staffServiceSoap != null)
      ((javax.xml.rpc.Stub)staffServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.StaffServiceSoap getStaffServiceSoap() {
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap;
  }
  
  public boolean checkStaffStatus(java.lang.String usr) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.checkStaffStatus(usr);
  }
  
  public org.tempuri.GetStaffInfoByIDResponseGetStaffInfoByIDResult getStaffInfoByID(java.lang.String staffID) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffInfoByID(staffID);
  }
  
  public org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getStaffInfoByIDWithOrgLevel(java.lang.String staffID) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffInfoByIDWithOrgLevel(staffID);
  }
  
  public org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getStaffInfoByUserName(java.lang.String userName) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffInfoByUserName(userName);
  }
  
  public org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getSrvCenterMgmtByScName(java.lang.String serviceCenterName) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getSrvCenterMgmtByScName(serviceCenterName);
  }
  
  public org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getStaffInfoByFNameLName(java.lang.String fName, java.lang.String lName) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffInfoByFNameLName(fName, lName);
  }
  
  public org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getStaffInfoByLikeFNameLName(java.lang.String fName, java.lang.String lName) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffInfoByLikeFNameLName(fName, lName);
  }
  
  public org.tempuri.GetStaffByHeaderIDResponseGetStaffByHeaderIDResult getStaffByHeaderID(java.lang.String headerID) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffByHeaderID(headerID);
  }
  
  public org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getStaffByAllHierarchy(java.lang.String hierachyCode) throws java.rmi.RemoteException{
    if (staffServiceSoap == null)
      _initStaffServiceSoapProxy();
    return staffServiceSoap.getStaffByAllHierarchy(hierachyCode);
  }
  
  
}