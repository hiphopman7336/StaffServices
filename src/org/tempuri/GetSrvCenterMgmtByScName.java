/**
 * GetSrvCenterMgmtByScName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSrvCenterMgmtByScName  implements java.io.Serializable {
    private java.lang.String serviceCenterName;

    public GetSrvCenterMgmtByScName() {
    }

    public GetSrvCenterMgmtByScName(
           java.lang.String serviceCenterName) {
           this.serviceCenterName = serviceCenterName;
    }


    /**
     * Gets the serviceCenterName value for this GetSrvCenterMgmtByScName.
     * 
     * @return serviceCenterName
     */
    public java.lang.String getServiceCenterName() {
        return serviceCenterName;
    }


    /**
     * Sets the serviceCenterName value for this GetSrvCenterMgmtByScName.
     * 
     * @param serviceCenterName
     */
    public void setServiceCenterName(java.lang.String serviceCenterName) {
        this.serviceCenterName = serviceCenterName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSrvCenterMgmtByScName)) return false;
        GetSrvCenterMgmtByScName other = (GetSrvCenterMgmtByScName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceCenterName==null && other.getServiceCenterName()==null) || 
             (this.serviceCenterName!=null &&
              this.serviceCenterName.equals(other.getServiceCenterName())));
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
        if (getServiceCenterName() != null) {
            _hashCode += getServiceCenterName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSrvCenterMgmtByScName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSrvCenterMgmtByScName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCenterName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "serviceCenterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
