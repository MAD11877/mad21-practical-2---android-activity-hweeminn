package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.followButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(button.getText().equals("Follow")){
                    button.setText("Unfollow");
            }
                else{
                    button.setText("Follow");
                }
        }});
    }
}
