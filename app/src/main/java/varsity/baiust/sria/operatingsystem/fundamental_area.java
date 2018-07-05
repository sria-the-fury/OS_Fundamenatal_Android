package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class fundamental_area extends AppCompatActivity {
    Button over_button;
    Button properties_button;
    Button process_starting;
    Button thread_button;
    Button management_button;
    Button security_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamental_area);
        final Toolbar fun_action= findViewById(R.id.fun_toolbar);
        setSupportActionBar(fun_action);
        getSupportActionBar().setTitle("Fundamental");

        over_button= findViewById(R.id.over_view_btn);
        over_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent over_view_button=new Intent(fundamental_area.this,over_view.class);
                startActivity(over_view_button);
            }
        });

        properties_button=findViewById(R.id.properties_btn);

        properties_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_properties=new Intent(fundamental_area.this,Properties.class);
                startActivity(start_properties);

            }
        });


        process_starting = findViewById(R.id.process_scheduling_btn);
        process_starting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent process_start = new Intent(fundamental_area.this,Process_Area.class);
                startActivity(process_start);
            }
        });

        thread_button = findViewById(R.id.thread_btn);
        thread_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thread_start = new Intent(fundamental_area.this,Thread_OverView.class);
                startActivity(thread_start);

            }
        });

        management_button = findViewById(R.id.memory_manage_btn);
        management_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent management_start = new Intent(fundamental_area.this,Management.class);
                startActivity(management_start);

            }
        });

        security_button = findViewById(R.id.security_btn);
        security_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent security_start = new Intent(fundamental_area.this,Security.class);
                startActivity(security_start);

            }
        });





    }
}
