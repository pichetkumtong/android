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
private  TextView tv1;
private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout593);
        s();
    }
	private void s() {
		// TODO Auto-generated method stub
		tv1= (TextView) findViewById(R.id.textView1);
		bt1 = (Button) findViewById(R.id.button2);
		tv1.setText("Pichet Kumtong");
		bt1.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button2:
			Intent h = new Intent(Activity593.this,Pimages.class);
			startActivity(h);
			break;
		case R.id.button1:
			
			break;

		default:
			break;
		}
	}
}

   