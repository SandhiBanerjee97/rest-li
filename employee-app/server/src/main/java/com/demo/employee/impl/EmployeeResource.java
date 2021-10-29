package com.demo.employee.impl;

import com.demo.address.Address;
import com.demo.address.impl.AddressResource;
import com.demo.employee.Employee;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.internal.server.RestLiInternalException;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.GetResult;
import com.linkedin.restli.server.PagingContext;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.*;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestLiCollection(name = "employees" , namespace = "com.demo.employee")
public class EmployeeResource extends CollectionResourceTemplate<Long , Employee> {

    static Map<Long, Employee> employeeMap = new HashMap<>();
    static {
        employeeMap.put(1l,new Employee().setName("sandhi").setAddress(new Address().setCountry("India").setState("Westbengal")).setIsIntern(true).setSalary(15000l));
        employeeMap.put(2l,new Employee().setName("Rai").setAddress(new Address().setCountry("India").setState("Westbengal")).setIsIntern(false).setSalary(20000l));
        employeeMap.put(3l,new Employee().setName("Liy").setAddress(new Address().setCountry("Bari").setState("home")).setIsIntern(false).setSalary(30000l));
        employeeMap.put(4l,new Employee().setName("Elliot").setAddress(new Address().setCountry("USA").setState("texas")).setIsIntern(false).setSalary(40000l));
    }

    /*We can override Inbuilt methods*/
    @Override
    public List<Employee> getAll(@Context PagingContext pagingContext) {
        List<Employee> employeeList = new ArrayList<>();
        for (var val : employeeMap.entrySet()){
            employeeList.add(val.getValue());
        }
        return employeeList;
    }

    /*We can also use annotations*/
    @RestMethod.Get
    public GetResult<Employee> getEmployee(Long key){
        return new GetResult<Employee>(employeeMap.get(key));
    }

    @Override
    public CreateResponse create(Employee employee) {
        Long id = 4l;
        employeeMap.put(id, employee);
        return new CreateResponse(id);
    }

    /* Using following query param ---> /employees?q=findEmployee&employeeId=1 */
    @Finder("findEmployee")
    public List<Employee> findOrder(@Context PagingContext context,
                                   @QueryParam("employeeId") Long empId) throws RestLiInternalException
    {
        return List.of(employeeMap.get(empId));
    }

    @RestMethod.Delete
    public UpdateResponse deleteById(Long key) {
        employeeMap.remove(key);
        return new UpdateResponse(HttpStatus.S_200_OK);
    }
    @Action(name="login")
    public void login(@ActionParam("username") final String username,
                      @ActionParam("password") final String password){

        if (username=="sandhi"&& password=="sandhi"){
            System.out.println("Success....!");
        }
        else{
            throw new RuntimeException("Unsuccessful....!");
        }
    }
}
