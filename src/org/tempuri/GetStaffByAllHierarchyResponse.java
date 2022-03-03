/**
 * GetStaffByAllHierarchyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffByAllHierarchyResponse  implements java.io.Serializable {
    private org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getStaffByAllHierarchyResult;

    public GetStaffByAllHierarchyResponse() {
    }

    public GetStaffByAllHierarchyResponse(
           org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getStaffByAllHierarchyResult) {
           this.getStaffByAllHierarchyResult = getStaffByAllHierarchyResult;
    }


    /**
     * Gets the getStaffByAllHierarchyResult value for this GetStaffByAllHierarchyResponse.
     * 
     * @return getStaffByAllHierarchyResult
     */
    public org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getGetStaffByAllHierarchyResult() {
        return getStaffByAllHierarchyResult;
    }


    /**
     * Sets the getStaffByAllHierarchyResult value for this GetStaffByAllHierarchyResponse.
     * 
     * @param getStaffByAllHierarchyResult
     */
    public void setGetStaffByAllHierarchyResult(org.tempuri.GetStaffByAllHierarchyResponseGetStaffByAllHierarchyResult getStaffByAllHierarchyResult) {
        this.getStaffByAllHierarchyResult = getStaffByAllHierarchyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffByAllHierarchyResponse)) return false;
        GetStaffByAllHierarchyResponse other = (GetStaffByAllHierarchyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStaffByAllHierarchyResult==null && other.getGetStaffByAllHierarchyResult()==null) || 
             (this.getStaffByAllHierarchyResult!=null &&
              this.getStaffByAllHierarchyResult.equals(other.getGetStaffByAllHierarchyResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetStaffByAllHierarchyResult() != null) {
            _hashCode += getGetStaffByAllHierarchyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffByAllHierarchyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffByAllHierarchyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStaffByAllHierarchyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffByAllHierarchyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffByAllHierarchyResponse>GetStaffByAllHierarchyResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
