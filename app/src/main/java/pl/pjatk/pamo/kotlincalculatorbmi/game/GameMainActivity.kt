package pl.pjatk.pamo.kotlincalculatorbmi.game


import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pl.pjatk.pamo.kotlincalculatorbmi.R


class GameMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }
}

//
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import pl.pjatk.pamo.calculatorbmi.R;
//
//public class GameMainActivity extends AppCompatActivity {
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game_main);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//    }
//
//
//}
