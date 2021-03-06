# API REGON for Java & Spring Boot

Read more about REGON API (BIR): https://api.stat.gov.pl/Home/RegonApi

This project provides:
* Gradle task to create Java classes from SOAP 1.2 specification  (run ***genJaxbStubs*** task)
* Web client to download XML as String from REGON API
* String XML to POJO converter

Classes in *com.nexocode.bir.wsdl* are generated by gradle, if you want, you can remove all package content
 and generate classes once again from scratches with *genJaxbStubs* task.

Client uses API Key for test environment. If you want to use production environment, just replace
 ***regon-api url*** with *https://wyszukiwarkaregon.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc* and ***regon-api key*** in *application.yml* with
your own key received from REGON API admins.

Notes
* *bir means: Baza Internetowa REGON* :sweat_smile:
* *JDK 11 is used in this project as default* 
* *Enable annotation processing in your IDE, since Lombok is used* 

## Let's connect 
* If you find this useful, please visit our website: https://www.nexocode.com :v:
* Read our blog: https://www.nexocode.com/blog :squirrel:
* If you understand what's going on here, apply: https://www.nexocode.com/careers :sunglasses: