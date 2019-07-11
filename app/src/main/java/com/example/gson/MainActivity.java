package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Se instancia la clase Gson
            Gson gson = new Gson();

            /*
            //Se instancia la clase Empleado
            Empleado employee = new Empleado("Alberto", 23, "angeljhsperegrino@gmail.com");

            //Se convierte el Gson en Json
            String json = gson.toJson(employee);
            */

            String json = "{\"firstName\" : \"Alberto\", \"age\" :30, \"email\" : \"angeljhsperegrino@gmail.com\"}";



    }
}
