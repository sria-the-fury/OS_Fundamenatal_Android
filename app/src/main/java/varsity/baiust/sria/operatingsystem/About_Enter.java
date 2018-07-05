package varsity.baiust.sria.operatingsystem;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;


public class About_Enter extends AppCompatActivity {
    Dialog Bug_Dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__enter);
        Toolbar about_enter = findViewById(R.id.about_toolbar);
        setSupportActionBar(about_enter);
        getSupportActionBar().setTitle("About");

        Bug_Dialog = new Dialog(this);

    }

    public void ShowDialog(View v)
    {
        Bug_Dialog.setContentView(R.layout.pop_up);
        TextView feedback_email;
        TextView close_Dialog;


        feedback_email = Bug_Dialog.findViewById(R.id.feed_back);
        feedback_email.setText(Html.fromHtml("<a href = \"mailto:furybaiust@gmail.com\">Send FeedBack</a>"));
        feedback_email.setMovementMethod(LinkMovementMethod.getInstance());

        close_Dialog = Bug_Dialog.findViewById(R.id.close_textView);
        close_Dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bug_Dialog.dismiss();

            }
        });

        Bug_Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Bug_Dialog.show();


    }
}
