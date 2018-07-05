package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Linux extends AppCompatActivity {

    PDFView pdf_linux_bash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux);

        pdf_linux_bash = findViewById(R.id.pdf_for_linux);
        pdf_linux_bash.fromAsset("linux_basic_command.pdf").load();
    }
}
