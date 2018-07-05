package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Thread_OverView extends AppCompatActivity {

    PDFView thread_overView_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread__over_view);

        thread_overView_pdf = findViewById(R.id.thread_over_pdf);
        thread_overView_pdf.fromAsset("thread_over_view.pdf").load();
    }
}
