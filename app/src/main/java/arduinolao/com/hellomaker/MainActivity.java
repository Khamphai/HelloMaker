package arduinolao.com.hellomaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvProfile, tvName, tvAge, tvGender, tvMajor;
    TextView tvProfile2, tvName2, tvAge2, tvGender2, tvMajor2;

    //String strProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_phuvong);
        //initializes();
    }

    private void initializes() {

        initialWidget();

        //tvProfile.setBackground(getDrawable(R.drawable.ic_account_circle_white_24dp));
        tvAge.setText("30");
        tvName.setText("ຄຳໄພ ຄຸນນະວົງສາ");
        //tvName.setTextColor(getColor(R.color.tvColor));
        //tvName.setTextSize(30);
        tvGender.setText("Male");
        tvMajor.setText("IT");

        tvProfile2.setBackground(getDrawable(R.drawable.ic_library_add_red_700_24dp));
        tvName2.setText("Hello");
    }

    private void initialWidget() {
        tvProfile = (TextView) findViewById(R.id.tvProfile);
        tvAge = (TextView) findViewById(R.id.tvAge);
        tvName = (TextView) findViewById(R.id.tvName);
        tvGender = (TextView) findViewById(R.id.tvGender);
        tvMajor = (TextView) findViewById(R.id.tvMajor);

        tvProfile2 = (TextView) findViewById(R.id.tvProfile2);
        tvName2 = (TextView) findViewById(R.id.tvName2);
        tvAge2 = (TextView) findViewById(R.id.tvAge2);
        tvGender2 = (TextView) findViewById(R.id.tvGender2);
        tvMajor2 = (TextView) findViewById(R.id.tvMajor2);
    }


}
