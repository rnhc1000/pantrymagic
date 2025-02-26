## _Pantry Provisioning_ <br />
The goal of this project is to automate the provisioning process of a family house
to help families to generate a complete list of food items such as proteins, vegetables, carbohydrates, dairy,
seafood, etc to be purchased based on their daily food consumption.

## _Table of contents_

- [_Overview_](#overview)
- [_Requirements_](#requirements)
- [_Project Structure_](#requirements)
- [_Howto Build and Run_](#requirements)
- [_Screenshot_](#screenshot)
- [_Links_](...)
- [_Built with_](#built-with)
- [_Code Snippet_](#requirements)
- [_Continued development_](#continued-development)
- [_Useful resources_](#useful-resources)
- [_Author_](#requirements)
- [_Portfolio_](#requirements)

## _Overview_

This app is a RESTful API built on top of Spring framework, PostgreSQL and Java. 
The goal is to provide a series of endpoints to be consumed by a ReactJS-based front-end app available at ...<soon> 
<br />

## _Features_

There are several features implemented such as authentication and authorization, data persistence, 
paginated data recovery, consume external services of other apis, notification services, 
authenticated access to endpoints and some other features.<br />
<br />
The app has been coded using Java 21, Spring Boot 3.4.2, Maven, Javadoc, Spring Security, Spring JPA, Spring Webflux,
Flyway, Jackson, Lombok, OpenAPI, PostgreSQL, Docker and hosted in an AWS EC2 instance with secure access provided
by a NGINX SSL proxy reverse and being live at ..soon... <br />
<br />

<hr />

## _Project Structure_
- docs
   - javadocs
- src
    - main
    - java
        - br.dev.ferreiras.pantry-provisioning
            - config
            - controller
              - handlers
            - projections
            - dto
            - entity
            - enums
            - mapper
            - repository
            - services
              - exceptions
    - resources
        - db.migration
        - certs
    - test
-

## _Howto Build and Run_

  ```
  - PostgreSQL Database : http://127.0.0.1:5432 (profile - prod)
  - H2 Database: jdbc:h2:mem:pantrydb//localhost:8095 (profile - dev)
  - profile active: dev 
  - service socket: 127.0.0.1:8095/swagger-ui/index.html
  - tweak a few knobs to get it up and running
  
  To have a docker image follow the instructions of the dockerBuild.sh,
  otherwise just Ctrl-Shift-F10 and voila...

```

## _Screenshot_
[![](./pantry-shopping.jpg)]()
Designed by <a href="https://www.freepik.com">Freepik</a>

## _Links_

- Live Site URL: soon API Full Pantry</a>

## _Built with_

[![My Skills](https://skillicons.dev/icons?i=java,spring,postgresql,maven,docker,rabbitmq,gmail,redhat,azure,idea,git,github,)](https://skillicons.dev)

## _Code Snippet_

```java
package br.dev.ferreiras.pantry_provisioning.controllers.contracts;

/**
 * 
 * @author ricardo@ferreiras.dev.br
 * @version 1.1.030901
 * @since 1.0
 *
 */

import br.dev.ferreiras.pantry_provisioning.dto.FamilyDataDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(value = "/pantry")
public interface FamilyControllerContract {

  @GetExchange(value = "/families")
  ResponseEntity<List<FamilyDataDTO>> getAllFamilies();

  @GetExchange(value = "/families/{id}")
  ResponseEntity<FamilyDataDTO> getFamilyById(@PathVariable Long id);
}

``` 

## _Continued development_

- Unit Tests 
- Provide a Json to FrontEnd including
    - delivery status of each operation to frontend 
    - count of operations consumed by subscriber 
- Subscriber Authentication 
    - Spring JWT-OAuth2 
- Records Pagination 

### _Useful resources_

- [https://spring.io] Awesome Java framework!.
- [https://start.spring.io/]  Handy startup tool.
- [https://mvnrepository.com] Tools that help tackle the beast

## _Author_
<a href="mailto:ricardo@ferreiras.dev.br">Ricardo Ferreira</a>

## - _Portfolio_
<a href="https://www.ferreiras.dev.br" target="_blank">My Portfolio...</a>


