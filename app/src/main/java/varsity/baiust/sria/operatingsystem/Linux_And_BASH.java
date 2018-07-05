package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class Linux_And_BASH extends AppCompatActivity {
    Toolbar linux_toolbar;
    Button linux_cmd,bash;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux__and__bash);

        linux_toolbar = findViewById(R.id.linux_and_bash_actionbar);
        setSupportActionBar(linux_toolbar);
        getSupportActionBar().setTitle("Linux and Bash");

        linux_cmd = findViewById(R.id.linux_button);
        linux_cmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent start_linux = new Intent(Linux_And_BASH.this,Linux.class);
                startActivity(start_linux);

            }
        });

        bash = findViewById(R.id.bash_button);
        bash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_bash = new Intent(Linux_And_BASH.this,Bash.class);
                startActivity(start_bash);

            }
        });



    }
}
