
package com.lm.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-06-11T23:28:33.485-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "unexpectedErrorFault", targetNamespace = "urn:faults_2016_1.platform.webservices.netsuite.com")
public class UnexpectedErrorFault_Exception extends Exception {
    
    private com.lm.generated.UnexpectedErrorFault unexpectedErrorFault;

    public UnexpectedErrorFault_Exception() {
        super();
    }
    
    public UnexpectedErrorFault_Exception(String message) {
        super(message);
    }
    
    public UnexpectedErrorFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedErrorFault_Exception(String message, com.lm.generated.UnexpectedErrorFault unexpectedErrorFault) {
        super(message);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public UnexpectedErrorFault_Exception(String message, com.lm.generated.UnexpectedErrorFault unexpectedErrorFault, Throwable cause) {
        super(message, cause);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public com.lm.generated.UnexpectedErrorFault getFaultInfo() {
        return this.unexpectedErrorFault;
    }
}
