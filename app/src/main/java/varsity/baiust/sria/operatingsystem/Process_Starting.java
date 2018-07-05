package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Process_Starting extends AppCompatActivity {
    PDFView process_starting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process__starting);
        process_starting=findViewById(R.id.process_starting_pdf);
        process_starting.fromAsset("process.pdf").load();
    }
}
