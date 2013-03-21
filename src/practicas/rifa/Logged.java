package practicas.rifa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Logged extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logged);
	}
	
	public void NewRifa(View view) 
	{
        Intent i = new Intent(this, New_Rifa.class);
        startActivity(i);
	}
}
