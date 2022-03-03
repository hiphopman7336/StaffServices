/**
 * GetSrvCenterMgmtByScNameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSrvCenterMgmtByScNameResponse  implements java.io.Serializable {
    private org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getSrvCenterMgmtByScNameResult;

    public GetSrvCenterMgmtByScNameResponse() {
    }

    public GetSrvCenterMgmtByScNameResponse(
           org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getSrvCenterMgmtByScNameResult) {
           this.getSrvCenterMgmtByScNameResult = getSrvCenterMgmtByScNameResult;
    }


    /**
     * Gets the getSrvCenterMgmtByScNameResult value for this GetSrvCenterMgmtByScNameResponse.
     * 
     * @return getSrvCenterMgmtByScNameResult
     */
    public org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getGetSrvCenterMgmtByScNameResult() {
        return getSrvCenterMgmtByScNameResult;
    }


    /**
     * Sets the getSrvCenterMgmtByScNameResult value for this GetSrvCenterMgmtByScNameResponse.
     * 
     * @param getSrvCenterMgmtByScNameResult
     */
    public void setGetSrvCenterMgmtByScNameResult(org.tempuri.GetSrvCenterMgmtByScNameResponseGetSrvCenterMgmtByScNameResult getSrvCenterMgmtByScNameResult) {
        this.getSrvCenterMgmtByScNameResult = getSrvCenterMgmtByScNameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSrvCenterMgmtByScNameResponse)) return false;
        GetSrvCenterMgmtByScNameResponse other = (GetSrvCenterMgmtByScNameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSrvCenterMgmtByScNameResult==null && other.getGetSrvCenterMgmtByScNameResult()==null) || 
             (this.getSrvCenterMgmtByScNameResult!=null &&
              this.getSrvCenterMgmtByScNameResult.equals(other.getGetSrvCenterMgmtByScNameResult())));
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
        if (getGetSrvCenterMgmtByScNameResult() != null) {
            _hashCode += getGetSrvCenterMgmtByScNameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSrvCenterMgmtByScNameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSrvCenterMgmtByScNameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSrvCenterMgmtByScNameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSrvCenterMgmtByScNameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSrvCenterMgmtByScNameResponse>GetSrvCenterMgmtByScNameResult"));
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
