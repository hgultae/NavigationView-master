package com.android4dev.navigationview;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.android4dev.navigationview.model.ApiData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ApiData apiData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        apiData = (ApiData) getIntent().getSerializableExtra("apiData");
        // test to see if object passing works
        System.out.println(apiData.getResults().get(0).getName());
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        for(int i = 0; i < apiData.getResults().size(); i++){

            // get the latitude and longitude from object
            LatLng latLng = new LatLng(apiData.getResults().get(i).getGeometry().getLocation().getLat(),
                    apiData.getResults().get(i).getGeometry().getLocation().getLng());
            // add marker by adding latlng object above and get name
            mMap.addMarker(new MarkerOptions().position(latLng).title(apiData.getResults().get(i).getName()));

        }

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
