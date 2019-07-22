package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pipeline;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-17T08:54:48.546Z")

@Controller
public class PipelineApiController implements PipelineApi {

    private static final Logger log = LoggerFactory.getLogger(PipelineApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PipelineApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> createPipeline(@ApiParam(value = "Created pipeline" ,required=true )  @Valid @RequestBody Pipeline body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pipeline> getPipelineById(@ApiParam(value = "The pipeline that needs to be fetched.",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pipeline>(objectMapper.readValue("{  \"pipelineName\" : \"pipelineName\",  \"technologies\" : [ {    \"id\" : \"id\",    \"technologyName\" : \"technologyName\"  }, {    \"id\" : \"id\",    \"technologyName\" : \"technologyName\"  } ],  \"uploadedProject\" : \"uploadedProject\",  \"pipelineDetails\" : {    \"uploadedProject\" : \"uploadedProject\",    \"id\" : \"id\"  },  \"estimatedCost\" : \"estimatedCost\",  \"creationDate\" : \"creationDate\",  \"pipelineId\" : \"pipelineId\"}", Pipeline.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pipeline>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pipeline>(HttpStatus.NOT_IMPLEMENTED);
    }

}
