package h5.umeng.com.h5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.umeng.comm.core.constants.Constants;
import com.umeng.h5.ui.activities.BrowserActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Constants.UMENG_H5_HOST_URL = "http://keben.wsq.umeng.com";
        Constants.UMENG_APPKEY = "574f94a967e58ed96c0025f3";
        Constants.UMENG_SECRET = "334968dfc36a8645300e1210c653bddd";
        Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
        startActivity(intent);
    }
}
