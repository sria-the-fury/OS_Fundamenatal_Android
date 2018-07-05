package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Algorithm_Area extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm_area);

        Toolbar algorithm_tool = findViewById(R.id.algorithm_toolbar);
        setSupportActionBar(algorithm_tool);
        getSupportActionBar().setTitle("Algorithm");

    }
}
