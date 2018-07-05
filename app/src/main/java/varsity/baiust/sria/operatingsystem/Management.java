package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Management extends AppCompatActivity {

    PDFView management_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        management_pdf = findViewById(R.id.management_pdf_view);
        management_pdf.fromAsset("management.pdf").load();
    }
}
