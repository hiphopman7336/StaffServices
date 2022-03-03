/**
 * GetStaffInfoByUserNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffInfoByUserNameResponse  implements java.io.Serializable {
    private org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getStaffInfoByUserNameResult;

    public GetStaffInfoByUserNameResponse() {
    }

    public GetStaffInfoByUserNameResponse(
           org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getStaffInfoByUserNameResult) {
           this.getStaffInfoByUserNameResult = getStaffInfoByUserNameResult;
    }


    /**
     * Gets the getStaffInfoByUserNameResult value for this GetStaffInfoByUserNameResponse.
     * 
     * @return getStaffInfoByUserNameResult
     */
    public org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getGetStaffInfoByUserNameResult() {
        return getStaffInfoByUserNameResult;
    }


    /**
     * Sets the getStaffInfoByUserNameResult value for this GetStaffInfoByUserNameResponse.
     * 
     * @param getStaffInfoByUserNameResult
     */
    public void setGetStaffInfoByUserNameResult(org.tempuri.GetStaffInfoByUserNameResponseGetStaffInfoByUserNameResult getStaffInfoByUserNameResult) {
        this.getStaffInfoByUserNameResult = getStaffInfoByUserNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffInfoByUserNameResponse)) return false;
        GetStaffInfoByUserNameResponse other = (GetStaffInfoByUserNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStaffInfoByUserNameResult==null && other.getGetStaffInfoByUserNameResult()==null) || 
             (this.getStaffInfoByUserNameResult!=null &&
              this.getStaffInfoByUserNameResult.equals(other.getGetStaffInfoByUserNameResult())));
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
        if (getGetStaffInfoByUserNameResult() != null) {
            _hashCode += getGetStaffInfoByUserNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffInfoByUserNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffInfoByUserNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStaffInfoByUserNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByUserNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByUserNameResponse>GetStaffInfoByUserNameResult"));
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
