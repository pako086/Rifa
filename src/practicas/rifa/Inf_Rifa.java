package practicas.rifa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inf_Rifa extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inf_rifa);
	}
	
	public void NewTicket(View view) 
	{
        Intent i = new Intent(this, New_Ticket.class);
        startActivity(i);
	}

}
