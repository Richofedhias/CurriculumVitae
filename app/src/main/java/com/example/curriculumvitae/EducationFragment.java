package com.example.curriculumvitae;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {
    RecyclerView rV_education,rV_organisasi;
    EducationAdapter Eduadapter;
    OrganisasiAdapter organisasiAdapter;
    ArrayList<EducationList> listEducation = new ArrayList<>();
    ArrayList<OrganisasiList> listOrganisasi = new ArrayList<>();
    View view;

    public EducationFragment() {
        // Required empty public constructor
        listEducation.add(new EducationList("SMPN 1 TEMBELANG","JUNIOR HIGH SCHOOL","2011-2014",R.drawable.smp));
        listEducation.add(new EducationList("SMAN 3 JOMBANG","SENIOR HIGH SCHOOL","2014-2017",R.drawable.sma));
        listEducation.add(new EducationList("TELKOM UNIVERSITY","UNIVERSITY","2017-now",R.drawable.telkom));

        listOrganisasi.add(new OrganisasiList("KOPAJA(Komunitas Pelajar Jombang)","COMMUNITY","2017-now",R.drawable.kopaja));
        listOrganisasi.add(new OrganisasiList("CISC JOMBANG","COMMUNITY","2016-now",R.drawable.cisc));
        listOrganisasi.add(new OrganisasiList("HIMADIF(Himpunan D3 Teknik Informatika)","HIMPUNAN","2017-2018",R.drawable.himadif));
        listOrganisasi.add(new OrganisasiList("PASKIBRA TELKOM UNIVERSITY","UNIT KEGIATAN MAHASISWA","2017-2019",R.drawable.paskib));

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_education,container,false);
        rV_education = view.findViewById(R.id.rV_education);
        rV_organisasi = view.findViewById(R.id.rV_organisasi);

        rV_education.setHasFixedSize(true);
        rV_organisasi.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager lm2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        rV_education.setLayoutManager(lm);
        rV_organisasi.setLayoutManager(lm2);
        Eduadapter = new EducationAdapter(getContext(),listEducation);
        organisasiAdapter = new OrganisasiAdapter(getContext(),listOrganisasi);
        rV_education.setAdapter(Eduadapter);
        rV_organisasi.setAdapter(organisasiAdapter);
        return view;
    }

}
