package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SJF extends AppCompatActivity {
    PDFView sjf_button_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sjf);
        sjf_button_pdf = findViewById(R.id.sjf_pdf);
        sjf_button_pdf.fromAsset("sjf.pdf").load();
    }
}
