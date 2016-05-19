package org.acoes.mapacoes;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        mMap.setMapType(mMap.MAP_TYPE_NORMAL);


        // Add a marker in Monterrey and move the camera
        LatLng ccj1 = new LatLng(14.057577, -87.194032);
        mMap.addMarker(new MarkerOptions().position(ccj1).title("Centro de Capacitación Juvenil 1 (C.C.J. 1)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ccj1, 18));

        LatLng ccj2 = new LatLng(14.057688, -87.194723);
        mMap.addMarker(new MarkerOptions().position(ccj2).title("Centro de Capacitación Juvenil 2 (C.C.J. 2)"));

    }
}
