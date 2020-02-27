package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = findViewById(R.id.editTextinicial);
        editTextfinal = findViewById(R.id.editTextfinal);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    //public void sorteia(View view) {
      //  int inicial = Integer.parseInt(editTextinicial.getText().toString());
        //int fim = Integer.parseInt(editTextfinal.getText().toString());

       // textViewResultado.setText(Integer.toString((inicial)));

  //  }

    public void sorteianumero (View View){
        TextView textView = findViewById(R.id.textViewResultado);
        EditText editTextinicial = findViewById(R.id.editTextinicial);
        EditText editTextfinal = findViewById (R.id.editTextfinal);
        int valorinicial= Integer.parseInt(editTextinicial.getText().toString());
        int valorfinal= Integer.parseInt(editTextfinal.getText().toString());
        textView.setText(Integer.toString(textViewResultado));
    }
}
