package com.praveen.apachecxf.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-10-20T03:18:58.083+05:30
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://service.soap.apachecxf.praveen.com/", name = "BookService")
@XmlSeeAlso({ObjectFactory.class})
public interface BookService {

    @WebMethod
    @RequestWrapper(localName = "getBookNameBasedOnISBN", targetNamespace = "http://service.soap.apachecxf.praveen.com/", className = "com.praveen.apachecxf.soap.service.GetBookNameBasedOnISBN")
    @ResponseWrapper(localName = "getBookNameBasedOnISBNResponse", targetNamespace = "http://service.soap.apachecxf.praveen.com/", className = "com.praveen.apachecxf.soap.service.GetBookNameBasedOnISBNResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getBookNameBasedOnISBN(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
