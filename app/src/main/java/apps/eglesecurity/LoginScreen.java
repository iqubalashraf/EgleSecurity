package apps.eglesecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ashrafiqubal on 19/03/17.
 */

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }
    public void logIn(View view){
        Toast.makeText(getApplicationContext(),"Not Implemented yet",Toast.LENGTH_SHORT).show();
    }
}
