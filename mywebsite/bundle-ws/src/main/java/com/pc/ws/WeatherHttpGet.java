package com.pc.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-02T20:56:52.704+05:30
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://ws.cdyne.com/WeatherWS/", name = "WeatherHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WeatherHttpGet {

    /**
     * Gets Information for each WeatherID
     */
    @WebResult(name = "ArrayOfWeatherDescription", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    @WebMethod(operationName = "GetWeatherInformation")
    public ArrayOfWeatherDescription getWeatherInformation();

    /**
     * Allows you to get your City's Weather, which is updated hourly. U.S. Only
     */
    @WebResult(name = "WeatherReturn", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    @WebMethod(operationName = "GetCityWeatherByZIP")
    public WeatherReturn getCityWeatherByZIP(
        @WebParam(partName = "ZIP", name = "ZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
        java.lang.String zip
    );

    /**
     * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
     */
    @WebResult(name = "ForecastReturn", targetNamespace = "http://ws.cdyne.com/WeatherWS/", partName = "Body")
    @WebMethod(operationName = "GetCityForecastByZIP")
    public ForecastReturn getCityForecastByZIP(
        @WebParam(partName = "ZIP", name = "ZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
        java.lang.String zip
    );
}
