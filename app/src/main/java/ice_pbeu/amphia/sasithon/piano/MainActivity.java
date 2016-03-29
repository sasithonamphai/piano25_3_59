package ice_pbeu.amphia.sasithon.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //2.Explicit
    private Button DoButton;
    private Button ReButton;
    private Button MiButton;
    private Button FaButton;
    private Button SoButton;
    private Button LaButton;
    private Button SiButton;
    private Button DOButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget();
        buttonController();


    }//Main Method

    private void buttonController() {
        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song1);
                DoMediaPlayer.start();
                DoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });
        ReButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ReMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song2);
                ReMediaPlayer.start();
                ReMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });


            }
        });
        MiButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer MiMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song3);
                MiMediaPlayer.start();
                MiMediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
                    @Override
                    public void onBufferingUpdate(MediaPlayer mp, int percent) {
                        mp.release();

                    }
                });
            }
        }) ;
        FaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FaMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song4);
                FaMediaPlayer.start();
                FaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();

                    }
                });

            }
        });
        SoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SoMediaPlayer = MediaPlayer.create(getBaseContext() ,R .raw .song5 );
                SoMediaPlayer.start();
                SoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        LaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LaMediaPlayer = MediaPlayer.create(getBaseContext() ,R.raw .song6 );
                LaMediaPlayer.start();
                LaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        SiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SiMediaPlayer = MediaPlayer.create(getBaseContext(),R .raw .song7 );
                SiMediaPlayer.start();
                SiMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });



    }//buttonController

    private void bindWidget() {
        DoButton = (Button) findViewById(R.id.button);
        ReButton = (Button) findViewById(R.id.button2);
        MiButton = (Button) findViewById(R.id.button3);
        FaButton = (Button) findViewById(R.id.button4);
        SoButton = (Button) findViewById(R.id.button5);
        LaButton = (Button) findViewById(R.id.button6);
        SiButton = (Button) findViewById(R.id.button7);
        DOButton = (Button) findViewById(R.id.button8);


    }//bind Widget
}//Main class
