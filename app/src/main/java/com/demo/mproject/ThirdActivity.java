package com.demo.mproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class ThirdActivity extends AppCompatActivity {
    MagicButton magicbtn1 ;
    MagicButton magicbtn2 ;
    MagicButton magicbtn3 ;
    MagicButton magicbtn4 ;
    MagicButton magicbtn5 ;
    MagicButton magicbtn6 ;
    MagicButton magicbtn7 ;
    MagicButton magicbtn8 ;
    MagicButton magicbtn9 ;
    MagicButton magicbtn10 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        getSupportActionBar().setTitle("Select Platform");
        getSupportActionBar().show();
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        magicbtn1=findViewById(R.id.magicbtn1);
        magicbtn1.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaddaccount();
            }
        });


        magicbtn2=findViewById(R.id.magicbtn2);
        magicbtn2.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn3=findViewById(R.id.magicbtn3);
        magicbtn3.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn4=findViewById(R.id.magicbtn4);
        magicbtn4.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn5=findViewById(R.id.magicbtn5);
        magicbtn5.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn6=findViewById(R.id.magicbtn6);
        magicbtn6.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn7=findViewById(R.id.magicbtn7);
        magicbtn7.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn8=findViewById(R.id.magicbtn8);
        magicbtn8.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn9=findViewById(R.id.magicbtn9);
        magicbtn9.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        magicbtn10=findViewById(R.id.magicbtn10);
        magicbtn10.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dotmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "Settings is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_contact:
                Toast.makeText(this, "Contact us is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_about:
                Toast.makeText(this, "About us is Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    private void openaddaccount() {
        Intent addaccount = new Intent(ThirdActivity.this, AddAccount.class);
        startActivity(addaccount);
    }
}