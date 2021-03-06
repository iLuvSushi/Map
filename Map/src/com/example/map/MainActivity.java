package com.example.map;

import android.os.Bundle;
import android.app.Activity;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MainActivity extends Activity
{
	private GoogleMap mMap;
	private LatLngBounds ILOILO = new LatLngBounds(new LatLng(10.6, 122.466), new LatLng(10.716, 122.566));
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        
        mMap.setMyLocationEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ILOILO.getCenter(), 10));
    }
}
