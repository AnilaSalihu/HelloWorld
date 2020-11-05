package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("You have called onCreate method!");
        System.out.println("commited");
//         public void onClick(View view) {
//            Toast.makeText(this, "This is button is clicked", Toast.LENGTH_LONG ).show();
//          }

        btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog();
            }
        });
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
                dialog.dismiss();
                openActivity2();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}
