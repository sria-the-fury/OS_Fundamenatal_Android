package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Note extends AppCompatActivity {

    NoteDatabaseHelper My_DatabaseHelper;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__note);

        Toolbar Add_Note= findViewById(R.id.actionbar_for_add_note);
        setSupportActionBar(Add_Note);
        getSupportActionBar().setTitle("Write Note");


        editText= findViewById(R.id.edit_get_text);

        My_DatabaseHelper = new NoteDatabaseHelper(this);


    }

    public void AddData(String newEntry)
    {
        boolean insertData = My_DatabaseHelper.addNote(newEntry);

        if(insertData == true)
        {

            toastMessage("Note Created");
            Intent intent= new Intent(Add_Note.this,NoteList.class);
            startActivity(intent);
            finish();
        }
        else
        {
            toastMessage("Something Wrong !!");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_actionbar_layout_for_add_note,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.view_data_save_actionbar:
                String newEntry = editText.getText().toString();
                if(editText.length()!= 0)
                {
                    AddData(newEntry);
                    editText.setText("");

                }
                else
                {
                    toastMessage("You must left something");
                }
                break;


        }
        return true;
    }


    private void toastMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
