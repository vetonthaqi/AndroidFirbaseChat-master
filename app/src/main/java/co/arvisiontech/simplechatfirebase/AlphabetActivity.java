package co.arvisiontech.simplechatfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.arvisiontech.firebasechat.R;

public class AlphabetActivity extends AppCompatActivity {

    private TextView mBackAlphabet;
    private RelativeLayout mRelativeAlphabet1, mRelativeAlphabet2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        mRelativeAlphabet1 = (RelativeLayout) findViewById(R.id.relative_alphabet_1);
        mRelativeAlphabet2 = (RelativeLayout) findViewById(R.id.relative_alphabet_2);

        mRelativeAlphabet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), SignsAlphabetActivity.class);
//                startActivity(intent);

//                Toast.makeText(getApplicationContext(), "The alphabet isn't available yet!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), SignsAlphabetActivity.class);
                startActivity(intent);
            }
        });

        mRelativeAlphabet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                Intent intent = new Intent(getApplicationContext(), SignsWordsActivity.class);
                startActivity(intent);

//                Toast.makeText(getApplicationContext(),
//                        getString(R.string.speech_not_supported),
//                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
