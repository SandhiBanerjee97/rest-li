package com.demo.address.impl;

import com.demo.address.Address;
import com.demo.employee.Employee;
import com.linkedin.parseq.Task;
import com.linkedin.parseq.Tasks;
import com.linkedin.parseq.promise.Promise;
import com.linkedin.restli.server.PagingContext;
import com.linkedin.restli.server.annotations.Context;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

@RestLiCollection(name = "address" , namespace = "com.demo.address")
public class AddressResource extends CollectionResourceTemplate<Long, Address> {

    public static Map<Long, Address> addressMap = new HashMap<>();
    static {
        addressMap.put(1l,new Address().setCountry("India").setState("Westbengal"));
        addressMap.put(2l,new Address().setCountry("Japan").setState("tokyo"));
        addressMap.put(3l,new Address().setCountry("Bari").setState("home"));
        addressMap.put(4l,new Address().setCountry("USA").setState("texas"));
    }
    @Override
    public List<Address> getAll(@Context PagingContext pagingContext) {
        List<Address> addressList = new ArrayList<>();
        for (var val : addressMap.entrySet()){
            addressList.add(val.getValue());
        }
        return addressList;
    }

    @Override
    public Address get(Long key) {
        return addressMap.get(key);
    }
}
