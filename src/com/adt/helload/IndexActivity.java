package com.adt.helload;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class IndexActivity extends Activity {
	
	
	private Button demoButton ;
	
	private View calcview;
	
	private View v2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        
        
        
        
        demoButton = (Button) this.findViewById(R.id.demo);
        
        
        //加载view放入缓存中
        //linelayout demo
        calcview = getLayoutInflater().inflate(R.layout.calculate, null) ;
        
        // tablelayout demo
        v2 = this.getLayoutInflater().inflate(R.layout.calculate_table, null);
        		
        	 
        
        // bind the button to the special click lister event
        demoButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Log.i("demo", "click");
				
				
				//setContentView(calcview);
				//calcview.bringToFront();
				
				
				// switch the view 
				setContentView(v2);
				
			}
		});
        	
        	
        	
        	
      
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
