package co.arvisiontech.simplechatfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.arvisiontech.firebasechat.R;


public class SignsAlphabetActivity extends AppCompatActivity {

    GridView grid;
    String[] web = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
            "P","Q","R","S","T","U","V","W","X","Y","Z"
    };

    int[] imageId = {
            R.drawable.ic_a, R.drawable.ic_b, R.drawable.ic_c,
            R.drawable.ic_d, R.drawable.ic_e, R.drawable.ic_f,
            R.drawable.ic_g, R.drawable.ic_h, R.drawable.ic_i,
            R.drawable.ic_j, R.drawable.ic_k, R.drawable.ic_l,
            R.drawable.ic_m, R.drawable.ic_n, R.drawable.ic_o,
            R.drawable.ic_p, R.drawable.ic_q, R.drawable.ic_r,
            R.drawable.ic_s, R.drawable.ic_t, R.drawable.ic_u,
            R.drawable.ic_v, R.drawable.ic_w, R.drawable.ic_x,
            R.drawable.ic_y, R.drawable.ic_z
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs_alphabet);


        CustomGridAlphabet adapter = new CustomGridAlphabet(SignsAlphabetActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridview_alphabet);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SignsAlphabetActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_LONG).show();
            }
        });


//        GridView gridView = findViewById(R.id.gridview_alphabet);
//        gridView.setAdapter(new ImageAdapter(this));
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//
//                Toast.makeText(SignsAlphabetActivity.this, "" + position, Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
