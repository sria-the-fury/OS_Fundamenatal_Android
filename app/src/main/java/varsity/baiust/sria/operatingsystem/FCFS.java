package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FCFS extends AppCompatActivity {

    PDFView fcfs_button_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcfs);
        fcfs_button_pdf = findViewById(R.id.fcfs_pdf);
        fcfs_button_pdf.fromAsset("fcfs.pdf").load();

    }
}
