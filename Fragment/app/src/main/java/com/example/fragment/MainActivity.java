package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_1;
    private Button button_2;
    private Button button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_1= (Button) findViewById(R.id.button1);
        button_1.setOnClickListener(this);
        Button button_2 = (Button) findViewById(R.id.button2);
        button_2.setOnClickListener(this);
        Button button_3 = (Button) findViewById(R.id.button3);
        button_3.setOnClickListener(this);
        replaceFragment(new right());
    }
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.button1:
                    replaceFragment(new right());
                    break;
                case R.id.button2:
                    replaceFragment(new another());
                    break;
                case R.id.button3:
                    replaceFragment(new ljj());
                    break;
                default:
                    break;

            }
        }
        private  void replaceFragment (Fragment fragment){
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.right,fragment);
            transaction.commit();
        }

}