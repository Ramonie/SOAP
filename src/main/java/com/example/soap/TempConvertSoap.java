package com.example.soapsd;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TempConvertSoap {
    @WebMethod
    double celsiusToFahrenheit(double celsius);
}
