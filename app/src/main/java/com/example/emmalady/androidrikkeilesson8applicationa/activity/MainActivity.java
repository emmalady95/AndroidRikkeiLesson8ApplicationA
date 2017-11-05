package com.example.emmalady.androidrikkeilesson8applicationa.activity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.emmalady.androidrikkeilesson8applicationa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialog();
    }
    public void showDialog(){
        AlertDialog.Builder dialog =  new AlertDialog.Builder(MainActivity.this);
        String title = "SEND BROASTCAST TO APP A";
        String msg = "Hello A";
        String ok = "OK";
        String cancel = "CANCEL";
        dialog.setTitle(title).setMessage(msg).setPositiveButton(ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setNegativeButton(cancel, null);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}
