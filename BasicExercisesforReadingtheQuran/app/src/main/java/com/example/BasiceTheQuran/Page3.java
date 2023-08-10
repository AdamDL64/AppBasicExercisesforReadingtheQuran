package com.example.BasiceTheQuran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Page3 extends AppCompatActivity {
    ListView p3List;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    EditText p3Etext5;
    String[] arabword={"    أَرْنَبٌ    <กระต่าย  <อัร-น่า-บุน      ",
            "   فِيْلٌ   <ช้าง   <ฟี-ลุน",
            "   وَاحِد  <หนึ่ง < วา-หิ-ดุน  ",
            "   اِثْنَانِ  <สอง    < อิซ-นา-นี่  ",
            "   ثَلاَثَةٌ      <สาม    <ซ่า-ลา-ซ่า-ตุน",
            "   أَرْبَعَةٌ     <สี < อัร-บะ-อะ-ตุน",
            "   سِتَّةٌ    <หก    < ซิก-ต้า-ตุน",

            "   سَبْعَةٌ   <เจ็ด   < ซับ-อ้า-ตุน",
            "   ثَمَانِيَةٌ    <แปด    < ซ่า-มา-นี-ยะ-ตุน",
            "   تِسْعَةٌ   <เก้า    <ติส-อะ-ตุน",
            "   عَشَرَةٌ   <สิบ     <อ้า-ช่า-ร่อ-ตุน",
            "   أَبٌ   <พ่อ  < อ้า-บุน",
            "   أُمٌّ  <แม่    <อุม-มุน",
            "   مَرَحَبًا   <สวัสดี  <มารฮา-บำ   ",
            "   كِتَابٌ  <หนังสือ   < กี้-ตา-บุน",
            "   قَلَمٌ  <สมุด    <ก้อ-ล่า-มุน ",
            "   قَلَمٌ <ปากกา   <ก้อ-ล่า-มุน    ",
            "   قَلَمُ رَصَاصٍ   <ดินสอ <ก้อ-ล่า-มู่ ร่อ-ศอ-ศิน  ",
            "   مِسْطَرَةٌ     <ไม้บรรทัด  < มิซ-ฏ้อ-ร่อ-ตุน",
            "   مِمْحَاةٌ     <ยางลบ   < มิม-หา-ตุน ",
            "   حِبْرٌ     <น้ำหมึก    < หิบ-รุน",
            "   مَكْتَبٌ   <โต๊ะ    <มัก-ต้า-บุน ",
            "   كُرْسِيٌّ     <เก้าอี้      < กุร-ซี-ยุน ",
            "   حَقِيْبَةٌ    <กระเป๋า      < ห้า-กี-บ้า-ตุน ",
            "   مُدَرِّسٌ     <ครู      < มู่-ดัร-รี่-ซุน ",
            "   طَالِبٌ        <นักเรียก   < ฏอ-ลี่-บุน ",
            "   مَدْرَسَةٌ     <โรงเรียน   < มัด-ร่อ-ซ่า-ตุน ",
            "   سَاخِنٌ      <ร้อน    <ซา-คี่-นุน ",
            "   جَدِيْدٌ      <ใหม่     < จ้า-ดี-ดุน ",
            "   قَدِيْمٌ     < เก่า     < ก้อ-ดี-มุน ",
            "   خَفِيْفٌ       <เบา  < ค่อ-ฟี-ฟุน    ",
            "   ثَقِيْلٌ   <หนัก    <ซ่า-กี-ลุน ",
            "   عِنَبٌ     <องุ่น   <อี้-น่า-บุน ",
            "   تُفَّاحٌ      < แอปเปิ้ล   < ตุฟ-ฟา-หุน ",
            "   مَوْزٌ     <กล้วย   <เมา-ซุน ",
            "   تَمْرٌ   < อินทผลัมแห้ง      <ตัม-รุน ",
            "   فَرَاوَلَةُ   <สตอเบอรี่     <ฟ่า-รอ-ว่า-ล่า-ตู้ ",
            "   جَمَلٌ    <อูฐ  < จ้า-ม่า-ลุน",
            "   بَقَرَةٌ  <วัว   <บ้า-ก้อ-ร่อ-ตุน ",
            "   قِطٌّ     <แมว     < กิต-ตุน ",
            "   قَمِيْصٌ     < เสื้อ     <ก้อ-มี-ศุน ",
            "   فُسْتَانٌ     <ชุดคลุม      <ฟุซ-ตา-นุน ",
            "   جَوْرَبٌ      <ถุงเท้า      <เจา-ร่อ-บุน ",
            "   حِذَاءٌ       <รองเท้า      <หี้-ซา-อุน ",
            "   حِزَامٌ      < เข็มขัด    < หี้-ซา-มุน ",
            "بَيْتٌ    <บ้าน     <บัย-ตุน ",
            "   مَسْجِدٌ      <มัสยิด       <มัซ-จี้-ดุน ",
            "   مَسْكَنٌ      <หอพัก        <มัส-กะ-นุน ",
            "سُوْقٌ    <ตลาด    < ซู-กุน ",
            "   مَصْنَعٌ       <โรงงาน     <มัศ-น่า-อุน ",
            "   مَطَارٌ        <สนามบิน    <ม่า-ฏอ-รุน ",



            "  غَزَالٌ  < กวาง  < ฆ่อ-ซา-ลุน    "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        p3List = (ListView)findViewById(R.id.listp3);
        p3Etext5     = (EditText) findViewById(R.id.edittestP3);
        initList1();

        p3Etext5.addTextChangedListener(new TextWatcher() {
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
        adapter = new ArrayAdapter<String>(this,R.layout.layoutlistp3v1,R.id.textoutp3v1,listItems);
        p3List.setAdapter(adapter);
    }

}
