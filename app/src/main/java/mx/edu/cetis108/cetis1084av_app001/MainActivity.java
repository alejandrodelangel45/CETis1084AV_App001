package mx.edu.cetis108.cetis1084av_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn1;
    TextView tvw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText) findViewById(R.id.edt);
        btn1=(Button) findViewById(R.id.btn);
        tvw1=(TextView) findViewById(R.id.tvw);
        btn1.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View View) {
              String escrito = edt1.getText().toString();
              tvw1.setText("" + escrito);
          }
        });
    }
}
