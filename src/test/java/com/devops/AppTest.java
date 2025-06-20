package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddEmployee() {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(1, "Test", "QA"));
        assertEquals(1, service.getAllEmployees().size());
    }
}
