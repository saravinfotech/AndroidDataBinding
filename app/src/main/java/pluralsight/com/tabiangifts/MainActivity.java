package pluralsight.com.tabiangifts;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import pluralsight.com.tabiangifts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //data binding
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init() {
        ViewProductFragment productFragment = new ViewProductFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, productFragment);
        fragmentTransaction.commit();
    }
}
