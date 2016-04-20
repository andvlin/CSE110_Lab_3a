package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andy.lab3a.MainActivity;
import com.example.andy.lab3a.R;

/**
 * Created by Andy on 4/19/16.
 */
public class calcTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public calcTest() {
        super(MainActivity.class);
    }

    @UiThreadTest
    public void test_add() {
        mainActivity = getActivity();
        EditText firstNum = (EditText) mainActivity.findViewById(R.id.view_num1);
        EditText secNum = (EditText) mainActivity.findViewById(R.id.view_num2);
        Button btnAdd = (Button) mainActivity.findViewById(R.id.addBtn);
        TextView resultNum = (TextView) mainActivity.findViewById(R.id.view_result);
        int num1 = 57;
        int num2 = 49;
        int sum = 8;
        firstNum.setText(Integer.toString(num1));
        secNum.setText(Integer.toString(num2));
        btnAdd.performClick();
        String resultSum = resultNum.getText().toString();
        assertEquals(Integer.toString(sum), resultSum);

    }
}
