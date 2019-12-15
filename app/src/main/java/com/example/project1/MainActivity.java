package com.example.project1;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.view.menu.MenuView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project1.fmDay.fmMonday;
import com.example.project1.reg_api_cmr30.RegInfoCMR30Items;
import com.example.project1.reg_api_current_enrollment.RegInfoEnrollmentItems;
import com.example.project1.reg_api_home.RegInfoHomeDAO;
import com.example.project1.reg_api_home.RegInfoHomeItems;
import com.example.project1.reg_api_home.RetrofitReginfo;
import com.example.project1.reg_api_student.RegInfoStudentItems;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.opencensus.trace.MessageEvent;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.example.project1.curr2_class;

import static com.google.common.base.Strings.isNullOrEmpty;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;

    // send data btw activity and fmcir
    private fmCirriculum myfm;
    private fmCurriculum2 myfm2;
    int dataCheckbond=0;
    curr2_class Curr2_class = new curr2_class();

    ArrayList<String> temp1 = new ArrayList<String>();
    ArrayList<String> temp2 = new ArrayList<String>();

    public void doSomethingByFragment(int data){
        dataCheckbond = data;
        Log.d("doSomeByFragment", ""+dataCheckbond);
    }

    int dataChecklv=1;

    public void doByFragment(int data){
        dataChecklv = data;
        Log.d("doByFragment", ""+dataChecklv);
    }

    public void doByFragment2(ArrayList<String> tempCollectCourse, ArrayList<String> tempCollectCourseNP){

        Log.d("doByFragment2", ""+tempCollectCourse.size());
        Log.d("doByFragment2_1", ""+tempCollectCourseNP.size());
        temp1 = tempCollectCourse;
        temp2 = tempCollectCourseNP;

    }



    //
    //Fragment fm = new fmHome();
    //    //FragmentTransaction ft;

    //define variable
    //loop callapihome max =3
    int checkHome=0;
    //



    //ส่งค่าให้ fmprofile
    String Mis_st_id;
    String Mis_st_prenameth;
    String Mis_st_nameth;
    String Mis_st_lnameth;
    String Mis_cmu_account;
    String Mis_faculty;

    // ค่าจาก student{id}
    // ส่งไป fmprofile && ใช้กับ fmcirri

    public String Major_id;
    public String Curriculum_id;
    public  String Major_name_th;
    public String Level_name_th;
    public String Adviser_name;
    public String Adviser_cmu_account;

    //

    //get api GET /student/{id}/gpa
    String student_gpa_acad_id;
    String student_gpa_ID;
    String student_gpa_TRM;
    String student_gpa_COURSENO;
    String student_gpa_TITLE;
    String student_gpa_CREDIT;
    String student_gpa_GRADE;
    //defien variable of fmHome
    double SumGet_credit;
    double SumEnrolled_credit;
    double SumGradepoint;
    double SumCreditCal;
    int Mcount;
    double SumMGradepoint;
    double SumMCreditCal;
    //ค่าที่ส่งไป fmHome
    public Double Gpax = 0.00;
    public Double Mgpax = 0.00;
    public Double Getcredit = 0.00;
    public String MinimumCredit = "999";
    public Double c_credit = 0.00;

    //ส่งค่าไปคำนวณเกรด major ด้วย
    //calculate and output
    public ArrayList<String> Enrolled = new ArrayList<String>();
    public ArrayList<String> EnrolledGrade = new ArrayList<String>();
    //majorcode เก็บไว้แล้ว
    public ArrayList<String> MajorCode = new ArrayList<String>();
    public ArrayList<String> MajorCredit = new ArrayList<String>();




    //
    //timetable





    //new -------
    //fmcirricuum map ใช้ แสดงผล enrollent ทั้งหมดจาก firebase
    //แบ่งเป็นแต่ละ year semester


    //---------

    //ค่าส่งไป fmCirriculumMap
    // ส่งค่า course Mcourseจาก year semester db ไป fmcir
    //public List<String> CollectCourse = new ArrayList<String>();
    //CollectCourse คือคอร์สที่ลงและผ่าน ไม่ติด F W U P
    private ArrayList<String> CollectCourse = new ArrayList<String>();

    private ArrayList<String> CollectCoursetemp = new ArrayList<String>();

    //ไม่ผ่าน
    private ArrayList<String> CollectCourseNotPass = new ArrayList<String>();

    private ArrayList<String> CollectCourseNotPasstemp = new ArrayList<String>();

    //c year c semester
    public ArrayList<String> Cyear = new ArrayList<String>();
    public ArrayList<String> Csemester = new ArrayList<String>();

    //Mc year MC semester
    public ArrayList<String> MCyear = new ArrayList<String>();
    public ArrayList<String> MCsemester = new ArrayList<String>();


    //new-------
    //fmCirriculum ใช้แสดงเทอมล่าสุด (ปัจจุบัน)
    //แสดงข้อมูล course , prerequisite , assistant float

    //check current enrollment ที่ลงทะเบียนล่าสุด
    public String currentYear;
    public String currentSemester;


    //---------
    //ค่าส่งไป fmCirriculum
    // ดึงข้อมูลมาจาก enrollment กับ cmr30
    //สามารถเขียนเพิ่มเพื่อถึง room, time ต่อยอดเป็น timetable ได้
    public ArrayList<String> CourseNoListtemp = new ArrayList<String>();
    public ArrayList<String> CourseNoList = new ArrayList<String>();
    public ArrayList<String> CourseTitleList = new ArrayList<String>();
    public ArrayList<String> CreLecList = new ArrayList<String>();
    public ArrayList<String> CreLabList = new ArrayList<String>();

    //เก็บค่า prerequisite course of  ก่อนส่งไป fmcirriculum
    //206161 is prerequisite of 206162
    public ArrayList<String> PrerequisiteCode = new ArrayList<String>();
    public ArrayList<String> PrerequisiteName = new ArrayList<String>();



    //เก็บค่าจาก firebase db มาให้หมด
    public ArrayList<String> CourseCcode = new ArrayList<String>();
    public ArrayList<String> CourseCname = new ArrayList<String>();

    public ArrayList<String> PrerequisiteCourse = new ArrayList<String>();

    public ArrayList<String> MajorCourseCcode = new ArrayList<String>();
    public ArrayList<String> MajorCourseCname = new ArrayList<String>();

    public ArrayList<String>  PrerequisiteMajorCourse = new ArrayList<String>();

    //public CMR30ID ไว้ใส่เป็น ID ในการหาข้อมูลใน cmr30
    //ใช้กับ fmcirri
    public ArrayList<String> CMR30ID = new ArrayList<String>();



    //ค่าส่งค่าไป time table
    public ArrayList<String> DAYLEC_1 = new ArrayList<String>();
    public ArrayList<String> BTLEC_1 = new ArrayList<String>();
    public ArrayList<String> FTLEC_1 = new ArrayList<String>();
    public ArrayList<String> ROOM = new ArrayList<String>();

    public ArrayList<String> DAYLEC_2 = new ArrayList<String>();
    public ArrayList<String> BTLEC_2 = new ArrayList<String>();
    public ArrayList<String> FTLEC_2 = new ArrayList<String>();

    //
    //define DAO variable
    //private RegInfoHomeItems regInfoHomeItems;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //send data btw activity and fmcir

        myfm = new fmCirriculum();
        /*FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.maincontent, myfm);
        transaction.commit();*/






        //


        Log.d("below", "To main");
        setContentView(R.layout.activity_main);

        //get intent from receiveMainActivity
        Mis_st_id = getIntent().getExtras().getString("st_id");
        Mis_st_prenameth = getIntent().getExtras().getString("st_prenameth");
        Mis_st_nameth = getIntent().getExtras().getString("st_nameth");
        Mis_st_lnameth = getIntent().getExtras().getString("st_lnameth");
        Mis_cmu_account = getIntent().getExtras().getString("cmu_account");
        Mis_faculty = getIntent().getExtras().getString("faculty");

        Toast.makeText(getApplicationContext()
                , "id ="+Mis_st_id+"\n"+Mis_st_prenameth+" "+Mis_st_nameth+" "+Mis_st_lnameth


                ,Toast.LENGTH_LONG).show();





        //callStudentInfo(Mis_st_id);


        //callApiCurrentEnrollment();








        //callApiHome();
        int i=0;


        do{


            callStudentInfo(Mis_st_id);


            callApiCurrentEnrollment();

            callApiHome();

            i++;





        }while ( CourseNoList.size() != 0 && PrerequisiteCourse.size() != 0 && PrerequisiteMajorCourse.size() != 0 );

        //while (CourseNoList.size() != 0 && PrerequisiteCourse.size() != 0 && PrerequisiteMajorCourse.size() != 0 && i < 3)





        Log.d("maincall",""+Gpax);











        //callFirebaseDb();
        //move in callStidentInfo if getmajor id and curriculum id



        //

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //to call api cmr30 for title, courseno, room, time, credit, section
        //callApiCMR30();



    }


    //


    //




    //call reg api for fmhome
    private void callApiHome() {


        //code
        Log.d("acc", "To call");



            Call<List<RegInfoHomeItems>> listCall = RetrofitReginfo.getInstance().getApi().GetRegGpa(Mis_st_id);


            listCall.enqueue(new Callback<List<RegInfoHomeItems>>() {
                @Override
                public void onResponse(Call<List<RegInfoHomeItems>> call, Response<List<RegInfoHomeItems>> response) {
                    Log.d("badnew", "onResponse");

                    checkHome = 4;
                    Log.d("badnew_1", " " + checkHome);
                    if (response.isSuccessful()) {


                        List<RegInfoHomeItems> itemsList = response.body();

                        //ทำเงื่อนไข check major อีกทีตรงนี้

                    /*for(int i=0;i<itemsList.size();i++){
                        RegInfoHomeItems items = itemsList.get(i);

                        //collect course เก็บ course ที่เคยลงทะเบียน
                        //code ก่อนหน้า
                        //CollectCourse.add(items.getCOURSENO());
                        //Log.d("collectcourse", CollectCourse.get(i));


                        //getCalculategpaISNE(items);
                        //Log.d("new", "acad_id = "+items.getAcad_id());










                    }*/

                        //new api

                        if(itemsList != null) {


                            if (itemsList.size() != 0) {


                                RegInfoHomeItems items = itemsList.get(itemsList.size() - 1);
                                Gpax = Double.parseDouble(items.getGpa_grad());
                                Getcredit = Double.parseDouble(items.getE_credit());
                                //Mgpax เปลี่ยนเป็น หน่วยกิตที่เคยลงแทนเพราะ api ใหม่ไม่สามารถคำนวณเมเจอร์เกรดได้
                                Mgpax = Double.parseDouble(items.getA_credit());
                                c_credit = Double.parseDouble(items.getC_credit());

                                Log.d("new2", "GPAX is " + Gpax);
                                Log.d("new3", "Get credit is " + Getcredit);
                                //Log.d("new4", "Enrolled credit is "+SumEnrolled_credit);
                                Log.d("new5", "MGPAX is " + Mgpax);

                            }


                        }






                        //Log.d("new6", "MCreditCal is "+SumMCreditCal);

                   /* FragmentManager manager = getSupportFragmentManager();
                    FragmentTransaction ft;
                    ft = manager.beginTransaction();

                    Fragment fm = null;*/
                    /*if(fm != null){
                        ft = getSupportFragmentManager().beginTransaction();

                        //

                        //


                        ft.replace(R.id.maincontent, fm);
                        ft.commit();
                        //TextView tv1 = (TextView) findViewById(R.id.textView10);
                        //tv1.setText(strTitle);

                        toolbar.setTitle(strTitle);



                    }*/

                        //test onstart



                       /* FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction ft;
                        ft = manager.beginTransaction();

                        Fragment fm = new fmHome();


                        if (fm != null) {
                            Log.d("fm", "fm=null");
                            Bundle bundle2 = new Bundle();

                            bundle2.putString("key_Mis_st_id", Mis_st_id);
                            bundle2.putDouble("key_Gpax", Gpax);
                            bundle2.putDouble("key_Mgpax", Mgpax);
                            bundle2.putDouble("key_Getcredit", Getcredit);
                            bundle2.putString("key_MinimumCredit", MinimumCredit);




                            fm.setArguments(bundle2);


                            ft = getSupportFragmentManager().beginTransaction();

                            ft.replace(R.id.maincontent, fm);
                            ft.commit();
                        }
*/


                        //end test


                    }

                    Log.d("badnew2", "notResponse");
                }

                @Override
                public void onFailure(Call<List<RegInfoHomeItems>> call, Throwable t) {
                    Log.d("badnew3", "onFailure");
                    Toast.makeText(getApplicationContext(), "Can't connect to Registration CMU \nplease wait a munute", Toast.LENGTH_LONG).show();
                    callApiHome();
                    checkHome++;
                    Log.d("badnew3_1", " " + checkHome);


                }
            });






    }




    private void callApiCurrentEnrollment(){


        Call<List<RegInfoEnrollmentItems>> listCall2 = RetrofitReginfo.getInstance().getApi().GetRegCurrentEnrollment(Mis_st_id);

        listCall2.enqueue(new Callback<List<RegInfoEnrollmentItems>>() {
            @Override
            public void onResponse(Call<List<RegInfoEnrollmentItems>> call, Response<List<RegInfoEnrollmentItems>> response) {
                Log.d("callapienrollment1", "onResponsee");
                if(response.isSuccessful()){
                    Log.d("callapienrollment1_1", "onResponsee and successful");

                    List<RegInfoEnrollmentItems> itemsList = response.body();




                    if(itemsList != null){


                        if(itemsList.size() != 0){


                            for(int i=0; i<itemsList.size(); i++){
                                RegInfoEnrollmentItems items = itemsList.get(i);
                                //CourseNoList.add(items.getCOURSENO());
                                //CMR30ID.add(items.getCOURSENO()+items.getSECLEC()+items.getSECLAB());


                               //callApiCMR30(CMR30ID.get(i));

                               //Log.d("callapienrollment1_2", " course "+CourseNoList.get(i));



                                //new api
                                CMR30ID.add(items.getCOURSE_ID());

                                //collect course to curriMap
                                //CollectCourse.add(items.getCOURSENO());
                                //add CollectCourse and CollectCourseNotPass
                                collectCourse(items);
                                //เก็บที่ลงทะเบียนทั้งหมด



                                Enrolled.add(items.getCOURSENO());
                                EnrolledGrade.add(items.getGRADE());


                                //callApiCmr30

                                 //callApiCMR30(items.getCOURSE_ID());

                                //callApiCmr30 with current semester
                                if(i == itemsList.size()-1){

                                currentYear = items.getYEAR();
                                currentSemester = items.getSEMESTER();

                                }

                            }

                            Log.d("callapienrollment1_3", " course "+CourseNoList.size());

                            Log.d("callapienrollment1_4", " CMR30ID# "+CMR30ID.size());

                            Log.d("callapienrollment1_4_1", " currentYear# "+currentYear);

                            Log.d("callapienrollment1_4_2", " currentSemester# "+currentSemester);

                            Log.d("callapienrollment1_4_3", " colectcoursesize "+CollectCourse.size());

                            Log.d("callapienrollment1_4_31", " colectcoursesize "+CollectCourseNotPass.size());


                            if(CollectCourse != null && CollectCourseNotPass != null){
                                Log.d("callapienrollment1_4_4", " colectcoursesize "+CollectCourse.size());
                                Log.d("callapienrollment1_4_5", " colectcoursesize "+CollectCourseNotPass.size());
                                //Curr2_class.setCollectCourseClass(CollectCourse);
                                //Curr2_class.setCollectCourseNotPassClass(CollectCourseNotPass);


                            }




                            // collect current enrollment

                            for(int i=0; i<CMR30ID.size(); i++) {

                                Log.d("callapienrollment1_5", " i# " + i);
                                String iYear = CMR30ID.get(i).substring(0, 4);

                                String iSemester = CMR30ID.get(i).substring(4, 5);

                                Log.d("callapienrollment1_6", " iYear# " + iYear);


                                Log.d("callapienrollment1_7", " iSemester# " + iSemester);

                                if (iYear.equals(currentYear) && iSemester.equals(currentSemester)) {


                                    Log.d("callapienrollment1_8", " CMR30ID# " + CMR30ID.get(i));

                                    callApiCMR30(CMR30ID.get(i));

                                    Log.d("callapienrollment1_9", " course " + CourseNoList.size());

                                }
                            }



                        }



                    }




                }


            }

            @Override
            public void onFailure(Call<List<RegInfoEnrollmentItems>> call, Throwable t) {
                Log.d("callapienrollment2", "onFailure");
                Toast.makeText(getApplicationContext(), "Can't connect to enrollmenr CMU \nplease wait a munute", Toast.LENGTH_LONG).show();

                callApiCurrentEnrollment();
            }
        });



        Log.d("callapienrollment3_1", " course "+CourseNoList.size());
        Log.d("callapienrollment3_2", " CMR30ID# "+CMR30ID.size());







    }



    private void callApiCMR30(String cmr30id){

        Log.d("callapicmr30_", "access to callapicmr30");





        Log.d("callapicmr30loop", "for loop ");
        Log.d("callapicmr30loopS", " " + CMR30ID.size());


        Log.d("callapicmr30loopid", " " + cmr30id);

        Log.d("callapicmr30loopSize", " course "+CourseNoList.size());

            /*Call<List<RegInfoCMR30Items>> listCall = RetrofitReginfo.getInstance().getApi().GetRegCMRtest();
            listCall.enqueue(new Callback<List<RegInfoCMR30Items>>() {
                @Override
                public void onResponse(Call<List<RegInfoCMR30Items>> call, Response<List<RegInfoCMR30Items>> response) {
                    Log.d("callapicmr30_1", "onResponse");
                    if (response.isSuccessful()) {

                        Log.d("callapicmr30_1_1", "onResponse");

                        List<RegInfoCMR30Items> itemsList = response.body();

                        RegInfoCMR30Items items = itemsList.get(0);

                        CourseNoList.add(items.getCOURSENO());
                        CourseTitleList.add(items.getTITLE());
                        CreLecList.add(items.getCRELEC());
                        CreLabList.add(items.getCRELAB());

                        Log.d("CourseNoList", CourseNoList.get(0));
                        Log.d("CourseTitleList", CourseTitleList.get(0));
                        Log.d("CreLecList", CreLecList.get(0));
                        Log.d("CreLabList", CreLabList.get(0));


                    }

                }

                @Override
                public void onFailure(Call<List<RegInfoCMR30Items>> call, Throwable t) {

                    Log.d("callapicmr30_2", "onFailure");

                }
            });*/

            Call<RegInfoCMR30Items> listcall2 = RetrofitReginfo.getInstance().getApi().GetRegCMR30(cmr30id);
            listcall2.enqueue(new Callback<RegInfoCMR30Items>() {
                @Override
                public void onResponse(Call<RegInfoCMR30Items> call, Response<RegInfoCMR30Items> response) {
                    Log.d("callapicmrnew", "onResponse");
                    int i=0;
                    if (response.isSuccessful()){
                        Log.d("callapicmrnew2", "onResponse success");
                        RegInfoCMR30Items items = response.body();

                        CourseNoListtemp.add(items.getCOURSENO());
                        CourseNoList.add(items.getCOURSENO());
                        CourseTitleList.add(items.getTITLE());
                        CreLecList.add(items.getCRELEC());
                        CreLabList.add(items.getCRELAB());

                        //timetable
                        DAYLEC_1.add(items.getDAYLEC_1());
                        BTLEC_1.add(items.getBTLEC_1());
                        FTLEC_1.add(items.getFTLEC_1());
                        ROOM.add(items.getROOM());

                        DAYLEC_2.add(items.getDAYLEC_2());
                        BTLEC_2.add(items.getBTLEC_2());
                        FTLEC_2.add(items.getFTLEC_2());



                        Log.d("CourseNoList", ""+CourseNoList.get(i));
                        Log.d("CourseTitleList", ""+CourseTitleList.get(i));
                        Log.d("CreLecList", ""+CreLecList.get(i));
                        Log.d("CreLabList", ""+CreLabList.get(i));

                        Log.d("callapicmr30loopSize2", " course "+CourseNoList.size());





                    }
                }

                @Override
                public void onFailure(Call<RegInfoCMR30Items> call, Throwable t) {
                    Log.d("callapicmrbad", "onfail");
                    Toast.makeText(getApplicationContext(), "Can't connect to CMR30 CMU \nplease wait a munute", Toast.LENGTH_LONG).show();


                }
            });







    }


    private void callStudentInfo(final String Mis_st_id){
        Log.d("callStudentInfo_1", "begin");
        Log.d("callStudentInfo_1_2", "Mis_st_id :"+Mis_st_id );

        Call<RegInfoStudentItems> regInfoStudentItemsCall = RetrofitReginfo.getInstance().getApi().GetRegStudent(Mis_st_id);
        regInfoStudentItemsCall.enqueue(new Callback<RegInfoStudentItems>() {
            @Override
            public void onResponse(Call<RegInfoStudentItems> call, Response<RegInfoStudentItems> response) {

                Log.d("callStudentInfo_1_3", "onResponse");

                if(response.isSuccessful()){
                    Log.d("callStudentInfo_2", "onSuccess");

                    RegInfoStudentItems items = response.body();

                    Major_id = items.getMajor_id();
                    Curriculum_id = items.getCurriculum_id();
                    Major_name_th = items.getMajor_name_th();
                    Level_name_th = items.getLevel_name_th();
                    Adviser_name = items.getAdviser_name();
                    Adviser_cmu_account = items.getAdviser_cmu_account();

                    Log.d("callStudentInfo_3", "Majorid :"+Major_id);

                    if(Major_id != null){

                        callFirebaseDb();

                    }










                }





            }

            @Override
            public void onFailure(Call<RegInfoStudentItems> call, Throwable t) {

                Log.d("callStudentInfo_error", "onfail");

                callStudentInfo(Mis_st_id);


            }
        });





    }


    //ไว้ call ตัว prerequisite string ของ course กับ Mcourse
    public void callFirebaseDb(){

        Log.d("callfirebase,", "getIn");

        //major = 10 ISNE
        //major = 08 CPE

        final String Major;
        final String MajorYear;

        /*if(Major_id.equals("10") && Curriculum_id.equals("0001")){
            Major = "ISNE";
            MajorYear = "ISNE55";
            MinimumCredit = "143";


        }
        else if(Major_id.equals("10") && Curriculum_id.equals("0002")){
            Major = "ISNE";
            MajorYear = "ISNE61";
            MinimumCredit = "143";


        }
        else if(Major_id.equals("08") && Curriculum_id.equals("0002")){
            Major = "CPE";
            MajorYear = "CPE58";
            MinimumCredit = "139";


        }
        else{
            Major = "ISNE";
            MajorYear = "ISNE55";
            //MinimumCredit = "143";
        }*/

        if(Major_id.equals("01")){
            Major = "CE";
        }
        else if(Major_id.equals("02")){
            Major = "EE";
        }
        else if(Major_id.equals("03")){
            Major = "ENVI";
        }
        else if(Major_id.equals("04")){
            Major = "IE";
        }
        else if(Major_id.equals("05")){
            Major = "ME";
        }
        else if(Major_id.equals("06")){
            Major = "MI";
        }
        else if(Major_id.equals("08")){
            Major = "CPE";
        }
        else if(Major_id.equals("10")){
            Major = "ISNE";
        }
        else{
            Major = "ISNE";
        }


        Log.d("callfirebase_2", "Major :"+Major);



        final DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();

        final DatabaseReference mYearRootRef = mRootRef.child(Major);

        //final DatabaseReference mYearRef = mRootRef.child(Major+"/"+MajorYear);
        //final DatabaseReference mCourseRef = mYearRef.child("Course");
        //final DatabaseReference mMajorCourseRef = mYearRef.child("MajorCourse");

        //test
        //
        mYearRootRef.orderByKey().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot child : dataSnapshot.getChildren()){

                    Log.d("maincallDB", ""+child.getKey());
                    final DatabaseReference mYearRootRef = mRootRef.child(Major+"/"+child.getKey());
                    final String check = Major+"/"+child.getKey();
                    Log.d("maincallDB1_2", ""+Major+"/"+child.getKey());
                    DatabaseReference mYearRootRefInfo = mRootRef.child(Major+"/"+child.getKey()+"/Info");
                    Log.d("maincallDB2", ""+Major+"/"+child.getKey()+"/Info");
                    mYearRootRefInfo.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            for(DataSnapshot child : dataSnapshot.getChildren()){
                                Map map = (Map) child.getValue();

                                String year_key = dataSnapshot.getKey();
                                String curr_id = String.valueOf(map.get("Curriculumid"));
                                String minimum_cre = String.valueOf(map.get("Minimumcredit"));

                                Log.d("maincallDB3", ""+curr_id);
                                Log.d("maincallDB3_1", ""+year_key);

                                if(curr_id.equals(Curriculum_id) ){
                                    Log.d("maincallDB4", "Match!"+curr_id);
                                    Log.d("maincallDB41_1", "Match!"+minimum_cre);

                                    MinimumCredit = minimum_cre;

                                    Log.d("maincallDB4_1", ""+year_key);

                                    Log.d("maincallDB4_1", ""+check);

                                    DatabaseReference mCourseRef = mYearRootRef.child("Course");
                                    DatabaseReference mMajorCourseRef = mYearRootRef.child("MajorCourse");

                                    mCourseRef.addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                            Log.d("callfirebase_3", "getInSnapshot");
                                            for(DataSnapshot child : dataSnapshot.getChildren()){
                                                Map map = (Map) child.getValue();

                                                String prerequisite = String.valueOf(map.get("Cprerequisite"));
                                                String code = String.valueOf(map.get("Ccode"));
                                                String name = String.valueOf(map.get("Cname"));

                                                String year = String.valueOf(map.get("Cyear"));
                                                String semester = String.valueOf(map.get("Csemester"));


                                                PrerequisiteCourse.add(prerequisite);
                                                CourseCcode.add(code);
                                                CourseCname.add(name);

                                                Cyear.add(year);
                                                Csemester.add(semester);

                                            }

                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError databaseError) {

                                        }
                                    });


                                    mMajorCourseRef.addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                                            for(DataSnapshot child : dataSnapshot.getChildren()){


                                                Map map = (Map) child.getValue();

                                                String prerequisite = String.valueOf(map.get("Cprerequisite"));
                                                String code = String.valueOf(map.get("Ccode"));
                                                String name = String.valueOf(map.get("Cname"));
                                                String credit = String.valueOf(map.get("Ccredit"));

                                                String year = String.valueOf(map.get("Cyear"));
                                                String semester = String.valueOf(map.get("Csemester"));



                                                PrerequisiteMajorCourse.add(prerequisite);
                                                MajorCourseCcode.add(code);
                                                MajorCourseCname.add(name);
                                                MajorCredit.add(credit);

                                                MCyear.add(year);
                                                MCsemester.add(semester);





                                            }

                                            Log.d("callfirebase_7", "PrerequisiteMajorCourse : "+PrerequisiteMajorCourse.size());
                                            Log.d("callfirebase_8", "MajorCourseCcode : "+MajorCourseCcode.size());
                                            Log.d("callfirebase_9", "MajorCourseCname : "+MajorCourseCname.size());



                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError databaseError) {




                                        }
                                    });









                                    //implement code callfirebasedb here
                                }

                            }



                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });


                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




        //end test

        /*mCourseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d("callfirebase_3", "getInSnapshot");
                for(DataSnapshot child : dataSnapshot.getChildren()){
                    Map map = (Map) child.getValue();

                    String prerequisite = String.valueOf(map.get("Cprerequisite"));
                    String code = String.valueOf(map.get("Ccode"));
                    String name = String.valueOf(map.get("Cname"));

                    String year = String.valueOf(map.get("Cyear"));
                    String semester = String.valueOf(map.get("Csemester"));


                    PrerequisiteCourse.add(prerequisite);
                    CourseCcode.add(code);
                    CourseCname.add(name);

                    Cyear.add(year);
                    Csemester.add(semester);

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        mMajorCourseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot child : dataSnapshot.getChildren()){


                    Map map = (Map) child.getValue();

                    String prerequisite = String.valueOf(map.get("Cprerequisite"));
                    String code = String.valueOf(map.get("Ccode"));
                    String name = String.valueOf(map.get("Cname"));
                    String credit = String.valueOf(map.get("Ccredit"));

                    String year = String.valueOf(map.get("Cyear"));
                    String semester = String.valueOf(map.get("Csemester"));



                    PrerequisiteMajorCourse.add(prerequisite);
                    MajorCourseCcode.add(code);
                    MajorCourseCname.add(name);
                    MajorCredit.add(credit);

                    MCyear.add(year);
                    MCsemester.add(semester);





                }

                Log.d("callfirebase_7", "PrerequisiteMajorCourse : "+PrerequisiteMajorCourse.size());
                Log.d("callfirebase_8", "MajorCourseCcode : "+MajorCourseCcode.size());
                Log.d("callfirebase_9", "MajorCourseCname : "+MajorCourseCname.size());



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {




            }
        });*/







//old











    }



    public void prerequisiteProcess(ArrayList<String> CourseNoList, ArrayList<String> PrerequisiteCourse, ArrayList<String> PrerequisiteMajorCourse){


        Log.d("prerequisiteProcess", "get In");
        Log.d("PrerequisiteCoursesize:", " "+PrerequisiteCourse.size());
        Log.d("PrerequisiteMCoursesize", " "+PrerequisiteMajorCourse.size());


        Log.d("PrereCourseNolist ", " "+CourseNoList.size());


        if(PrerequisiteCourse.size() > PrerequisiteMajorCourse.size()){

            Log.d("prerequisiteProcessIn", "get In C > M");

            int check =1;
            for(int i=0;i<CourseNoList.size();i++){

                check = 1;

                for(int j=0; j < PrerequisiteCourse.size(); j++){



                    String pre1 = PrerequisiteCourse.get(j).substring(0,6);
                    String pre2 = PrerequisiteCourse.get(j).substring(7,13);
                    String pre3 = PrerequisiteCourse.get(j).substring(14,20);
                    String pre4 = PrerequisiteCourse.get(j).substring(21,27);

                    String Mpre1 = PrerequisiteMajorCourse.get(j).substring(0,6);
                    String Mpre2 = PrerequisiteMajorCourse.get(j).substring(7,13);
                    String Mpre3 = PrerequisiteMajorCourse.get(j).substring(14,20);
                    String Mpre4 = PrerequisiteMajorCourse.get(j).substring(21,27);

                    if(CourseNoList.get(i).equals(pre1) || CourseNoList.get(i).equals(pre2) || CourseNoList.get(i).equals(pre3) || CourseNoList.get(i).equals(pre4)){

                        PrerequisiteCode.add(CourseCcode.get(j));
                        PrerequisiteName.add(CourseCname.get(j));
                        check = 0;
                    }
                    if(CourseNoList.get(i).equals(Mpre1) || CourseNoList.get(i).equals(Mpre2) || CourseNoList.get(i).equals(Mpre3) || CourseNoList.get(i).equals(Mpre4)){

                        PrerequisiteCode.add(MajorCourseCcode.get(j));
                        PrerequisiteName.add(MajorCourseCname.get(j));
                        check = 0;

                    }

                }

                if(check == 1){

                    PrerequisiteCode.add("none");
                    PrerequisiteName.add("none");

                }


            }

        }
        else{

            Log.d("prerequisiteProcessIn", "get In M >= C ");

            int check =1;

            for(int i=0;i<CourseNoList.size();i++){

                Log.d("prerequisiteProcess_2", "get In for i= "+i);

                check = 1;

                for(int j=0; j < PrerequisiteMajorCourse.size(); j++){

                    Log.d("prerequisiteProcess_3", "get In for j= "+j);



                    String pre1 = PrerequisiteCourse.get(j).substring(0,6);
                    String pre2 = PrerequisiteCourse.get(j).substring(7,13);
                    String pre3 = PrerequisiteCourse.get(j).substring(14,20);
                    String pre4 = PrerequisiteCourse.get(j).substring(21,27);

                    String Mpre1 = PrerequisiteMajorCourse.get(j).substring(0,6);
                    String Mpre2 = PrerequisiteMajorCourse.get(j).substring(7,13);
                    String Mpre3 = PrerequisiteMajorCourse.get(j).substring(14,20);
                    String Mpre4 = PrerequisiteMajorCourse.get(j).substring(21,27);

                    if(CourseNoList.get(i).equals(pre1) || CourseNoList.get(i).equals(pre2) || CourseNoList.get(i).equals(pre3) || CourseNoList.get(i).equals(pre4)){

                        PrerequisiteCode.add(CourseCcode.get(j));
                        PrerequisiteName.add(CourseCname.get(j));
                        check = 0;
                    }
                    if(CourseNoList.get(i).equals(Mpre1) || CourseNoList.get(i).equals(Mpre2) || CourseNoList.get(i).equals(Mpre3) || CourseNoList.get(i).equals(Mpre4)){

                        PrerequisiteCode.add(MajorCourseCcode.get(j));
                        PrerequisiteName.add(MajorCourseCname.get(j));
                        check = 0;

                    }


                }

                if(check == 1){

                    PrerequisiteCode.add("none");
                    PrerequisiteName.add("none");

                }

                Log.d("PrerequisiteCode", " "+PrerequisiteCode.get(i));
                Log.d("PrerequisiteName", " "+PrerequisiteName.get(i));




            }




        }



    }


    private void collectCourse(RegInfoEnrollmentItems regInfoEnrollmentItems){

        if(regInfoEnrollmentItems.getGRADE() != null){

            switch (regInfoEnrollmentItems.getGRADE()){

                case "A " :

                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "B+" :

                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "B " :
                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;
                case "C+" :
                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;


                case "C " :

                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;


                case "D+" :

                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "D " :
                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "F " :
                    CollectCourseNotPass.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCourseNotPasstemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "W " :
                    CollectCourseNotPass.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCourseNotPasstemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "S " :
                    CollectCourse.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCoursetemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "U " :
                    CollectCourseNotPass.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCourseNotPasstemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "P " :
                    CollectCourseNotPass.add(regInfoEnrollmentItems.getCOURSENO());
                    CollectCourseNotPasstemp.add(regInfoEnrollmentItems.getCOURSENO());


                    break;

                case "null":


                    break;


                default:


            }

        }



    }




    //set info RegInfoDAO to use
    //&calculate gpa, credit
   /* private void setInfoHomeDAO(RegInfoHomeDAO dao) {


        Log.d("DAO", "access to setDAO");
        this.regInfoHomeDAO = dao;
        //int count0 = this.regInfoHomeDAO.getRegInfoHomeItemsList().get(0).getCount();
        //int count1 = this.regInfoHomeDAO.getRegInfoHomeItemsList().get(1).getCount();
        //Log.d("DAOcount", "count = "+count1);
        if(this.regInfoHomeDAO != null){
            //loop of all course and calculate gpa , credit

            Log.d("DAO!=null", "regInfoHomeDAO != null");
            int count1 = this.regInfoHomeDAO.getRegInfoHomeItemsList().size();
            Log.d("DAOcount", "count = "+count1);

            RegInfoHomeItems items = this.regInfoHomeDAO.getRegInfoHomeItemsList().get(0);

            *//*if(this.regInfoHomeDAO.getRegInfoHomeItemsList().size() > 0) {
                for (int i = 0; i < this.regInfoHomeDAO.getRegInfoHomeItemsList().size(); i++) {
                    Log.d("DAO2", "SUccess");

                    //student_gpa_acad_id = regInfoHomeDAO.getRegInfoHomeItemsList()
                    //student_gpa_acad_id = this.regInfoHomeDAO.getRegInfoHomeItemsList().get(i).getAcad_id();
                    Log.d("DAOcount", "access to count " + this.regInfoHomeDAO.getRegInfoHomeItemsList().get(i).getAcad_id());


                }

            }*//*

        }
        else{


            Log.d("DAO3", "Fail");
        }

    }*/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft;
        ft = manager.beginTransaction();
        Fragment fmm = null;


        Fragment fm = MainActivity.this.getSupportFragmentManager().findFragmentById(R.id.maincontent);

        //
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if(fm instanceof fmHome){
            Log.d("MainBack", " = fmHome");
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }
        else if(fm instanceof fmSholarship){
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }
        else if(fm instanceof fmCurriculum2){
            Log.d("MainBack", " = fmCurriculum2");
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }
        else if(fm instanceof fmCirriculum){
            Log.d("MainBack", " = fmCirriculum");
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }
        else if(fm instanceof fmDocument){
            Log.d("MainBack", " = fmDocument");
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }
        else if(fm instanceof fmProfile){
            Log.d("MainBack", " = fmProfile");
            fmm = new fmWelcome();

            ft = getSupportFragmentManager().beginTransaction();



            ft.replace(R.id.maincontent, fmm);
            ft.commit();

        }

        else {

            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        //when click navbar set text in nav header main
        TextView head_main = (TextView) findViewById(R.id.nav_head_main);
        TextView head_main2 = (TextView) findViewById(R.id.nav_head_main2);

        head_main.setText(Mis_st_id);
        head_main2.setText(Mis_cmu_account);

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        // Handle navigation view item clicks here.
        //normal activity stlye
        /*int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }else if (id == R.id.nav_manage2){

        }*/

        //fragment style


        //FragmentManager manager = getSupportFragmentManager();
        //FragmentTransaction transaction = manager.beginTransaction();
        //fmProfile profile = new fmProfile();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft;
        ft = manager.beginTransaction();

        Fragment fm = null;

        //fm profile
        Bundle bundle = new Bundle();
        //fm home
        Bundle bundle2 = new Bundle();
        //fm cirriculum map
        Bundle bundle3 = new Bundle();
        //fm cirriculum
        Bundle bundle4 = new Bundle();
        //fm timetable
        Bundle bundle5 = new Bundle();
        String strTitle ="";



        switch (item.getItemId()){
            case R.id.nav_home:
                fm = new fmHome();
                strTitle = "Home";



                bundle2.putString("key_Mis_st_id", Mis_st_id);
                bundle2.putDouble("key_Gpax", Gpax);
                //bundle2.putDouble("key_Mgpax", Mgpax);
                bundle2.putDouble("key_Getcredit", Getcredit);
                bundle2.putString("key_MinimumCredit", MinimumCredit);

                bundle2.putStringArrayList("key_Enrolled", Enrolled);
                bundle2.putStringArrayList("key_MajorCourseCcode", MajorCourseCcode);
                bundle2.putStringArrayList("key_MajorCredit", MajorCredit);
                bundle2.putStringArrayList("key_EnrolledGrade", EnrolledGrade);


                fm.setArguments(bundle2);

                break;
            case R.id.nav_sholarship:
                fm = new fmSholarship();
                strTitle = "Timetable";

                bundle5.putStringArrayList("key_courseno", CourseNoList);
                bundle5.putStringArrayList("key_coursetitle", CourseTitleList);

                bundle5.putStringArrayList("key_DAYLEC_1", DAYLEC_1);
                bundle5.putStringArrayList("key_BTLEC_1", BTLEC_1);
                bundle5.putStringArrayList("key_FTLEC_1", FTLEC_1);
                bundle5.putStringArrayList("key_ROOM", ROOM);

                bundle5.putStringArrayList("key_DAYLEC_2", DAYLEC_2);
                bundle5.putStringArrayList("key_BTLEC_2", BTLEC_2);
                bundle5.putStringArrayList("key_FTLEC_2", FTLEC_2);


                fm.setArguments(bundle5);



                break;

            case R.id.nav_calculateGPA:

                fm = new fmCurriculum2();
                strTitle = "Curriculum map";

                bundle3.putStringArrayList("key_coursenotemp", CourseNoListtemp);

                bundle3.putStringArrayList("key_collect_course", CollectCourse);
                bundle3.putStringArrayList("key_CollectCourseNotPass", CollectCourseNotPass);

                bundle3.putString("key_Major_id", Major_id);
                bundle3.putString("key_Curriculum_id", Curriculum_id);

                bundle3.putStringArrayList("key_CourseCcode", CourseCcode);
                bundle3.putStringArrayList("key_CourseCname", CourseCname);
                bundle3.putStringArrayList("key_Cyear", Cyear);
                bundle3.putStringArrayList("key_Csemester", Csemester);

                bundle3.putStringArrayList("key_MajorCourseCcode", MajorCourseCcode);
                bundle3.putStringArrayList("key_MajorCourseCname",MajorCourseCname);
                bundle3.putStringArrayList("key_MCyear", MCyear);
                bundle3.putStringArrayList("key_MCsemester", MCsemester);

                bundle3.putStringArrayList("key_PrerequisiteCourse", PrerequisiteCourse);
                bundle3.putStringArrayList("key_PrerequisiteMajorCourse", PrerequisiteMajorCourse);

                bundle3.putStringArrayList("key_collect_course_temp", CollectCoursetemp);
                bundle3.putStringArrayList("key_CollectCourseNotPass_temp", CollectCourseNotPasstemp);

                bundle3.putInt("key_dataChecklv", dataChecklv);

                bundle3.putStringArrayList("key_temp1", temp1);
                bundle3.putStringArrayList("key_temp2", temp2);

                bundle3.putStringArrayList("key_courseno", CourseNoList);




                Log.d("fmCurargu4_5main", ""+CollectCourse.size());
                Log.d("fmCurargu4_6main", ""+CollectCourseNotPass.size());
                Log.d("fmCurargu4_7main", ""+CollectCoursetemp.size());
                Log.d("fmCurargu4_8main", ""+CollectCourseNotPasstemp.size());






                fm.setArguments(bundle3);


                break;

            case R.id.nav_curriculum:

                myfm.doSomethingByActivity(dataCheckbond);

                fm = new fmCirriculum();
                strTitle = "Curriculum";

                bundle4.putStringArrayList("key_courseno", CourseNoList);
                bundle4.putStringArrayList("key_coursetitle", CourseTitleList);
                bundle4.putStringArrayList("key_crelec", CreLecList);
                bundle4.putStringArrayList("key_crelab", CreLabList);

                bundle4.putStringArrayList("key_PrerequisiteCourse", PrerequisiteCourse);
                bundle4.putStringArrayList("key_CourseCcode", CourseCcode);
                bundle4.putStringArrayList("key_CourseCname", CourseCname);

                bundle4.putStringArrayList("key_PrerequisiteMajorCourse", PrerequisiteMajorCourse);
                bundle4.putStringArrayList("key_MajorCourseCcode", MajorCourseCcode);
                bundle4.putStringArrayList("key_MajorCourseCname",MajorCourseCname);


                bundle4.putStringArrayList("key_Enrolled", Enrolled);
                bundle4.putStringArrayList("key_MajorCredit", MajorCredit);
                bundle4.putStringArrayList("key_EnrolledGrade", EnrolledGrade);
                bundle4.putDouble("key_Gpax", Gpax);
                bundle4.putDouble("key_Getcredit", Getcredit);

                bundle4.putInt("key_dataCheckbond", dataCheckbond);

                bundle4.putDouble("key_c_credit", c_credit);

                //
                //bundle4.putStringArrayList("key_PrerequisiteCode", PrerequisiteCode);
                //bundle4.putStringArrayList("key_PrerequisiteName", PrerequisiteName);
                fm.setArguments(bundle4);


                break;

                //test tab case
            /*case R.id.nav_document:
                fm = new fmDocument();
                strTitle = "Documentation";

                break;*/
            case R.id.nav_document:
                fm = new fmDocument();
                strTitle = "Documentation";


                Bundle testBundle = new Bundle();
                testBundle.putString("testDoc", "12345678");
                fm.setArguments(testBundle);

                break;

            case R.id.nav_profile:
                //


                //
                fm = new fmProfile();
                strTitle = "Profile";


                //
                //FragmentManager manager = getSupportFragmentManager();
                //FragmentTransaction transaction = manager.beginTransaction();
                //fmProfile profile = new fmProfile();
                //transaction.add(R.id.maincontent, profile);
                //transaction.commit();

                //passing info
                //Bundle bundle = new Bundle();
                bundle.putString("key_Mis_st_id", Mis_st_id);
                bundle.putString("key_Mis_st_prenameth", Mis_st_prenameth);
                bundle.putString("key_Mis_st_nameth", Mis_st_nameth);
                bundle.putString("key_Mis_st_lnameth", Mis_st_lnameth);
                bundle.putString("key_Mis_cmu_account", Mis_cmu_account);
                bundle.putString("key_Mis_faculty", Mis_faculty);

                bundle.putString("key_Major_name_th", Major_name_th);
                bundle.putString("key_Level_name_th", Level_name_th);
                bundle.putString("key_Adviser_name", Adviser_name);
                bundle.putString("key_Adviser_cmu_account", Adviser_cmu_account);




                bundle.putString("GG", "5555555555");
                fm.setArguments(bundle);

                //profile.setArguments(bundle);
                //transaction.add(R.id.maincontent, profile);
                //transaction.commit();

                //


                break;

            case R.id.nav_signout:
                Intent intent;
                intent = new Intent(MainActivity.this, FirstActivity.class);

                startActivity(intent);

                finish();


                break;
        }

        if(fm != null){
            ft = getSupportFragmentManager().beginTransaction();

            //

            //


            ft.replace(R.id.maincontent, fm);
            ft.commit();
            //TextView tv1 = (TextView) findViewById(R.id.textView10);
            //tv1.setText(strTitle);



            if(strTitle.equals("Home")){
                toolbar.setTitleMarginStart(180);
                toolbar.setTitle(strTitle);


            }
            else if(strTitle.equals("Timetable")){
                toolbar.setTitleMarginStart(150);
                toolbar.setTitle(strTitle);


            }
            else if(strTitle.equals("Curriculum map")){
                toolbar.setTitleMarginStart(125);
                toolbar.setTitle(strTitle);



            }
            else if(strTitle.equals("Curriculum")){
                toolbar.setTitleMarginStart(150);
                toolbar.setTitle(strTitle);



            }
            else if(strTitle.equals("Documentation")){
                toolbar.setTitleMarginStart(130);
                toolbar.setTitle(strTitle);


            }
            else if(strTitle.equals("Profile")){
                toolbar.setTitleMarginStart(180);
                toolbar.setTitle(strTitle);


            }
            else{
                toolbar.setTitleMarginStart(120);
                toolbar.setTitle(strTitle);
            }








        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){

        if(keyCode == KeyEvent.KEYCODE_HOME){


            finish();
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Mainonstart", "onstart");


        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft;
        ft = manager.beginTransaction();

        Fragment fm = MainActivity.this.getSupportFragmentManager().findFragmentById(R.id.maincontent);

        if(fm != null){
            Log.d("Mainonstart_2", "not null");
            if(fm instanceof fmHome){
                toolbar.setTitle("Home");
                toolbar.setTitleMarginStart(180);

            }
            else if(fm instanceof fmSholarship){
                toolbar.setTitle("Timetable");
                toolbar.setTitleMarginStart(150);
            }
            else if(fm instanceof fmCurriculum2){
                toolbar.setTitle("Curriculum map");
                toolbar.setTitleMarginStart(125);

            }
            else if(fm instanceof fmCirriculum){
                toolbar.setTitle("Curriculum");
                toolbar.setTitleMarginStart(150);

            }
            else if(fm instanceof fmDocument){

                toolbar.setTitle("Documentation");
                toolbar.setTitleMarginStart(130);
            }
            else if(fm instanceof fmProfile){
                toolbar.setTitle("Profile");
                toolbar.setTitleMarginStart(180);
            }
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.maincontent, fm);
            ft.commit();
        }
        else{
            Log.d("Mainonstart_2", "null else");
            fm = new fmWelcome();
            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.maincontent, fm);
            ft.commit();

        }



        /*FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft;
        ft = manager.beginTransaction();

        Fragment fm = null;

        fm = new fmWelcome();


        ft = getSupportFragmentManager().beginTransaction();



        ft.replace(R.id.maincontent, fm);
        ft.commit();
*/


    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d("MainonRestart", "onRestart");
        //handle oncreate
        Log.d("MainonRestart st id", "Mis_st_id"+Mis_st_id);

    }



    @Override
    public void onStop() {
        super.onStop();


    }











}
