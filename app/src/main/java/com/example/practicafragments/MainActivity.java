package com.example.practicafragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonPegarFragmentRojo;
    private Button botonPegarFragmentVerde;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pegarFragment(new FragmentRojo());

        botonPegarFragmentRojo = findViewById(R.id.MainActivity_Button_PegarRojo);
        botonPegarFragmentVerde = findViewById(R.id.MainActivity_Button_PegarVerde);

        botonPegarFragmentRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pegarFragment(new FragmentRojo());
            }
        });

        botonPegarFragmentVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pegarFragment(new FragmentVerde());
            }
        });
    }

    private void pegarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.MainActivity_ContenedorDeFragments,fragment);
        fragmentTransaction.commit();
    }
}
