package com.example.soapsd;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

@WebService
public class TempConvertService {
    @WebMethod
    public double celsiusToFahrenheit(double celsius) {
        try {
            URL url = new URL("http://www.w3schools.com/xml/tempconvert.asmx?WSDL");
            QName qname = new QName("http://www.w3schools.com/xml/", "TempConvert");

            Service service = Service.create(url, qname);
            TempConvertSoap tempConvertSoap = service.getPort(TempConvertSoap.class);

            return tempConvertSoap.celsiusToFahrenheit(celsius);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
