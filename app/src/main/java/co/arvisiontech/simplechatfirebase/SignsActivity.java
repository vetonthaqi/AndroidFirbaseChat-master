package co.arvisiontech.simplechatfirebase;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.arvisiontech.firebasechat.R;

import co.arvisiontech.simplechatfirebase.ui.activities.UserListingActivity;

public class SignsActivity extends AppCompatActivity {

    private RelativeLayout mRelativeSign1, mRelativeSign2;
    private TextView mBackSigns;

    private Button mContinueButton;
///Test Giti
    Point p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs);


        mRelativeSign1 = (RelativeLayout) findViewById(R.id.relative_signs_1);
        mRelativeSign2 = (RelativeLayout) findViewById(R.id.relative_chat_lang);


        mRelativeSign1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DeviceListActivity.class);
                startActivity(intent);
            }
        });

//        mRelativeSign1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//
//                if (p != null)
//                    showPopup(SignsActivity.this, p);
//            }
//        });


        mRelativeSign2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "The chat isn't available yet!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), UserListingActivity.class);
                startActivity(intent);
            }
        });




    }

//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//
//        int[] location = new int[2];
//        RelativeLayout button = (RelativeLayout) findViewById(R.id.relative_signs_1);
//
//        button.getLocationOnScreen(location);
//
//
//        p = new Point();
//        p.x = location[0];
//        p.y = location[1];
//
//    }
//
//    private void showPopup(final Activity context, Point p){
//        int popupWidth = 950;
//        int popupHeight = 850;
//
//        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.relative_popup);
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View layout = layoutInflater.inflate(R.layout.activity_pop_up, viewGroup);
//
//        final PopupWindow popup = new PopupWindow(context);
//        popup.setContentView(layout);
//        popup.setWidth(popupWidth);
//        popup.setHeight(popupHeight);
//        popup.setFocusable(true);
//
//        int OFFSET_X = -20;
//        int OFFSET_Y = 50;
//
//        popup.setBackgroundDrawable(new BitmapDrawable());
//
//        popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);
//
//        Button close = (Button) layout.findViewById(R.id.btn_continue_popup);
//        close.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popup.dismiss();
//            }
//        });



//    }
}
