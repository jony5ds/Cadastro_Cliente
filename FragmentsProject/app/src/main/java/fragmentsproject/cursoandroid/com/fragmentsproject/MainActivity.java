package fragmentsproject.cursoandroid.com.fragmentsproject;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity
{
    private Button botaoP1;
    private Button botaoP2;
    private Button botaoP3;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                botaoP1 = (Button) findViewById(R.id.botaoP1Id);
                botaoP2 = (Button) findViewById(R.id.botaoP2Id);
                botaoP3 = (Button) findViewById(R.id.botaoP3Id);

                botaoP1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.rl_container_fragmento,  new LoginFragment()).commit();

                    }
                });

        botaoP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.rl_container_fragmento,  new CadastroFragment()).commit();
            }
        });

        botaoP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.rl_container_fragmento,  new CadastroFragment2()).commit();
            }
        });






    }
}
