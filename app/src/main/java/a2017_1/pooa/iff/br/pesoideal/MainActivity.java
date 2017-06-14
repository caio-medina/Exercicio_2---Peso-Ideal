package a2017_1.pooa.iff.br.pesoideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    final RadioButton homem = (RadioButton) findViewById(R.id.rdbHomem);
    final RadioButton mulher = (RadioButton) findViewById(R.id.rdbMulher);
    private EditText altura;
    private Button calcular = (Button) findViewById(R.id.btCalcular);
    private ImageView imagem_homem,imagem_mulher;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = (EditText) findViewById(R.id.edtAltura);
        imagem_homem = (ImageView) findViewById(R.id.imgView);
        imagem_mulher = (ImageView) findViewById(R.id.imgView);

        calcular.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k;
                float p;
                float ialtura = Float.parseFloat(altura.getText().toString());
                if (homem.isChecked() == true) {
                    k=4;
                    p= (ialtura-100) - (ialtura-150)/k;
                    imagem_homem.setImageResource(R.drawable.homem);

                }
                if (mulher.isChecked() == true) {
                    k=2;
                    p= (ialtura-100) - (ialtura-150)/k;
                    imagem_mulher.setImageResource(R.drawable.mulher);
                }

            }
        });
    }


}


