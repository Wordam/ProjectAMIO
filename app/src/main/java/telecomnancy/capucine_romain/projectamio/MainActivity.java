package telecomnancy.capucine_romain.projectamio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Création de l'activité");
        startService(new Intent(this, MainService.class));

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        stopService(new Intent(this, MainService.class));
    }
}
