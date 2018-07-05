package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Scheduling_Overview extends AppCompatActivity {
    PDFView s_overview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling__overview);

        s_overview = findViewById(R.id.scheduling_overview_pdf);
        s_overview.fromAsset("scheduling_overview.pdf").load();
    }
}
