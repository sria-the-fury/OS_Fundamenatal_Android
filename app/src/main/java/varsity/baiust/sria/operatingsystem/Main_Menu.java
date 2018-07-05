package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {
    Button fundamental,algorithm,About,linux;
    AppCompatImageButton note_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);
        Toolbar actionbar = findViewById(R.id.menu_actionbar);
        setSupportActionBar(actionbar);
        getSupportActionBar().setTitle("Menu");

        fundamental = findViewById(R.id.funbtn);


        fundamental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fundamental_start = new Intent(Main_Menu.this,fundamental_area.class);
                startActivity(fundamental_start);
            }
        });

        algorithm = findViewById(R.id.algobtn);
        algorithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent algorithm_start = new Intent(Main_Menu.this,Algorithm_Area.class);
                startActivity(algorithm_start);
            }
        });

        About = findViewById(R.id.aboutbtn);
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_start = new Intent(Main_Menu.this,About_Enter.class);
                startActivity(about_start);
            }
        });

        note_enter = findViewById(R.id.note_enter_img_btn);
        note_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_note = new Intent(Main_Menu.this,NoteList.class);
                startActivity(start_note);

            }
        });

        linux = findViewById(R.id.linux_bashbtn);
        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_Linux_and_bash = new Intent(Main_Menu.this,Linux_And_BASH.class);
                startActivity(start_Linux_and_bash);

            }
        });
    }
}
