package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText et1;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        et1=findViewById(R.id.editText);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Sum) {
            int n=Integer.parseInt(et1.getText().toString());
            int sum = 0;
            while (n != 0)
            {
                    sum = sum + n % 10;
                    n = n/10;
            }
            Toast.makeText(MainActivity.this,"Sum="+sum,Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.Reverse) {

            int n=Integer.parseInt(et1.getText().toString());
            int rev = 0;
            while (n != 0)
            {
                int digit = n % 10;
                rev = rev + (10 * digit);
                n = n/10;
            }
            Toast.makeText(MainActivity.this,"Reverse="+rev,Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.Prime) {
            int n=Integer.parseInt(et1.getText().toString());
            int flag=0;
            for(int a=2;a<n;a++){
                if(n%a==0){
                    flag=flag+1;
                    break;
                }
            }
            if(flag==1){
                Toast.makeText(MainActivity.this,"This is not a prime number",Toast.LENGTH_SHORT).show();

            }else
            Toast.makeText(MainActivity.this,"This is a prime number",Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.Factorial) {
            int n=Integer.parseInt(et1.getText().toString());
            int fact=1;
            for(int a=1;a<=n;a++){
                fact=(fact*a);
            }
            Toast.makeText(MainActivity.this,"Factorial="+fact,Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}
