package testproject.CriminalIntent;
import android.os.Bundle;
//import android.support.v4.app.*;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by ANK on 15.11.2014.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(
            new TextWatcher() {
                public void onTextChanged(CharSequence c, int start, int before, int count) {
                    mCrime.setTitle(c.toString());
                    android.util.Log.d("test onTextChanged", c.toString());
                }
                public void beforeTextChanged(CharSequence c, int start, int count, int after) {
    // Здесь намеренно оставлено пустое место
                }
                public void afterTextChanged(Editable c) {
    // И здесь тоже
                }
            }
        );
        return v;
    }
}
