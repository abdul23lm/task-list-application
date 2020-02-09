package com.pbm.listtugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("UAS MANPRO");
        arrayList.add("UAS PBM");
        arrayList.add("UAS SUPL");
        arrayList.add("UAS METLIT");
        arrayList.add("UAS CC");
        arrayList.add("UAS SISPAK");
        arrayList.add("UAS PCD");
        arrayList.add("UAS MULMED");
        arrayList.add("Dokumen WBS");
        arrayList.add("Presentasi Fase Perencanaan");
        arrayList.add("Presentasi PBM");
        arrayList.add("Presentasi Teori SUPL");
        arrayList.add("Review 10 Jurnal");
        arrayList.add("Membuat Video");
        arrayList.add("Membuat Tabel Diagnosis");
        arrayList.add("Latihan PCD");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
