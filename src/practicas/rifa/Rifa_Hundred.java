package practicas.rifa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rifa_Hundred extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rifa_hundred);
	}
	
	public void InfHundred(View view) 
	{
        Intent i = new Intent(this, Inf_Rifa_Hundred.class);
        startActivity(i);
	}
}
