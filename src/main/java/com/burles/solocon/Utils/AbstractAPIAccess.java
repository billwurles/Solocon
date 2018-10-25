package com.burles.solocon.Utils;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
public abstract class AbstractAPIAccess {

    private final String name;
    private final String hostname;
    private final int port;

    public AbstractAPIAccess(String name, String hostname, int port) {
        this.name = name;
        this.hostname = hostname;
        this.port = port;
    }

    protected JsonNode getEndpointJSON(String endpoint) throws IOException {

        RestTemplate template = new RestTemplate();
        String url = hostname+":"+port+endpoint;
        System.out.printf("\nSLCN: Establishing connection with %s...\n",url);
        JsonNode result = template.getForObject(url, JsonNode.class);
//        ResponseEntity<JsonNode> responseEntity = template.exchange(
//                "http://breakingpoint.local:8081/api/9e0ee36c9866b4b42ccc28ca15a3dcc3/?cmd=sb.searchindexers&name=good wife",
//                HttpMethod.GET, null, new ParameterizedTypeReference<JsonNode>() {
//                }
//        );
//        JsonNode json = responseEntity.getBody();
        //System.out.println(result);

//        //TODO: Logging - connection success
        return result;
    }

}
