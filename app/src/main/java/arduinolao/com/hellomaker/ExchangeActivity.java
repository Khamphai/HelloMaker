package arduinolao.com.hellomaker;

import android.content.DialogInterface;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ExchangeActivity extends AppCompatActivity {

    private EditText edtLAK;
    private TextView tvType, tvResult;
    private RadioGroup rgRate;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);

        initializes();


    }


    private void initializes() {
        edtLAK = (EditText) findViewById(R.id.edtLAK);
        tvType = (TextView) findViewById(R.id.tvType);
        tvResult = (TextView) findViewById(R.id.tvResult);
        rgRate = (RadioGroup) findViewById(R.id.rgRate);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valEdit = 0;
                double sum = 0;
                String strType = null;
                String strEdit = null;

                strEdit = edtLAK.getText().toString();

                if (strEdit.length() <= 0) {

                    final AlertDialog.Builder alertDialog =
                            new AlertDialog.Builder(ExchangeActivity.this);
                    alertDialog.setIcon(R.drawable.ic_account_circle_white_24dp);
                    alertDialog.setTitle("Warning..!");
                    alertDialog.setMessage("Please Enter LAK");
                    alertDialog.setNegativeButton("OK",
                            new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface
                                                    dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    alertDialog.show();

//                    Toast.makeText(getApplication(),
//                            "Please Enter LAK",
//                            Toast.LENGTH_LONG)
//                            .show();
                    return;
                }

                try {
                    valEdit = Double.parseDouble(strEdit);
                } catch (NumberFormatException e) {

                }

                switch (rgRate.getCheckedRadioButtonId()) {
                    case R.id.rdTHB:
                        double THB = 229.621;
                        sum = valEdit / THB;
                        strType = "THB";
                        break;

                    case R.id.rdUSD:
                        double USD = 8250.50;
                        sum = valEdit / USD;
                        strType = "USD";
                        break;

                    case R.id.rdCNY:
                        double CNY = 1186.02;
                        sum = valEdit / CNY;
                        strType = "CNY";
                        break;

                    case R.id.rdJPY:
                        double JPY = 70.1625;
                        sum = valEdit / JPY;
                        strType = "JPY";
                        break;
                }

                DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                tvResult.setText(decimalFormat.format(sum) + "");
                tvType.setText(strType);

            }
        });

    }


}
