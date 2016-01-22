package fsst.tanger.sbshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onButtonClick(View v) {
		if (v.getId() == R.id.gproduit) {
			Intent i = new Intent(MainActivity.this, G_produit.class);
			startActivity(i);
		}

		if (v.getId() == R.id.gclient) {
			Intent i = new Intent(MainActivity.this, G_client.class);
			startActivity(i);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
