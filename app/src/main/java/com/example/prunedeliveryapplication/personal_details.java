package com.example.prunedeliveryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prunedeliveryapplication.api.PersonaldetailApiClient;
import com.example.prunedeliveryapplication.api.ResponseDefault;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class personal_details extends AppCompatActivity {

    private String selectedState, selectedDistrict;
    private TextView textview_indian_states, textview_indian_districts;
    private Spinner spinner_indian_states, spinner_indian_districts;
    private ArrayAdapter<CharSequence> stateAdapter, districtAdapter;
    String[] genders = {"Male", "Female", "other"};
    AutoCompleteTextView auto_complete_text;
    ArrayAdapter<String> adapterItems;


    TextInputEditText name_blank;
    TextInputEditText father_name;
    TextInputEditText address_blank;
    TextInputEditText pincode_blank;
    EditText dob_blank;
    Calendar calendar;
    Button but_per_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        name_blank = findViewById(R.id.name_blank);
        father_name = findViewById(R.id.father_name);
        address_blank = findViewById(R.id.address_blank);
        pincode_blank = findViewById(R.id.pincode_blank);
        but_per_submit = findViewById(R.id.but_per_submit);


        spinner_indian_states = findViewById(R.id.spinner_indian_states);
        stateAdapter = ArrayAdapter.createFromResource(this, R.array.array_india_states, R.layout.spinner_layout);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_indian_states.setAdapter(stateAdapter);

        spinner_indian_states.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinner_indian_districts = findViewById(R.id.spinner_indian_districts);

                selectedState = spinner_indian_states.getSelectedItem().toString();
                int parentID = parent.getId();
                if (parentID == R.id.spinner_indian_states) {
                    switch (selectedState) {
                        case "Select Your State":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_default_districts, R.layout.spinner_layout);

                            break;
                        case "Andhra Pradesh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_andhra_pradesh_districts, R.layout.spinner_layout);
                            break;
                        case "Arunachal Pradesh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_arunachal_pradesh_districts, R.layout.spinner_layout);
                            break;
                        case "Assam":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_assam_districts, R.layout.spinner_layout);
                            break;
                        case "Bihar":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_bihar_districts, R.layout.spinner_layout);
                            break;
                        case "Chhattisgarh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_chhattisgarh_districts, R.layout.spinner_layout);
                            break;
                        case "Goa":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_goa_districts, R.layout.spinner_layout);
                            break;
                        case "Gujarat":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_gujarat_districts, R.layout.spinner_layout);
                            break;
                        case "Haryana":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_haryana_districts, R.layout.spinner_layout);
                            break;
                        case "Himachal Pradesh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_himachal_pradesh_districts, R.layout.spinner_layout);
                            break;
                        case "Jharkhand":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_jharkhand_districts, R.layout.spinner_layout);
                            break;
                        case "Karnataka":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_karnataka_districts, R.layout.spinner_layout);
                            break;
                        case "Kerala":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_kerala_districts, R.layout.spinner_layout);
                            break;
                        case "Madhya Pradesh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_madhya_pradesh_districts, R.layout.spinner_layout);
                            break;
                        case "Maharashtra":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_maharashtra_districts, R.layout.spinner_layout);
                            break;
                        case "Manipur":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_manipur_districts, R.layout.spinner_layout);
                            break;
                        case "Meghalaya":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_meghalaya_districts, R.layout.spinner_layout);
                            break;
                        case "Mizoram":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_mizoram_districts, R.layout.spinner_layout);
                            break;
                        case "Nagaland":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_nagaland_districts, R.layout.spinner_layout);
                            break;
                        case "Odisha":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_odisha_districts, R.layout.spinner_layout);
                            break;
                        case "Punjab":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_punjab_districts, R.layout.spinner_layout);
                            break;
                        case "Rajasthan":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_rajasthan_districts, R.layout.spinner_layout);
                            break;
                        case "Sikkim":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_sikkim_districts, R.layout.spinner_layout);
                            break;
                        case "Tamil Nadu":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tamil_nadu_districts, R.layout.spinner_layout);
                            break;
                        case "Telangana":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_telangana_districts, R.layout.spinner_layout);
                            break;
                        case "Tripura":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_tripura_districts, R.layout.spinner_layout);
                            break;
                        case "Uttar Pradesh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uttar_pradesh_districts, R.layout.spinner_layout);
                            break;
                        case "Uttarakhand":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_uttarakhand_districts, R.layout.spinner_layout);
                            break;
                        case "West Bengal":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_west_bengal_districts, R.layout.spinner_layout);
                            break;
                        case "Andaman and Nicobar Islands":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_andaman_nicobar_districts, R.layout.spinner_layout);
                            break;
                        case "Chandigarh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_chandigarh_districts, R.layout.spinner_layout);
                            break;
                        case "Dadra and Nagar Haveli":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_dadra_nagar_haveli_districts, R.layout.spinner_layout);
                            break;
                        case "Daman and Diu":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_daman_diu_districts, R.layout.spinner_layout);
                            break;
                        case "Delhi":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_delhi_districts, R.layout.spinner_layout);
                            break;
                        case "Jammu and Kashmir":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_jammu_kashmir_districts, R.layout.spinner_layout);
                            break;
                        case "Lakshadweep":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_lakshadweep_districts, R.layout.spinner_layout);
                            break;
                        case "Ladakh":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_ladakh_districts, R.layout.spinner_layout);
                            break;
                        case "Puducherry":
                            districtAdapter = ArrayAdapter.createFromResource(parent.getContext(),
                                    R.array.array_puducherry_districts, R.layout.spinner_layout);
                            break;
                        default:
                            break;
                    }
                    districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner_indian_districts.setAdapter(districtAdapter);
                    spinner_indian_districts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            selectedDistrict = spinner_indian_districts.getSelectedItem().toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        but_per_submit = findViewById(R.id.but_per_submit);
        textview_indian_states = findViewById(R.id.textview_indian_states);
        textview_indian_districts = findViewById(R.id.textview_indian_districts);

        but_per_submit.setOnClickListener(v -> {
            validateData();
            if (selectedState.equals("Select Your State")) {
                Toast.makeText(personal_details.this, "Please select your state from the list", Toast.LENGTH_LONG).show();
                textview_indian_states.setError("State is required!");      //To set error on TextView
                textview_indian_states.requestFocus();
            } else if (selectedDistrict.equals("Select Your District")) {
                Toast.makeText(personal_details.this, "Please select your district from the list", Toast.LENGTH_LONG).show();
                textview_indian_districts.setError("District is required!");
                textview_indian_districts.requestFocus();
                textview_indian_states.setError(null);                      //To reove error from stateSpinner
            } else {
                textview_indian_states.setError(null);
                textview_indian_districts.setError(null);
                Toast.makeText(personal_details.this, "Selected State: " + selectedState + "\nSelected District: " + selectedDistrict, Toast.LENGTH_LONG).show();
            }
        });


        auto_complete_text = findViewById(R.id.auto_complete_text);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, genders);
        auto_complete_text.setAdapter(adapterItems);
        auto_complete_text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String gender = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "gender: " + gender, Toast.LENGTH_SHORT).show();

            }
        });

        dob_blank = findViewById(R.id.dob_blank);
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayofMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, dayofMonth);

                updateCalender();

            }

            private void updateCalender() {
                String Format = "MM/dd/yy";
                SimpleDateFormat sdf = new SimpleDateFormat(Format, Locale.US);

                dob_blank.setText(sdf.format(calendar.getTime()));
            }
        };
        dob_blank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(personal_details.this, date, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void validateData() {
        String name = name_blank.getText().toString().trim();
        String fathername = father_name.getText().toString().trim();
        String dob = dob_blank.getText().toString().trim();
        String address = address_blank.getText().toString().trim();
        String pincode = pincode_blank.getText().toString().trim();
        String state = spinner_indian_states.getSelectedItem().toString().trim();
        String district = spinner_indian_districts.getSelectedItem().toString().trim();
        String gender = auto_complete_text.getText().toString().trim();
        if (name.isEmpty()) {
            name_blank.setError("Enter Name");
            name_blank.requestFocus();
            return;
        }
        if (name.length() < 4) {
            name_blank.setError("Name too Short");
            name_blank.requestFocus();
            return;
        }
        if (name.length() > 30) {
            name_blank.setError("Name too long");
            name_blank.requestFocus();
            return;
        }

        if (fathername.isEmpty()) {
            father_name.setError("Enter Father's Name");
            father_name.requestFocus();
            return;
        }


        if (address.isEmpty()) {
            address_blank.setError("Enter address");
            address_blank.requestFocus();
            return;
        }
        if (pincode.isEmpty()) {
            pincode_blank.setError("Enter Pincode");
            pincode_blank.requestFocus();
            return;
        } else {
            doSubmit(name, fathername, dob, address, pincode, state, district,gender);
        }


    }

    private void doSubmit(String name, String fathername, String dob, String address, String pincode, String state, String district, String gender) {
        Call<ResponseDefault> call = PersonaldetailApiClient.getInstance().getApi().getdetails(name, fathername, dob, address,  state, district,pincode,gender );
        call.enqueue(new Callback<ResponseDefault>() {
            @Override
            public void onResponse(Call<ResponseDefault> call, Response<ResponseDefault> response) {
                if (response.isSuccessful()) {
                    ResponseDefault respnse = response.body();
                   /* if (respnse.isError()) {
                        Toast.makeText(personal_details.this, String.valueOf(respnse.), Toast.LENGTH_SHORT).show();
                        
                    }*/
                }
            }

            @Override
            public void onFailure(Call<ResponseDefault> call, Throwable t) {

                t.printStackTrace();
            }
        });

    }

}