package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Properties extends AppCompatActivity {
    PDFView properties_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties);
        properties_pdf=findViewById(R.id.properties_pdf);
        properties_pdf.fromAsset("properties.pdf").load();
    }
}
