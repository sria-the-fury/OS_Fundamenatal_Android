package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Timer time=new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(Welcome.this,Main_Menu.class);
                startActivity(i);
                finish();

            }
        },2000);
    }
}
