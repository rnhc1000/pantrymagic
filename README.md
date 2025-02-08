## _Full Pantry_ <br />
This project has as goal to help families to generate a list of food to be purchased
based on their daily food consumption.
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

This app is a Restful API built on top of Spring framework, PostgreSQL and Java. 
The goal is to provide a series of endpoints to be consumed by a ReactJS-based front-end app available at ...<soon> 
<br />

## _Features_

There are several features implemented such as authentication and authorization, data persistence, 
paginated data recovery, consume external services of other apis, notification services authenticated access to endpoints and some other requirements.<br />
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
  - PostgreSQL Database : http://127.0.0.1:5432
  - profile active: dev or prod
  - service socket: 127.0.0.1:8095
  - tweak a few knobs to get it up and running
  """
  src.main.java.br.dev.ferreiras.pantry-provisioning.config.OpenApiConfiguration
  ...
  public class OpenApiConfiguration {
  @Bean
  public OpenAPI defineOpenApi() {
    Server server = new Server();
    -> server.setUrl("http://127.0.0.1:8095"); <-
    server.setDescription("Development");
   ....
  """
  
  To have a docker image follow the instructions of the dockerBuild.sh,
  otherwise just Ctrl-Shift-F10 and voila...

```

## _Screenshot_

<div><a rel='follow' href='https://www.houzz.co.uk/photos/aristokraft-cabinetry-supercabinet-transitional-kitchen-phvw-vp~139969183' target='_blank'><img src='https://st.hzcdn.com/simgs/pictures/kitchens/aristokraft-cabinetry-supercabinet-masterbrand-cabinets-inc-img~ae51d7b30c93d471_8-2370-1-484c26a.jpg' alt='' border=0 width='500' height='454' nopin='nopin' ondragstart='return false;' onselectstart='return false;' oncontextmenu='return false;'/></a></div><div style='color:#444;'><small><a style="text-decoration:none;color:#444;" href="https://www.houzz.co.uk/professionals/cabinet-makers/masterbrand-cabinets-pfvwus-pf~1291907285" target="_blank">Photo by MasterBrand Cabinets</a> - <a style="text-decoration:none;color:#444;" href="https://www.houzz.co.uk/photos/kitchen-ideas-and-designs-phbr0-bp~t_10135" target="_blank">Browse kitchen ideas</a></small></div>

## _Links_

- Live Site URL: soon API Full Pantry</a>

## _Built with_

[![My Skills](https://skillicons.dev/icons?i=java,spring,mysql,gradle,docker,redhat,aws,idea,git,github,)](https://skillicons.dev)

## _Code Snippet_

```java
import java.util.List;

/**
 * 
 * @author ricardo@ferreiras.dev.br
 * @version 1.1.030901
 * @since 1.0
 *
 */

@Configuration
public class OpenApiConfiguration {
  @Bean
  public OpenAPI defineOpenApi() {
    Server server = new Server();
    server.setUrl("https://api.pantryprovisioning.dev.br/");
    server.setDescription("Development");

    Contact myContact = new Contact();
    myContact.setName(":Ricardo Ferreira");
    myContact.setEmail("ricardo@ferreiras.dev.br");

    Info information = new Info()
            .title("Pantry Provisioning")
            .version("1.0")
            .description("Pantry Provisioning API exposes endpoints to generate a list of food items to be purchased based on the average consumption of a family")
            .contact(myContact);

    return new OpenAPI()
            .info(information)
            .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
            .components(
                    new Components()
                            .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                    .type(SecurityScheme.Type.HTTP)
                                    .scheme("bearer")
                                    .bearerFormat("JWT")
                            )
            )
            .servers(List.of(server));
  }
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

