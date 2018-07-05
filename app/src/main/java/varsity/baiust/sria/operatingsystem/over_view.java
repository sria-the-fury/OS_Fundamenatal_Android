package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.github.barteksc.pdfviewer.PDFView;

public class over_view extends AppCompatActivity {
    PDFView over_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_view);


        over_pdf = findViewById(R.id.over_view_pdf);
        over_pdf.fromAsset("over_view.pdf").load();


    }
}
