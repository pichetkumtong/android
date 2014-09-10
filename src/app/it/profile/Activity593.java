package app.it.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Activity593 extends Activity implements OnClickListener {
private  TextView tv1,tv2,tv3,tv4,tv5;
private Button bt1,bt2;
private String c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout593);
        s();
    }
	private void s() {
		// TODO Auto-generated method stub
		tv1= (TextView) findViewById(R.id.tv1);
		tv2=(TextView) findViewById(R.id.tv3 );
		tv3=(TextView) findViewById(R.id.tv5);
		tv4=(TextView) findViewById(R.id.tv7);
		tv5=(TextView) findViewById(R.id.tv9);
		
		
		
		
		bt1 = (Button) findViewById(R.id.tb2);
		bt2 = (Button) findViewById(R.id.tb1);
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		
		c1 = getIntent().getStringExtra("v1");
		c2 = getIntent().getStringExtra("v2");
		c3 = getIntent().getStringExtra("v3");
		c4 = getIntent().getStringExtra("v4");
		c5 = getIntent().getStringExtra("v5");
		
		if(tv1!=null){
			tv1.setText("Pichet Kumtong");
			tv2.setText("ice");
			tv3.setText("55410593");
			tv4.setText("Information Technology");
			tv5.setText("0901268932"); 
			
			
		}
		if(c1!=null){
			tv1.setText(c1);
			tv2.setText(c2);
			tv3.setText(c3);
			tv4.setText(c4);
			tv5.setText(c5);
		}
		
		
		
		
		
		
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.tb2:
			Intent h = new Intent(Activity593.this,Pimages.class);
			startActivity(h);
			break;
		case R.id.tb1:
			Intent f = new Intent(Activity593.this,edit.class);
			startActivity(f);
			break;

		default:
			break;
		}
	}
}

   