package com.example.tuan2p2bai2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tuan2p2bai2.R;

public class MainActivity extends AppCompatActivity {
    Button dn, thoat;
    CheckBox luu;
    EditText user1, user2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dn = (Button) findViewById(R.id.button_dn);
        thoat = (Button) findViewById(R.id.button_thoat);
        luu = (CheckBox) findViewById(R.id.checkBox_luu);
        user1 = (EditText) findViewById(R.id.editText_tk1);
        user2 = (EditText) findViewById(R.id.editText_tk2);
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user1kq = user1.getText().toString();
                String user2kq = user2.getText().toString();
                if (luu.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Chào mừng bạn đăng nhập hệ thống," +
                            " thông tin của bạn đã được lưu", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Chào mừng bạn đăng nhập hệ thống," +
                            " thông tin của bạn không được lưu", Toast.LENGTH_SHORT).show();
                }
            }

        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.message_dialog_exist_title);
                builder.setMessage(R.string.message_dialog_exist);

                builder.setPositiveButton(R.string.message_dialog_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });

                builder.setNeutralButton(R.string.message_dialog_cancle, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
