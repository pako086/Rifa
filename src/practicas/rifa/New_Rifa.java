package practicas.rifa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class New_Rifa extends Activity {
	private static final int TOMAR_FOTO = 1;
	ImageView imagen = (ImageView) findViewById(R.id.imageView1);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_rifa);
	}
	
	public void tomarFoto(View view)
	{
		Intent TF = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(TF, TOMAR_FOTO);
		
	}
	
	@Override 
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
	                if  (requestCode == TOMAR_FOTO) {
	                         Bitmap foto = (Bitmap) data.getExtras().get("data"); 
	                         imagen.setImageBitmap(foto);
	               }
	 }
	
	public void cancelar1(View view) 
	{
        finish();
	}
}
