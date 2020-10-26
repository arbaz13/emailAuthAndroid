package com.example.tuk_tuk;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Marker marker;
    GPSTracker gps;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        gps = new GPSTracker(MapsActivity.this);

        // check if GPS enabled
        if(gps.canGetLocation()){

            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();

            LatLng locat = new LatLng(latitude,longitude);
            mMap.addMarker(new MarkerOptions().position(locat).title("Your Location"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(locat));
            mMap.getMaxZoomLevel();
        }else{
            // can't get location
            // GPS or Network is not enabled
            // Ask user to enable GPS/network in settings
            gps.showSettingsAlert();
        }
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                a=a+1;
                if (marker != null) {
                    marker.remove();
                }
                if(a<=1) {
                    Toast.makeText(
                            MapsActivity.this,
                            "Lat : " + latLng.latitude + " , "
                                    + "Long : " + latLng.longitude,
                            Toast.LENGTH_LONG).show();

                    LatLng locate = new LatLng(latLng.latitude, latLng.longitude);
                    mMap.addMarker(new MarkerOptions().position(locate).title("Destination"));
                }

            }
        });
        mMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {
                                         @Override
                                         public void onMarkerDragStart(Marker marker) {

                                         }

                                         @Override
                                         public void onMarkerDrag(Marker marker) {

                                         }

                                         @Override
                                         public void onMarkerDragEnd(Marker marker) {

                                         }
                                     }
        );

    }

}
