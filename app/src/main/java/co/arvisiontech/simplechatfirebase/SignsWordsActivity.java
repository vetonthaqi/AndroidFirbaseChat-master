package co.arvisiontech.simplechatfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.arvisiontech.firebasechat.R;

public class SignsWordsActivity extends AppCompatActivity {

    GridView grid;
    String[] web = {
            "OK","LOVE","PEACE"
    };

    int[] imageId = {
            R.drawable.ic_okay, R.drawable.ic_love, R.drawable.ic_peace
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs_words);

        CustomGridAlphabet adapter = new CustomGridAlphabet(SignsWordsActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridview_word);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SignsWordsActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_LONG).show();
            }
        });
    }



}
