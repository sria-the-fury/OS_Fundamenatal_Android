package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Deadlock extends AppCompatActivity {

    Button deadlock_pdf;
    Button bankers_algorithm_pdf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadlock);

        Toolbar deadlock_toolbar = findViewById(R.id.deadlock_toolbar);
        setSupportActionBar(deadlock_toolbar);
        getSupportActionBar().setTitle("Deadlock");


        deadlock_pdf = findViewById(R.id.deadlock_overview_button);
        deadlock_pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_deadlock = new Intent(Deadlock.this,Deadlock_OverView.class);
                startActivity(start_deadlock);
            }
        });


    }
}
