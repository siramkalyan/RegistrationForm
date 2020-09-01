package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.registrationform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender,lang="";
                if(binding.male.isChecked())
                {
                    gender="male";
                }
                else{
                    gender="femlae";
                }

                if(binding.java.isChecked())
                {
                    lang="java";
                }
                if(binding.python.isChecked())
                {
                    lang="python"+lang;
                }
                binding.tv.setText("name"+binding.text.getText().toString()+"\n"+"phone"+binding.text2.getText()+"\n"+binding.branch.getSelectedItem().toString()+"\n"+ gender+"\n"+lang);
            }
        });


    }
}