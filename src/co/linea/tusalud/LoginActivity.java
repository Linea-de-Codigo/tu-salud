package co.linea.tusalud;

import android.app.Activity;
import android.os.Bundle;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		Integer inte = new Integer(R.layout.map);
		startActivity(inte);
	}
	
	

}
