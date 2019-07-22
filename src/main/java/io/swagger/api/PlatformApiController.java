package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.api.service.AwsPlatform;
import io.swagger.api.service.IPlatform;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Platform;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-17T08:54:48.546Z")

@Controller
public class PlatformApiController implements PlatformApi {

    private static final Logger log = LoggerFactory.getLogger(PlatformApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private IPlatform platform;

    @org.springframework.beans.factory.annotation.Autowired
    public PlatformApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> createPlatform(@ApiParam(value = "Created platform" ,required=true )  @Valid @RequestBody Platform body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	
            	// TODO: refactor this!!!
            	if("aws".equalsIgnoreCase(body.getPlatformProvider())) {
            		platform = new AwsPlatform();
            	}
            	
            	platform.createPlatform(body);
            	
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (Exception e) {
            	log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Platform> getPlatformById(@ApiParam(value = "The platform that needs to be fetched.",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Platform>(objectMapper.readValue("{  \"technologies\" : [ {    \"id\" : \"id\",    \"technologyName\" : \"technologyName\"  }, {    \"id\" : \"id\",    \"technologyName\" : \"technologyName\"  } ],  \"platformProvider\" : \"platformProvider\",  \"instanceType\" : \"instanceType\",  \"osType\" : \"osType\",  \"serverName\" : \"serverName\",  \"storage\" : \"storage\",  \"platformName\" : \"platformName\"}", Platform.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Platform>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Platform>(HttpStatus.NOT_IMPLEMENTED);
    }

}
