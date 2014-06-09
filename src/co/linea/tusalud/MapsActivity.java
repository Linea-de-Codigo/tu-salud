package co.linea.tusalud;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {
		
	GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		map =((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		map.setMyLocationEnabled(true);
		
		MarkerOptions marker1 = new MarkerOptions();
		marker1.title("Peaje");
		marker1.snippet("Peaje aqui");
		LatLng position1 = new LatLng(4.50757, -74.991651);
		marker1.position(position1);
		marker1.icon(BitmapDescriptorFactory.fromResource(R.drawable.btna));
		map.addMarker(marker1);
		
		MarkerOptions marker2 = new MarkerOptions();
		marker2.title("Peaje");
		marker2.snippet("Peaje aqui");
		LatLng position2 = new LatLng(4.450084, -75.087487);
		marker2.position(position2);
		marker2.icon(BitmapDescriptorFactory.fromResource(R.drawable.btnb));
		map.addMarker(marker2);
		
		MarkerOptions marker3 = new MarkerOptions();
		marker3.title("Peaje");
		marker3.snippet("Peaje aqui");
		LatLng position3 = new LatLng(4.670638,-74.937809);
		marker3.position(position3);
		marker3.icon(BitmapDescriptorFactory.fromResource(R.drawable.btnc));
		map.addMarker(marker3);
	}
	

}
