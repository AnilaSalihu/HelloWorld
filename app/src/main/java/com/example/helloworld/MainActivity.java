package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("You have called onCreate method!");
        // public void onClick(View view) {​​​​​​​​
        //    Toast.makeText(this, "This is a toast", Toast.LENGTH_LONG ).show();
        //  }​​​​​​​​
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("You have called onStart method!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("You have called onResume method!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("You have called onPause method!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("You have called onStop method!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("You have called onRestart method!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("You have called onDestroy method!");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("You have called onBackPressed method!");
    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Open App Dialog");
        alertDialogBuilder.setMessage("Do you want to open the app?");
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


}

