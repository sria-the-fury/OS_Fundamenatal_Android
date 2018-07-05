package varsity.baiust.sria.operatingsystem;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoteList extends AppCompatActivity {

    NoteDatabaseHelper My_DatabaseHelper;
    ListView note_List_View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        Toolbar Short_Note= findViewById(R.id.note_list_actionbar);
        setSupportActionBar(Short_Note);
        getSupportActionBar().setTitle("Short Note");


        note_List_View = findViewById(R.id.note_list_view);
        My_DatabaseHelper =new NoteDatabaseHelper(this);


        populateListView();

    }

    public void populateListView()
    {
        Cursor data = My_DatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();

        if(data.getCount() == 0)
        {
            toastMessage(" Note is empty ");
        }
        else
        {
            while(data.moveToNext())
            {
                listData.add(data.getString(1));
            }
        }


        ListAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listData);
        note_List_View.setAdapter(adapter);

         note_List_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                String name = adapterView.getItemAtPosition(position).toString();
                Cursor data = My_DatabaseHelper.getItemID(name);
                int itemID = -1;

                while (data.moveToNext())
                {
                    itemID = data.getInt(0);

                }

                if (itemID > -1)
                {
                    Intent editScreenIntent=new Intent(NoteList.this,EditNote.class);
                    editScreenIntent.putExtra("id",itemID);
                    editScreenIntent.putExtra("name",name);
                    startActivity(editScreenIntent);
                    finish();
                }

            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_actionbar_layout,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.view_data_add_actionbar:
                Intent startAddingData=new Intent(NoteList.this,Add_Note.class);
                startActivity(startAddingData);
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
