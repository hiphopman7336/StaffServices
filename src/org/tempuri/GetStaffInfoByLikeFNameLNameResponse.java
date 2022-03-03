/**
 * GetStaffInfoByLikeFNameLNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetStaffInfoByLikeFNameLNameResponse  implements java.io.Serializable {
    private org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getStaffInfoByLikeFNameLNameResult;

    public GetStaffInfoByLikeFNameLNameResponse() {
    }

    public GetStaffInfoByLikeFNameLNameResponse(
           org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getStaffInfoByLikeFNameLNameResult) {
           this.getStaffInfoByLikeFNameLNameResult = getStaffInfoByLikeFNameLNameResult;
    }


    /**
     * Gets the getStaffInfoByLikeFNameLNameResult value for this GetStaffInfoByLikeFNameLNameResponse.
     * 
     * @return getStaffInfoByLikeFNameLNameResult
     */
    public org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getGetStaffInfoByLikeFNameLNameResult() {
        return getStaffInfoByLikeFNameLNameResult;
    }


    /**
     * Sets the getStaffInfoByLikeFNameLNameResult value for this GetStaffInfoByLikeFNameLNameResponse.
     * 
     * @param getStaffInfoByLikeFNameLNameResult
     */
    public void setGetStaffInfoByLikeFNameLNameResult(org.tempuri.GetStaffInfoByLikeFNameLNameResponseGetStaffInfoByLikeFNameLNameResult getStaffInfoByLikeFNameLNameResult) {
        this.getStaffInfoByLikeFNameLNameResult = getStaffInfoByLikeFNameLNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStaffInfoByLikeFNameLNameResponse)) return false;
        GetStaffInfoByLikeFNameLNameResponse other = (GetStaffInfoByLikeFNameLNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStaffInfoByLikeFNameLNameResult==null && other.getGetStaffInfoByLikeFNameLNameResult()==null) || 
             (this.getStaffInfoByLikeFNameLNameResult!=null &&
              this.getStaffInfoByLikeFNameLNameResult.equals(other.getGetStaffInfoByLikeFNameLNameResult())));
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
        if (getGetStaffInfoByLikeFNameLNameResult() != null) {
            _hashCode += getGetStaffInfoByLikeFNameLNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStaffInfoByLikeFNameLNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetStaffInfoByLikeFNameLNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStaffInfoByLikeFNameLNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStaffInfoByLikeFNameLNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetStaffInfoByLikeFNameLNameResponse>GetStaffInfoByLikeFNameLNameResult"));
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
