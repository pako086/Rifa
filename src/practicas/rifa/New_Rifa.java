package practicas.rifa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class New_Rifa extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_rifa);
	}
	
	public void cancelar1(View view) 
	{
        finish();
	}
}
