package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Scheduling_Area extends AppCompatActivity {

    Button s_overview,fcfs,sjf,priority,round_robin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling__area);

        Toolbar s_toolbar = findViewById(R.id.scheduling_toolbar);
        setSupportActionBar(s_toolbar);
        getSupportActionBar().setTitle("Scheduling");


        s_overview = findViewById(R.id.s_over_view_btn);
        s_overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_overview = new Intent(Scheduling_Area.this,Scheduling_Overview.class);
                startActivity(start_overview);

            }
        });


        fcfs = findViewById(R.id.fcfs_btn);
        fcfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_fcfs = new Intent(Scheduling_Area.this,FCFS.class);
                startActivity(start_fcfs);

            }
        });

        sjf = findViewById(R.id.sjf_btn);
        sjf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_sjf = new Intent(Scheduling_Area.this,SJF.class);
                startActivity(start_sjf);


            }
        });

        priority = findViewById(R.id.priority_btn);
        priority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        round_robin = findViewById(R.id.round_robin_btn);
        round_robin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
