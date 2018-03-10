package com.example.app12.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegitigaFragment extends Fragment {


    public SegitigaFragment() {
        // Required empty public constructor
    }
    Button klik;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_segitiga,container,false);
        klik = fragmentView.findViewById(R.id.btn_frag_segitiga);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hello guys, saya fragment segitiga",Toast.LENGTH_LONG).show();
            }
        });
        return fragmentView;
    }

}
