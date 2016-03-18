/**
 * Created by brubert on 3/18/16.
 */
import java.io.IOException;

import com.fasterxml.jackson.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DeserializationExample {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOExeption {

        //create the mapper
        ObjectMapper mapper = new ObjectMapper();

        //de-serialize JSON to Object
        Employee employee = mapper.readValue(getEmployeeJson(), Employee.class);

        //print thhe de-serialized object
        System.out.println(employee);
    }

    static String getEmployeeJson() {
        return "{" +
                "\"id\" : 1001," +
                "\"name\" : \"Drona\"," +
                "\"age\" : 25," +
                "\"designation\" : \"Manager\"," +
                "\"compensation\" : {" +
                "\"currency\" : \"$\"," +
                "\"salary\" : 30000" +
                "}" +
                "}";
    }
}
