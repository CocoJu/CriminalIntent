package testproject.CriminalIntent;

//import android.app.FragmentManager;  конфликт классов android.support.v4.app.FragmentManager
import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.*;
import android.app.*; // В api 11 и выше Активности содержат готовую поддержку Фрагментов

public class CrimeActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        //FragmentManager fm = getSupportFragmentManager(); // В api 11 и выше Активности содержат готовую поддержку Фрагментов
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }

    }
}
