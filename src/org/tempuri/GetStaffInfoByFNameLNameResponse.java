/**
 * GetStaffInfoByFNameLNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffInfoByFNameLNameResponse  implements java.io.Serializable {
    private org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getStaffInfoByFNameLNameResult;

    public GetStaffInfoByFNameLNameResponse() {
    }

    public GetStaffInfoByFNameLNameResponse(
           org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getStaffInfoByFNameLNameResult) {
           this.getStaffInfoByFNameLNameResult = getStaffInfoByFNameLNameResult;
    }


    /**
     * Gets the getStaffInfoByFNameLNameResult value for this GetStaffInfoByFNameLNameResponse.
     * 
     * @return getStaffInfoByFNameLNameResult
     */
    public org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getGetStaffInfoByFNameLNameResult() {
        return getStaffInfoByFNameLNameResult;
    }


    /**
     * Sets the getStaffInfoByFNameLNameResult value for this GetStaffInfoByFNameLNameResponse.
     * 
     * @param getStaffInfoByFNameLNameResult
     */
    public void setGetStaffInfoByFNameLNameResult(org.tempuri.GetStaffInfoByFNameLNameResponseGetStaffInfoByFNameLNameResult getStaffInfoByFNameLNameResult) {
        this.getStaffInfoByFNameLNameResult = getStaffInfoByFNameLNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffInfoByFNameLNameResponse)) return false;
        GetStaffInfoByFNameLNameResponse other = (GetStaffInfoByFNameLNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStaffInfoByFNameLNameResult==null && other.getGetStaffInfoByFNameLNameResult()==null) || 
             (this.getStaffInfoByFNameLNameResult!=null &&
              this.getStaffInfoByFNameLNameResult.equals(other.getGetStaffInfoByFNameLNameResult())));
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
        if (getGetStaffInfoByFNameLNameResult() != null) {
            _hashCode += getGetStaffInfoByFNameLNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffInfoByFNameLNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffInfoByFNameLNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStaffInfoByFNameLNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByFNameLNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByFNameLNameResponse>GetStaffInfoByFNameLNameResult"));
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
