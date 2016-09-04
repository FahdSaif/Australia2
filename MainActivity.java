package com.icm.fahd.australia;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
//import android.support.v4.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.login);
        //setContentView(R.layout.frame);
        setContentView(R.layout.home);
        //setContentView(R.layout.fragmentsprac);


        b1 =(Button)findViewById(R.id.btn1);
        b2= (Button)findViewById(R.id.btn2);

       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM1 = getFragmentManager();
                FragmentTransaction FT=FM1.beginTransaction();
                FragmentOne F1= new FragmentOne();
                FT.add(R.id.fr1,F1);
                FT.commit();




            }
        });*/


        /*b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTwo F2= new FragmentTwo();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fr1,F2);
                transaction.addToBackStack(null);
                transaction.commit();

                /*FragmentManager FM1 = getFragmentManager();
                FragmentTransaction FT=FM1.beginTransaction();
                FragmentTwo F2= new FragmentTwo();
                FT.add(R.id.fr2,F2);

                FT.commit();

            }
        });*/

    }


    public void sendMessage(View view)
    {
        Intent intentperth = new Intent(this, DisplayPerth.class);
        startActivity(intentperth);


    }


    public void sendMessagesydney(View view)
    {
        Intent intentsydney = new Intent(this, DisplaySydney.class);
        startActivity(intentsydney);


    }



    public void sendMessageMelbourne(View view)
    {
        Intent intentMelbourne = new Intent(this, DisplayMelbourne.class);
        startActivity(intentMelbourne);
    }

    public void sendMessageDarwin(View view)
    {
        Intent intentDarwin = new Intent(this, DisplayDarwin.class);
        startActivity(intentDarwin);
    }

    public void sendMessageCanbera(View view)
    {
        Intent intentCanbera = new Intent(this,DisplayCanbera.class);
        startActivity(intentCanbera);

    }

    public void sendMessageBrisbane(View view)
    {
        Intent intentbrisbane = new Intent(this,DisplayBrisbane.class);
        startActivity(intentbrisbane);

    }

    public void sendMessageGoldCoast(View view){
        Intent intentGoldcoast = new Intent(this,DisplayGoldCoast.class);
        startActivity(intentGoldcoast);

    }


    public void sendMessageAdelaide(View view){
        Intent intentAdelaide=new Intent(this,DisplayAdelaide.class);
        startActivity(intentAdelaide);


    }
}
