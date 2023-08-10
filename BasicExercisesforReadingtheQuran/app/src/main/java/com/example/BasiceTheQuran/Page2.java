package com.example.BasiceTheQuran;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Page2 extends AppCompatActivity {
    ListView p2List;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    EditText p2Etext5;
    String[] arabword={" ก่อนรับประทานอาหารร ",
            " หลังรับประทานอาหาร",
            " ก่อนนอน",
            " เมื่อตกใจตื่น หรือฝันร้าย ",
            " หลังตื่นนอน ",
            " เมื่อจะออกไปละหมาด ",
            " เข้ามัสยิด ",
            " ออกมัสยิด ",
            " เข้าบ้าน ",
            " ออกบ้าน",
            " เข้าห้องน้ำ",
            " ออกห้องน้ำ",
            " ยามเช้า",
            " ยามเย็น",
            " เมื่อจาม",
            " ขับขี่ยานพาหนะ",
            " ยามฟ้าร้อง",
            " ยามฝนตก ",
            " ยามมีพายุพัดแรง ",
            " ส่องกระจก ",
            " สวมเสื้อผ้า หรือรองเท้าใหม่ ",
            " หลังอาบน้ำละหมาด ",
            " ขอการอภัยโทษ ",
            " หลังให้สลาม (หลังละหมาด) ",
            " คืนวันแต่งงาน",
            " เข้าที่พัก หรือพักตามป่าตามเขา ",
            " ให้พ่อแม่",
            " ให้แก่ผู้ที่เลี้ยงอาหารเรา",
            " เยี่ยมคนป่วย",
            " ขณะกำลังจะออกเดินทาง",
            " เมื่อได้ยินข่าวการเสียชีวิต",
            " เข้าตลาด",
            " เมื่อเสร็จจากประชุม หรือชุมนุม",
            " เยี่ยมสุสาน",
            " ขอให้ความรู้เพิ่มพูน",
            " ขอให้ร่ำรวย",
            " ขอไม่ให้เป็นคนเกียจคร้าน",
            " เมื่อมีโรคภัยรุมเร้า",
            " ขณะกำลังโมโห",
            " เมื่อเกิดทุกข์ภัย",
            " ยามมีความเครียด ความวิตกกังวล",
            " สำหรับคนมีหนี้สิน",
            " เมื่อพบความทุกข์โศกอย่างแสนสาหัส",
            " เมื่อไม่ต้องการมีชีวิตอยู่ต่อไป",
            " เห็นคนประสบภัย",
            " ขอให้เกิดความสะดวกง่ายดาย",
            " ขอความคุ้มครองให้ลูกหลาน",
            " ขอสิ่งที่ดีๆทั้งในดุนยา และอาคิเราะห์",
            " ขอคู่ครอง และลูกหลานที่ดี",
            " เมื่อขึ้นที่สูง",
            " เมื่อลงจากที่สูง",
            "  غَزَالٌ  < กวาง  < ฆ่อ-ซา-ลุน    "};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);









        p2List = (ListView)findViewById(R.id.listp2);
        p2Etext5     = (EditText) findViewById(R.id.edittestP2);
        initList1();

        p2Etext5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")){
                    //reset listview
                    initList1();
                }
                else {
                    //perform search
                    searchItem1(s.toString());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // perform search

            }
        });



    }

    public void searchItem1(String textToSearch){
        for (String wp31:arabword){
            if (!wp31.contains(textToSearch)){
                listItems.remove(wp31);
            }
        }
        adapter.notifyDataSetChanged();
    }
    public void initList1(){
        listItems = new ArrayList<>(Arrays.asList(arabword));
        adapter = new ArrayAdapter<String>(this,R.layout.layoutlist2v1,R.id.textoutp2v1,listItems);
        p2List.setAdapter(adapter);
        p2List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent Goc1 = new Intent(Page2.this,P2n0.class);
                    startActivity(Goc1);

                }

                if (position == 1){
                    Intent Goc1 = new Intent(Page2.this,P2n1.class);
                    startActivity(Goc1);

                }
                if (position == 2){
                    Intent Goc1 = new Intent(Page2.this,P2n2.class);
                    startActivity(Goc1);

                }
                if (position == 3){
                    Intent Goc1 = new Intent(Page2.this,P2n3.class);
                    startActivity(Goc1);

                }
                if (position == 4){
                    Intent Goc1 = new Intent(Page2.this,P2n4.class);
                    startActivity(Goc1);

                }
                if (position == 5){
                    Intent Goc1 = new Intent(Page2.this,P2n5.class);
                    startActivity(Goc1);

                }
                if (position == 6){
                    Intent Goc1 = new Intent(Page2.this,P2n6.class);
                    startActivity(Goc1);

                }
                if (position == 7){
                    Intent Goc1 = new Intent(Page2.this,P2n7.class);
                    startActivity(Goc1);

                }
                if (position == 8){
                    Intent Goc1 = new Intent(Page2.this,P2n8.class);
                    startActivity(Goc1);

                }
                if (position == 9){
                    Intent Goc1 = new Intent(Page2.this,P2n9.class);
                    startActivity(Goc1);

                }
                if (position == 10){
                    Intent Goc1 = new Intent(Page2.this,P2n10.class);
                    startActivity(Goc1);

                }
                if (position == 11){
                    Intent Goc1 = new Intent(Page2.this,P2n11.class);
                    startActivity(Goc1);

                }
                if (position == 12){
                    Intent Goc1 = new Intent(Page2.this,P2n12.class);
                    startActivity(Goc1);

                }
                if (position == 13){
                    Intent Goc1 = new Intent(Page2.this,P2n13.class);
                    startActivity(Goc1);

                }
                if (position == 14){
                    Intent Goc1 = new Intent(Page2.this,P2n14.class);
                    startActivity(Goc1);

                }
                if (position == 15){
                    Intent Goc1 = new Intent(Page2.this,P2n15.class);
                    startActivity(Goc1);

                }
                if (position == 16){
                    Intent Goc1 = new Intent(Page2.this,P2n16.class);
                    startActivity(Goc1);

                }
                if (position == 17){
                    Intent Goc1 = new Intent(Page2.this,P2n17.class);
                    startActivity(Goc1);

                }
                if (position == 18){
                    Intent Goc1 = new Intent(Page2.this,P2n18.class);
                    startActivity(Goc1);

                }
                if (position == 19){
                    Intent Goc1 = new Intent(Page2.this,P2n19.class);
                    startActivity(Goc1);

                }
                if (position == 20){
                    Intent Goc1 = new Intent(Page2.this,P2n20.class);
                    startActivity(Goc1);

                }
                if (position == 21){
                    Intent Goc1 = new Intent(Page2.this,P2n21.class);
                    startActivity(Goc1);

                }
                if (position == 22){
                    Intent Goc1 = new Intent(Page2.this,P2n22.class);
                    startActivity(Goc1);

                }
                if (position == 23){
                    Intent Goc1 = new Intent(Page2.this,P2n23.class);
                    startActivity(Goc1);

                }
                if (position == 24){
                    Intent Goc1 = new Intent(Page2.this,P2n24.class);
                    startActivity(Goc1);

                }
                if (position == 25){
                    Intent Goc1 = new Intent(Page2.this,P2n25.class);
                    startActivity(Goc1);

                }
                if (position == 26){
                    Intent Goc1 = new Intent(Page2.this,P2n26.class);
                    startActivity(Goc1);

                }
                if (position == 27){
                    Intent Goc1 = new Intent(Page2.this,P2n27.class);
                    startActivity(Goc1);

                }
                if (position == 28){
                    Intent Goc1 = new Intent(Page2.this,P2n28.class);
                    startActivity(Goc1);

                }
                if (position == 29){
                    Intent Goc1 = new Intent(Page2.this,P2n29.class);
                    startActivity(Goc1);

                }
                if (position == 30){
                    Intent Goc1 = new Intent(Page2.this,P2n30.class);
                    startActivity(Goc1);

                }
                if (position == 31){
                    Intent Goc1 = new Intent(Page2.this,P2n31.class);
                    startActivity(Goc1);

                }
                if (position == 32){
                    Intent Goc1 = new Intent(Page2.this,P2n32.class);
                    startActivity(Goc1);

                }
                if (position == 33){
                    Intent Goc1 = new Intent(Page2.this,P2n33.class);
                    startActivity(Goc1);

                }
                if (position == 34){
                    Intent Goc1 = new Intent(Page2.this,P2n34.class);
                    startActivity(Goc1);

                }
                if (position == 35){
                    Intent Goc1 = new Intent(Page2.this,P2n35.class);
                    startActivity(Goc1);

                }
                if (position == 36){
                    Intent Goc1 = new Intent(Page2.this,P2n36.class);
                    startActivity(Goc1);

                }
                if (position == 37){
                    Intent Goc1 = new Intent(Page2.this,P2n37.class);
                    startActivity(Goc1);

                }
                if (position == 38){
                    Intent Goc1 = new Intent(Page2.this,P2n38.class);
                    startActivity(Goc1);

                }
                if (position == 39){
                    Intent Goc1 = new Intent(Page2.this,P2n39.class);
                    startActivity(Goc1);

                }
                if (position == 40){
                    Intent Goc1 = new Intent(Page2.this,P2n40.class);
                    startActivity(Goc1);

                }
                if (position == 41){
                    Intent Goc1 = new Intent(Page2.this,P2n41.class);
                    startActivity(Goc1);

                }
                if (position == 42){
                    Intent Goc1 = new Intent(Page2.this,P2n42.class);
                    startActivity(Goc1);

                }
                if (position == 43){
                    Intent Goc1 = new Intent(Page2.this,P2n43.class);
                    startActivity(Goc1);

                }
                if (position == 44){
                    Intent Goc1 = new Intent(Page2.this,P2n44.class);
                    startActivity(Goc1);

                }
                if (position == 45){
                    Intent Goc1 = new Intent(Page2.this,P2n45.class);
                    startActivity(Goc1);

                }
                if (position == 46){
                    Intent Goc1 = new Intent(Page2.this,P2n46.class);
                    startActivity(Goc1);

                }
                if (position == 47){
                    Intent Goc1 = new Intent(Page2.this,P2n47.class);
                    startActivity(Goc1);

                }
                if (position == 48){
                    Intent Goc1 = new Intent(Page2.this,P2n48.class);
                    startActivity(Goc1);

                }
                if (position == 49){
                    Intent Goc1 = new Intent(Page2.this,P2n49.class);
                    startActivity(Goc1);

                }
                if (position == 50){
                    Intent Goc1 = new Intent(Page2.this,P2n50.class);
                    startActivity(Goc1);

                }
                if (position == 51){
                    Intent Goc1 = new Intent(Page2.this,P2n51.class);
                    startActivity(Goc1);

                }



            }

        });



    }
}
