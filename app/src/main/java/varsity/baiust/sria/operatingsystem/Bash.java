package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class Bash extends AppCompatActivity {
    PDFView bash_pdf_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bash);

        bash_pdf_view = findViewById(R.id.bash_pdf);
        bash_pdf_view.fromAsset("bash.pdf").load();
    }
}
