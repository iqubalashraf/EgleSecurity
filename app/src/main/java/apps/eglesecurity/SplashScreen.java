package apps.eglesecurity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by ashrafiqubal on 19/03/17.
 */

public class SplashScreen extends AppCompatActivity {
    private final String TAG = "SplashScreen";
    private final int SPLASH_TIME_OUT = 2000; //Time in milliseconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate called");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //code that displays the content in full screen mode
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//int flag, int mask
        setContentView(R.layout.splash_screen);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart called");
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent loginActivity = new Intent(SplashScreen.this,LoginScreen.class);
                startActivity(loginActivity);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
