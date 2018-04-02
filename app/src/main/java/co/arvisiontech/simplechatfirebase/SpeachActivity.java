package co.arvisiontech.simplechatfirebase;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.arvisiontech.firebasechat.R;

import co.arvisiontech.simplechatfirebase.core.logout.LogoutPresenter;
import co.arvisiontech.simplechatfirebase.ui.activities.UserListingActivity;

public class SpeachActivity extends AppCompatActivity {

    private RelativeLayout mRelativeSpeach1, mRelativeSpeach2, mRelativeSpeach3;

    private LogoutPresenter mLogoutPresenter;


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SpeachActivity.class);
        context.startActivity(intent);
    }

    public static void startActivity(Context context, int flags) {
        Intent intent = new Intent(context, SpeachActivity.class);
        intent.setFlags(flags);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speach);

        mRelativeSpeach1 = (RelativeLayout) findViewById(R.id.relative_speach_1);
        mRelativeSpeach2 = (RelativeLayout) findViewById(R.id.relative_speach_2);
        mRelativeSpeach3 = (RelativeLayout) findViewById(R.id.relative_speach_3);


        mRelativeSpeach1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getApplicationContext(),SignsActivity.class);
                startActivity(startActivityIntent);
            }
        });


        mRelativeSpeach2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlphabetActivity.class);
                startActivity(intent);
            }
        });


        mRelativeSpeach3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TextToSpeachActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_user_listing, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logout:
                logout();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.logout)
                .setMessage(R.string.are_you_sure)
                .setPositiveButton(R.string.logout, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        mLogoutPresenter.logout();
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
}
