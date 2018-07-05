package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Process_Area extends AppCompatActivity {

    Button p_overview,p_scheduling,deadlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_area);

        Toolbar p_toolbar = findViewById(R.id.process_toolbar);
        setSupportActionBar(p_toolbar);
        getSupportActionBar().setTitle("Process");

        p_overview = findViewById(R.id.p_over_view_btn);
        p_overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent process_overview = new Intent(Process_Area.this,Process_Starting.class);
                startActivity(process_overview);

            }
        });

        p_scheduling = findViewById(R.id.scheduling_btn);
        p_scheduling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scheduling_start = new Intent(Process_Area.this,Scheduling_Area.class);
                startActivity(scheduling_start);

            }
        });

        deadlock = findViewById(R.id.deadlock_btn);
        deadlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_deadlock = new Intent(Process_Area.this,Deadlock.class);

                startActivity(start_deadlock);

            }
        });

    }
}
