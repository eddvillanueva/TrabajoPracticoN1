package com.example.eduda.trabajopracticon1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class segunda extends AppCompatActivity {
    TextView txtSaludo;
    EditText edtNombre;
    private Button btnIngresar;   // asi es como se llama el boton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Toast.makeText(this, "Estoy en onCreate", Toast.LENGTH_SHORT).show();

         btnIngresar = (Button) findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                mostrarMensaje();
            }
        });
    }


    private void mostrarMensaje(){
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
    }
        //reparar el entonrno para el usuario
        // getSupportActionBar().setTitle("Algun Titulo");   ///setear el titulo en tiempo de ejecucion
        // getSupportActionBar().setIcon(@);        // setea un icono que aparezca en la barra de titulos

        //  txtSaludo = (TextView) findViewById(R.id.txtSaludo);
        //declaras txtsaludo en un TextView como si fuera int i;   i=0;
        //    edtNombre = (EditText) findViewById(R.id.edtNombre);

        //}


        //public void mostrarMensaje(View view){
        //  Toast.makeText(this,"Bienvenidos",Toast.LENGTH_SHORT).show();
        // CLASE PARA MOSTRAR UN MENSAJE CUANDO PRESIONAMOS EL BOTON
    //}

    //  public void mostrarOtroMensaje (View v){
    //     String nombre = edtNombre.getText().toString();
    //     txtSaludo.setText("Hola "+ nombre);
    //  }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Estoy en onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Estoy en onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Estoy en onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Estoy en onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Estoy en onStop", Toast.LENGTH_SHORT).show();
    }

}