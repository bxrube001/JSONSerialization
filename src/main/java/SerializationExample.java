/**
 * Created by brubert on 3/18/16.
 */
import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.developer.SerializationFeature;

public class SerializationExample {

    public static void main(String[] args) throws JsonGenerationException ,JsonMappingException, IOException {

        //create the mapper
        ObjectMapper mapper = new ObjectMapper();

        //enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //serialize the object
        mapper.writeValue(System.out, getEmployee());

    }

    static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(1001);
        employee.setName("Drona");
        employee.setAge(25);
        employee.setDesignation("Manager");

        Compensation compensation = new Compensation();
        compensation.setCurrency('$');
        compensation.setSalary(30000);

        employee.setCompensation(compensation);
        return employee;
    }
}
