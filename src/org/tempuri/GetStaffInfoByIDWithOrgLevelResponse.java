/**
 * GetStaffInfoByIDWithOrgLevelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffInfoByIDWithOrgLevelResponse  implements java.io.Serializable {
    private org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getStaffInfoByIDWithOrgLevelResult;

    public GetStaffInfoByIDWithOrgLevelResponse() {
    }

    public GetStaffInfoByIDWithOrgLevelResponse(
           org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getStaffInfoByIDWithOrgLevelResult) {
           this.getStaffInfoByIDWithOrgLevelResult = getStaffInfoByIDWithOrgLevelResult;
    }


    /**
     * Gets the getStaffInfoByIDWithOrgLevelResult value for this GetStaffInfoByIDWithOrgLevelResponse.
     * 
     * @return getStaffInfoByIDWithOrgLevelResult
     */
    public org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getGetStaffInfoByIDWithOrgLevelResult() {
        return getStaffInfoByIDWithOrgLevelResult;
    }


    /**
     * Sets the getStaffInfoByIDWithOrgLevelResult value for this GetStaffInfoByIDWithOrgLevelResponse.
     * 
     * @param getStaffInfoByIDWithOrgLevelResult
     */
    public void setGetStaffInfoByIDWithOrgLevelResult(org.tempuri.GetStaffInfoByIDWithOrgLevelResponseGetStaffInfoByIDWithOrgLevelResult getStaffInfoByIDWithOrgLevelResult) {
        this.getStaffInfoByIDWithOrgLevelResult = getStaffInfoByIDWithOrgLevelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffInfoByIDWithOrgLevelResponse)) return false;
        GetStaffInfoByIDWithOrgLevelResponse other = (GetStaffInfoByIDWithOrgLevelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStaffInfoByIDWithOrgLevelResult==null && other.getGetStaffInfoByIDWithOrgLevelResult()==null) || 
             (this.getStaffInfoByIDWithOrgLevelResult!=null &&
              this.getStaffInfoByIDWithOrgLevelResult.equals(other.getGetStaffInfoByIDWithOrgLevelResult())));
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
        if (getGetStaffInfoByIDWithOrgLevelResult() != null) {
            _hashCode += getGetStaffInfoByIDWithOrgLevelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffInfoByIDWithOrgLevelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffInfoByIDWithOrgLevelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStaffInfoByIDWithOrgLevelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByIDWithOrgLevelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByIDWithOrgLevelResponse>GetStaffInfoByIDWithOrgLevelResult"));
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
