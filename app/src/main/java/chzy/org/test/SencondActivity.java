package chzy.org.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SencondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencond);

    }
    public void  click(View v){
                Intent intent=new Intent();
                intent.putExtra("name","guojia");
                setResult(RESULT_OK,intent);
                finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent();
        intent.putExtra("name","guojia");
        setResult(RESULT_OK,intent);
        finish();
        System.out.println("-----------------------");
    }
}
