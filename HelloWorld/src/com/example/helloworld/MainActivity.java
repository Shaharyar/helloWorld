package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	String msg = "Android updates: ";
	   
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_main);
	      Log.d(msg, "The onCreate() event");
	   }

	   /** Called when the activity is about to become visible. */
	   @Override
	   protected void onStart() {
	      super.onStart();
	      Log.d(msg, "The onStart() event");
	   }

	   /** Called when the activity has become visible. */
	   @Override
	   protected void onResume() {
	      super.onResume();
	      Log.d(msg, "The onResume() event");
	   }

	   /** Called when another activity is taking focus. */
	   @Override
	   protected void onPause() {
	      super.onPause();
	      Log.d(msg, "The onPause() event");
	   }

	   /** Called when the activity is no longer visible. */
	   @Override
	   protected void onStop() {
	      super.onStop();
	      Log.d(msg, "The onStop() event");
	   }

	   /** Called just before the activity is destroyed. */
	   @Override
	   public void onDestroy() {
	      super.onDestroy();
	      Log.d(msg, "The onDestroy() event");
	   }
	


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
