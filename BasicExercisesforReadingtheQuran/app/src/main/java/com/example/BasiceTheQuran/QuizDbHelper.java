package com.example.BasiceTheQuran;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.BasiceTheQuran.QuizContract.QuestionsTable;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 7;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("ภาษาอาหรับ มีพยัญชนะ 29 ตัว?",
                "A.2", "B.26", "C.29","D.32", 3, Question.DIFFICULTY_EASY);
        addQuestion(q1);


        Question q2 = new Question("วิธีการอ่านภาษาอาหรับให้ถูกต้องควรอ่านอย่างไร? ",
                "A.อ่านจากซ้ายไปชวา", "B.อ่านจากสระก่อนเสมอ", "C.านจากขวาไปซ้าย","D.อ่านตัวสุดท้ายที่มีตัวยา ", 3, Question.DIFFICULTY_EASY);
        addQuestion(q2);

        Question q3 = new Question("พยัญชนะภาษาอาหรับเขียนตัวติดกันเป็นส่วนใหญ่ และมักจะเขียนเพียงบางส่วนของพยัญชนะ ผู้เรียนจึงควรจดจำลักษณะเด่นของแต่ละพยัญชนะให้แม่นยำ ب كت ตัวอักษรที่อยู่ตรงกลางคืนตัวอักษรตัวใด ",
                "A.ا", "B.ب", "C.ك","D. ل", 3, Question.DIFFICULTY_EASY);
        addQuestion(q3);

        Question q4 = new Question("พยัญชนะภาษาอาหรับเขียนตัวติดกันเป็นส่วนใหญ่ และมักจะเขียนเพียงบางส่วนของพยัญชนะ ผู้เรียนจึงควรจดจำลักษณะเด่นของแต่ละพยัญชนะให้แม่นยำ يقف ตัวอักษรที่อยู่ตรงตัวแรกคืนตัวอักษรตัวใด ",
                "A.ي", "B.ب", "C.ك","D.ل", 3, Question.DIFFICULTY_EASY);
        addQuestion(q4);

        Question q5 = new Question("พยัญชนะภาษาอาหรับเขียนตัวติดกันเป็นส่วนใหญ่ และมักจะเขียนเพียงบางส่วนของพยัญชนะ ผู้เรียนจึงควรจดจำลักษณะเด่นของแต่ละพยัญชนะให้แม่นยำ جي بตัวอักษรที่อยู่ตรงตัวสุดท้ายคืนตัวอักษรตัวใด ",
                "A.ي", "B.ب", "C.ك","D.ل", 2, Question.DIFFICULTY_EASY);
        addQuestion(q5);

        Question q6 = new Question("พยัญชนะภาษาอาหรับเขียนตัวติดกันเป็นส่วนใหญ่ และมักจะเขียนเพียงบางส่วนของพยัญชนะ ผู้เรียนจึงควรจดจำลักษณะเด่นของแต่ละลักษณะต่างๆของอักษร ة ข้อใด? ",
                "A.ي", "B.ت", "C.ك","D.ل", 2, Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question("เวลาเขียนให้ไม่ติดกันตรงข้อใด? حَفِ ظ",
                "A. خَ لَ", "B.خَ بُ ثَ", "C.ذُ بِ حَ","D.حَ فِ ظَ", 4, Question.DIFFICULTY_EASY);
        addQuestion(q7);

        Question q8 = new Question("طَبَعَเวลาเขียนให้ไม่ติดกันตรงข้อใด",
                "A.طَ بَ ع", "B.خَ بُ ثَ", "C.ذُ بِ حَ","D. حَ فِ ظَ", 1, Question.DIFFICULTY_EASY);
        addQuestion(q8);

        Question q9 = new Question("لَفَسَدَ ت เวลาเขียนให้ไม่ติดกันตรงข้อใด",
                "A.لَ فَ سَ دَتِ", "B.أ ز فَ تِ", "C.أ عِ ظُ ك","D.أ خَ ذَ تِ", 1, Question.DIFFICULTY_EASY);
        addQuestion(q9);

        Question q10 = new Question( "พตัวอักษรแรกของภาษาอาหรับอ่านว่าอะไร",
                "A. อะลิฟ", "B.บา", "C.ตา","D.ยา", 1, Question.DIFFICULTY_EASY);
        addQuestion(q10);
        //


        Question q20 = new Question("ตัวใดที่คือตัวที่สะกดด้วยสระฟัตหะฮ์",
                "A. رَا", "B.رِى", "C.رُو","D.رّا", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q20);

        Question q21 = new Question("ตัวใดที่คือสระกัสเราะฮ์",
                "A. رَا", "B.رِى", "C.ตา","D.رّا", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q21);

        Question q22 = new Question("อ่านว่าوَءَاوَ ينَ هُمَا",
                "A. อะลิฟ", "B.บา", "C.رُو","D.ยา", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q22);

        Question q23 = new Question("حَ فِظَ ت เวลาเขียนให้ไม่ติดกันตรงข้อใด",
                "A.. حَ فِ ظَ ت", "B.عُ نُ قِ هِۦ", "C.بِ بَ لِ غِ هِ\t","D.خِ تَ مُ هُۥ", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q23);

        Question q24 = new Question("بِفَ حِشَة เวลาเขียนให้ไม่ติดกันตรงข้อใด",
                "A.بِ فَ حِ شَ ة", "B.فَ مَ ثَ لُ هُۥ", "C. لِ صَ حِ بِ هِ","D.لِ عِ بَ دَ تِ هِ", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q24);

        Question q25 = new Question("مُ سفِحَ ت เวลาเขียนให้ไม่ติดกันตรงข้อใด ",
                "A.مُ سَ فِ حَ ت", "B.سَ نَ س مُ هُۥ\t", "C.يَ تَ وَ رَ ى","D.ه دَ ى\t", 1, Question.DIFFICULTY_MEDIUM);
        addQuestion(q25);

        Question q26 = new Question("سَنَسِمُهۥُ  อ่านว่า ",
                "A.ยะ ตะ วา รอ", "B.มุ สา ฟิ หา ติน", "C.ฮะ ดา","D.สะ นะ สิ มุ ฮู", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q26);

        Question q27 = new Question("بِفَ حِشَة  อ่านว่า ",
                "A.ยะ ตะ วา รอ", "B.บิ ฟา หิ ชะ ติน", "C.ฮะ ดา","D.สะ นะ สิ มุ ฮู", 2, Question.DIFFICULTY_MEDIUM);
        addQuestion(q27);

        Question q28 = new Question("مُ سفِحَ ت  อ่านว่า ",
                "A.ยะ ตะ วา รอ", "B.บิ ฟา หิ ชะ ติน", "C.สะ นะ สิ มุ ฮู","D.มุ สา ฟิ หา ติน", 3, Question.DIFFICULTY_MEDIUM);
        addQuestion(q28);

        Question q29 = new Question("لِصَ حِبِهِۦ  อ่านว่า",
                "A.ยะ ตะ วา รอ", "B.บิ ฟา หิ ชะ ติน", "C.มุ สา ฟิ หา ติน","D.ลิ ศอ หิ บิ ฮี", 4, Question.DIFFICULTY_MEDIUM);
        addQuestion(q29);




        //

        Question q30 = new Question("وَءَاوَ ينَ هُمَاอ่านว่า",
                "A.วะ อา วัย นา ฮุ มา", "เตา กี ดิ ฮา", "C.เยา มัย นิ\t","D.เยา มิ อิ ซิน", 1, Question.DIFFICULTY_HARD);
        addQuestion(q30);

        Question q31 = new Question("يَ ومَ ي  อ่านว่า",
                "A.วะ อา วัย นา ฮุ มา\t", "B.เฟะ กัย ฟะ", "C.เยา มัย นิ","D.เยา มิ อิ ซิน", 3, Question.DIFFICULTY_HARD);
        addQuestion(q31);

        Question q32 = new Question("فَكَ يفَ  อ่านว่า",
                "A.ฟะ กัย ฟะ", "B.เยา มัย นิ\t", "C.เยา มิ อิ ซิน","D.เยา มิ อิ ซิน", 1, Question.DIFFICULTY_HARD);
        addQuestion(q32);

        Question q33 = new Question("เตา กี ดิ ฮา อ่านตรงกับข้อใด?",
                "A.  تَ وكِيدِهَا", "B.صَ يحَةٗ", "C.وَءَاوَ ينَ هُمَا","D.يَ ومِئِ ذ", 1, Question.DIFFICULTY_HARD);
        addQuestion(q33);

        Question q34 = new Question("ยสะลามุน อะลา มูซา วะฮารูนะ อ่านตรงกับข้อใด",
                "A.وَفَ كِهَة كَ ث يرَة", "B. فَذُوقُوا عَذَابِ وَنُذُرِ", "C.وَلَا صَدِي ق حَمِي م","D.سَلَ م عَل مُو س وَهَ رُونَ", 4, Question.DIFFICULTY_HARD);
        addQuestion(q34);

        Question q35 = new Question("ยวะลา เศาะดีกิน หะมีมิน  อ่านตรงกับข้อใด",
                "A. سَلَ م عَل مُو س وَهَ رُونَ", "B.فَذُوقُوا عَذَابِ وَنُذُرِ\t", "C.وَفَ كِهَة كَ ث يرَة","D.وَلَا صَدِي ق حَمِي م", 4, Question.DIFFICULTY_HARD);
        addQuestion(q35);

        Question q36 = new Question("ข้อ  วะลา เศาะดีกิน หะมีมิน  อ่านตรงกับข้อใด",
                "A.سَلَ م عَل مُو س وَهَ رُونَ", "B.وَلَا صَدِي ق حَمِي م", "C.فَذُوقُوا عَذَابِ وَنُذُرِา","D. وَفَ كِهَة كَ ث يرَة", 2, Question.DIFFICULTY_HARD);
        addQuestion(q36);

        Question q37 = new Question("ยوَبِكُ فرِهِ م وَقَ ولِهِ م عَل مَ ريَمَ بُ هتَ نا عَظِيمٗ ا อ่านตรงกับข้อใด",
                "A. วะบิกุฟริฮิม วะเกฺอ์าลิฮิม อฺะลา มัรยะมะ บุฮ์ตานัน อฺะซฺีมัน", "B.วะฮุวัล กฺอฮิรุ เฟาเกฺาะ อฺิบาดิฮี  วะฮุวัล หะกีมุล เคาะบีรุ\t", "C.กฺอละ ฟีฮา ตะห์เยานะ วะฟีฮา ตะมูตูนะ วะมินฮา ตุคเราะญูนะ","D.ยา", 1, Question.DIFFICULTY_HARD);
        addQuestion(q37);

        Question q38 = new Question("ยัญชนะภาษาอาหรับเขียนตัวติดกันเป็นส่วนใหญ่ และมักจะเขียนเพียงบางส่วนของพยัญชนะ ผู้เรียนจึงควรจดจำลักษณะเด่นของแต่ละพยัญชนะให้แม่นยำ جي بตัวอักษรที่อยู่ตรงตัวสุดท้ายคืนตัวอักษรตัวใด",
                "วะบิกุฟริฮิม วะเกฺอ์าลิฮิม อฺะลา มัรยะมะ บุฮ์ตานัน อฺะซฺีมัน", "B.บวะฮุวัล กฺอฮิรุ เฟาเกฺาะ อฺิบาดิฮี  วะฮุวัล หะกีมุล เคาะบีรุ", "C.กฺอละ ฟีฮา ตะห์เยานะ วะฟีฮา ตะมูตูนะ วะมินฮา ตุคเราะญูนะ","D.กกฺอลู อัรญิฮ์ วะอะคอฮุ วะอัรสิล ฟิล มะดาอินิ หาชิรีนะ", 2, Question.DIFFICULTY_HARD);
        addQuestion(q38);

        Question q39 = new Question("อ่านว่า قَالَ فِيهَا تََ يَ ونَ وَفِيهَا تَمُوتُونَ وَمِ نهَا تُ رَجُونَ ",
                "A.วะบิกุฟริฮิม วะเกฺอ์าลิฮิม อฺะลา มัรยะมะ บุฮ์ตานัน อฺะซฺีมัน", "B.วะฮุวัล กฺอฮิรุ เฟาเกฺาะ อฺิบาดิฮี  วะฮุวัล หะกีมุล เคาะบีรุ", "C.กฺอละ ฟีฮา ตะห์เยานะ วะฟีฮา ตะมูตูนะ วะมินฮา ตุคเราะญูนะ","D.. กฺอลู อัรญิฮ์ วะอะคอฮุ วะอัรสิล ฟิล มะดาอินิ หาชิรีนะ", 3, Question.DIFFICULTY_HARD);
        addQuestion(q39);






    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}