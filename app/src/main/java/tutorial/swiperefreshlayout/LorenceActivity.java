package tutorial.swiperefreshlayout;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LorenceActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = findViewById(R.id.swipe_container);
        swipeLayout.setEnabled(true);
        swipeLayout.setOnRefreshListener(this);
    }

    @Override
    public void onRefresh() {
        swipeLayout.setEnabled(false);
        Toast.makeText(LorenceActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeLayout.setRefreshing(false);
                swipeLayout.setEnabled(false); // Make swipeLayout is hidden
            }
        }, 1000);
    }

    /**
     * If you want to enable and disable => Using method is not efficient in this case.
     * Let move to another situation: Remove view contain it and add view again.
     */
}
