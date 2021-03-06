package kr.co.tjoeun.a20200317_01_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

import kr.co.tjoeun.a20200317_01_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.inputBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String input = binding.inputEdt.getText().toString();

                binding.prnTxt.setText(input);
                binding.inputEdt.setText("");
            }
        });

    }
}
