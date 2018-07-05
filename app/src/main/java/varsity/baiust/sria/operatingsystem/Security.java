package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Security extends AppCompatActivity {

    PDFView security_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        security_pdf = findViewById(R.id.security_pdf_view);
        security_pdf.fromAsset("security.pdf").load();
    }
}
