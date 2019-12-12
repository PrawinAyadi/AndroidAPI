package com.example.androidapi.interfaceemployee;



import com.example.androidapi.model.Employee;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;


public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getAllEmployees();
}
