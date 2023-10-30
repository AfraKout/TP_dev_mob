package com.example.afra_kout_tp1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    //question1:
    private EditText ETValMes; //l’EditText qui comporte la valeur mesurée.
    private TextView tvValeur; //le TextView qui affiche la valeur mesurée.
    private RadioButton rbtOui; //le RadioButton oui.
    private RadioButton rbtNon; //le RadioButton pour Non.
    private Button BtnConsulter; //le bouton consulter
    private SeekBar sbAge; //le SeekBar pour choisir la valeur mesurée.
    //question2
    private void init() {
        ETValMes = findViewById(R.id.ETValMes); //l’EditText qui comporte la valeur mesurée.
        tvValeur = findViewById(R.id.tvValeur); //le TextView qui affiche la valeur mesurée.
        rbtOui = findViewById(R.id.rbtOui); //le RadioButton oui.
        rbtNon = findViewById(R.id.rbtNon); //le RadioButton pour Non.
        BtnConsulter = findViewById(R.id.BtnConsulter); //le bouton consulter
        sbAge = findViewById(R.id.sbAge); //le SeekBar pour choisir la valeur mesurée.
    }
    //Question 4 (Méthode Implicite)
    public void calculer(View view)
    {
        // Ajoutez votre code ici pour gérer l'événement de clic sur le bouton Consulter
        // Cette méthode sera déclenchée lorsque le bouton est cliqué
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        init();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //question3
        sbAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
    @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            { Log.i("Information", "onProgressChanged "+progress);
            // affichage dans le Log de Android studio pour voir les changements détectés sur le SeekBar ..
                tvValeur.setText("Votre âge : "+ progress);
         // Mise à jour du TextView par la valeur : progress à chaque changement.
     }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}
        });
        /*Question 5 (Méthode Excplicite)
        BtnConsulter.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Cette méthode sera déclenchée lorsque le bouton est cliqué
            }
        });
         */
    }
}