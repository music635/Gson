package com.example.gson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Se instancia la clase Gson
            Gson gson = new Gson();

            /*
            //Instanciación de la clase Address y asignación a sus atributos
            Address adress = new Address("Mexico", "Villahermosa");

            List<FamilyMember> family = new ArrayList<>();
            family.add(new FamilyMember("Mom", 47));
            family.add(new FamilyMember("Sister", 19));

            //Se instancia la clase Empleado
            Empleado employee = new Empleado("Alberto", 23, "angeljhsperegrino@gmail.com", adress, family);

            //Se convierte el Gson en Json
            String json = gson.toJson(family);
            */


            String json =  [{"role":"Mom","age":47},{"role":"Sister","age":19}]

            //se instancia la clase Empleado y se transforma a Json
            Empleado empleado = gson.fromJson(json, Empleado.class);



    }
}
