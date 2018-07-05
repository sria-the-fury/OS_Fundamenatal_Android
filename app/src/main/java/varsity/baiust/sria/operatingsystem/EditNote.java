package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class EditNote extends AppCompatActivity {

    private EditText editable_item;
    private String selectedName;
    private int selectedID;

    NoteDatabaseHelper My_DatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        Toolbar Edit_Note= findViewById(R.id.actionbar_for_edit_note);
        setSupportActionBar(Edit_Note);
        getSupportActionBar().setTitle("Edit Note");

        editable_item = findViewById(R.id.editText_for_edit_activity);
        My_DatabaseHelper = new NoteDatabaseHelper(this);

        Intent receivedIntent = getIntent();
        selectedID = receivedIntent.getIntExtra("id",-1);
        selectedName = receivedIntent.getStringExtra("name");

        editable_item.setText(selectedName);



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_actionbar_layout,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.view_data_save_actionbar:

                String item1 = editable_item.getText().toString();
                if (!item1.equals(""))
                {
                    My_DatabaseHelper.updateNote(item1,selectedID,selectedName);
                    Intent intent=new Intent(EditNote.this,NoteList.class);
                    startActivity(intent);
                    finish();

                }
                else
                {
                    toastMessage("You must write something");
                }

                break;
            case R.id.view_data_delete_icon:
                My_DatabaseHelper.deleteNote(selectedID,selectedName);
                editable_item.setText("");
                toastMessage("Note Deleted");

                Intent intent=new Intent(EditNote.this,NoteList.class);
                startActivity(intent);
                finish();

                break;


        }
        return true;
    }


    private void toastMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
