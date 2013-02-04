package nl.de_bree.android.doduino;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DoDuino extends Activity {
	private DoDuinoClient doDuinoClient;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        doDuinoClient = new DoDuinoClient();
        
        setContentView(R.layout.main);

        ((Button)findViewById(R.id.on_sw_3)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "AAN", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		      		
        		qparams.add(new BasicNameValuePair( "sw_3", "1" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        ((Button)findViewById(R.id.off_sw_3)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "UIT", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		      		
        		qparams.add(new BasicNameValuePair( "sw_3", "0" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        
        ((Button)findViewById(R.id.laag_mv)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "LAAG", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "sw_0", "1" ));        		
        		qparams.add(new BasicNameValuePair( "sw_1", "0" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        
        ((Button)findViewById(R.id.hoog_mv)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "HOOG", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "sw_0", "1" ));        		
        		qparams.add(new BasicNameValuePair( "sw_1", "1" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        ((Button)findViewById(R.id.laag_mv)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "LAAG", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "sw_0", "1" ));        		
        		qparams.add(new BasicNameValuePair( "sw_1", "0" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        ((Button)findViewById(R.id.uit_mv)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "sw_0", "0" ));
        		qparams.add(new BasicNameValuePair( "sw_1", "0" ));
        		
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        
        ((Button)findViewById(R.id.hoog_keuken)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_7", "175" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_6", "1"  ));
        		
        		doDuinoClient.set( qparams );
        		        		
        	}
        });
        
        ((Button)findViewById(R.id.laag_keuken)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_7", "100" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_6", "0"  ));
        		
        		doDuinoClient.set( qparams );
        	}
        });
        
        ((Button)findViewById(R.id.uit_keuken)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_7", "0" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_6", "0"  ));
        		
        		doDuinoClient.set( qparams );

        	}
        });
        
        ((Button)findViewById(R.id.max_li_5)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "MAX", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 5, 170 );
        	}
        });
        
        ((Button)findViewById(R.id.low_li_5)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "LOW", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 5, 80 );
        	}
        });

        ((Button)findViewById(R.id.off_li_5)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 5, 0 );
        	}
        });
        
        ((Button)findViewById(R.id.hoog_woonkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();

        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_0", "170" ));
        		qparams.add(new BasicNameValuePair( "li_1", "175" ));
        		qparams.add(new BasicNameValuePair( "li_2", "67"  ));
        		qparams.add(new BasicNameValuePair( "li_3", "190" ));
        		qparams.add(new BasicNameValuePair( "li_6", "104" ));
        		qparams.add(new BasicNameValuePair( "li_7", "120" ));
        		qparams.add(new BasicNameValuePair( "li_9", "65" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_2", "1"  ));
        		qparams.add(new BasicNameValuePair( "sw_6", "0"  ));
        		
        		doDuinoClient.set( qparams );
        	}
        });

        ((Button)findViewById(R.id.laag_woonkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_0", "140" ));
        		qparams.add(new BasicNameValuePair( "li_1", "138" ));
        		qparams.add(new BasicNameValuePair( "li_2", "48"  ));
        		qparams.add(new BasicNameValuePair( "li_3", "117" ));
        		qparams.add(new BasicNameValuePair( "li_6", "70" ));
        		qparams.add(new BasicNameValuePair( "li_7", "80" ));
        		qparams.add(new BasicNameValuePair( "li_9", "50" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_2", "1"  ));
        		qparams.add(new BasicNameValuePair( "sw_6", "0"  ));
        		
        		doDuinoClient.set( qparams );
        		        		
        	}
        });

        ((Button)findViewById(R.id.uit_woonkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();
        		
        		qparams.add(new BasicNameValuePair( "li_0", "0" ));
        		qparams.add(new BasicNameValuePair( "li_1", "0" ));
        		qparams.add(new BasicNameValuePair( "li_2", "0"  ));
        		qparams.add(new BasicNameValuePair( "li_3", "0" ));
        		qparams.add(new BasicNameValuePair( "li_6", "0" ));
        		qparams.add(new BasicNameValuePair( "li_7", "0" ));
        		qparams.add(new BasicNameValuePair( "li_9", "0" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_2", "0"  ));
        		qparams.add(new BasicNameValuePair( "sw_6", "0"  ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        
        ((Button)findViewById(R.id.hoog_eettafel)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_9", "99" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });

        ((Button)findViewById(R.id.laag_eettafel)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();

        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_9", "90" ));
        		
        		doDuinoClient.set( qparams );        		        		        		
        	}
        });

        ((Button)findViewById(R.id.laagst_eettafel)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_9", "80" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });
        

        
        ((Button)findViewById(R.id.hoog_slaapkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_4", "70" ));
        		qparams.add(new BasicNameValuePair( "li_8", "180" ));
        		
        		doDuinoClient.set( qparams );        		
        	}
        });

        ((Button)findViewById(R.id.laag_slaapkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();

        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_4", "0" ));
        		qparams.add(new BasicNameValuePair( "li_8", "100" ));
        		
        		doDuinoClient.set( qparams );        		        		        		
        	}
        });

        ((Button)findViewById(R.id.uit_slaapkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_4", "0" ));
        		qparams.add(new BasicNameValuePair( "li_8", "0" ));
        		
        		doDuinoClient.set( qparams );        		

//        		doDuinoClient.setLight( 4, 0 );
//        		doDuinoClient.setLight( 8, 0 );
        	}
        });

        
        ((Button)findViewById(R.id.hoog_badkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 10, 254 );
        	}
        });

        ((Button)findViewById(R.id.laag_badkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 10, 100 );
        	}
        });

        ((Button)findViewById(R.id.uit_badkamer)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 10, 0 );
        	}
        });
        

        ((Button)findViewById(R.id.hoog_toilet)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Hoog", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 11, 254 );
        	}
        });

        ((Button)findViewById(R.id.laag_toilet)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Laag", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 11, 180 );
        	}
        });

        ((Button)findViewById(R.id.uit_toilet)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		doDuinoClient.setLight( 11, 0 );
        	}
        });        

        
        ((Button)findViewById(R.id.uit_alles)).setOnClickListener(new OnClickListener() {
        	public void onClick( View v ) {
        		Toast.makeText(getApplicationContext(), "Uit", Toast.LENGTH_SHORT).show();
        		
        		List<NameValuePair> qparams = new ArrayList<NameValuePair>();

        		qparams.add(new BasicNameValuePair( "li_0", "0" ));
        		qparams.add(new BasicNameValuePair( "li_1", "0" ));
        		qparams.add(new BasicNameValuePair( "li_2", "0" ));
        		qparams.add(new BasicNameValuePair( "li_3", "0" ));
        		qparams.add(new BasicNameValuePair( "li_4", "0" ));
        		qparams.add(new BasicNameValuePair( "li_5", "0" ));
        		qparams.add(new BasicNameValuePair( "li_6", "0" ));
        		qparams.add(new BasicNameValuePair( "li_7", "0" ));
        		qparams.add(new BasicNameValuePair( "li_8", "0" ));
        		qparams.add(new BasicNameValuePair( "li_9", "0" ));
        		qparams.add(new BasicNameValuePair( "li_10", "0" ));
        		qparams.add(new BasicNameValuePair( "li_11", "0" ));
        		
        		qparams.add(new BasicNameValuePair( "sw_2", "0" ));
        		qparams.add(new BasicNameValuePair( "sw_6", "0" ));
        		
        		doDuinoClient.set( qparams );        		        		        		
        	}
        });        
        
    }
}