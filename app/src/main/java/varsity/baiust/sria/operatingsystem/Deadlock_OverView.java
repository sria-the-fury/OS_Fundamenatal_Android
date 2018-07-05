package varsity.baiust.sria.operatingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Deadlock_OverView extends AppCompatActivity {

    PDFView deadlock_overView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadlock_over_view);

        deadlock_overView = findViewById(R.id.deadlock_overView_pdf);
        deadlock_overView.fromAsset("deadlock.pdf").load();
    }
}
