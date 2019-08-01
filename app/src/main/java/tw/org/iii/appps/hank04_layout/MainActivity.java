package tw.org.iii.appps.hank04_layout;
//super盡量要留下來,但她不一定是要第一行
// String inputString =  input.getText().toString(); //抓到你輸入的文字,轉文字串
// log.setText(inputString); 一開始只有單行訊息,改用append方可以做出log訊息
//  log.append(inputString + "\n"); //在log訊息區,加上你心輸入的文字換行等同於Strinbuffer
//  input.setText(""); //輸入後input清空文字

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input ;
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayouttest);
        Log.v("brad","onCreate");
        input = findViewById(R.id.input);
        log =  findViewById(R.id.log);

    }



    public void doguess(View view){
        String inputString =  input.getText().toString(); //抓到你輸入的文字,轉文字串
        //        log.setText(inputString); 一開始只有單行訊息,改用append方可以做出log訊息
        log.append(inputString + "\n"); //在log訊息區,加上你心輸入的文字換行等同於Strinbuffer
        input.setText(""); //輸入後input清空文字



        Log.v("brad","inputString");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad","onStart");
    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad","onResume");
    }
}
