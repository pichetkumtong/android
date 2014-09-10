package app.it.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class edit extends Activity implements OnClickListener  {
	private Button s1;
	private TextView t1;
	private EditText e1;
	private EditText e2;
	private EditText e3;
	private EditText e4;
	private EditText e5;
	private String p1,p2,p3,p4,p5;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit);
		kkk();
		
		
	}
	

	private void kkk() {
		// TODO Auto-generated method stub
		s1= (Button) findViewById(R.id.tb3);
		t1= (TextView) findViewById(R.id.etv1);
		e1= (EditText) findViewById(R.id.et11);
		e2=(EditText) findViewById(R.id.et22);
		e3=(EditText) findViewById(R.id.et33);
		e4=(EditText) findViewById(R.id.et44);
		e5=(EditText) findViewById(R.id.et55);
		
		
		
		
		s1.setOnClickListener(this);
		
		
		
		
		
		
		
	}

	@Override
	public void onClick(View v) {
		
		
		
		Intent m = new Intent(edit.this,Activity593.class);
		
		p1 = e1.getText().toString();
		p2 = e2.getText().toString();
		p3 = e3.getText().toString();
		p4 = e4.getText().toString();
		p5 = e5.getText().toString();
		m.putExtra("v1",p1);
		m.putExtra("v2",p2);
		m.putExtra("v3",p3);
		m.putExtra("v4",p4);
		m.putExtra("v5",p5);
		
		
		startActivity(m);
		
		
	}
	
}

