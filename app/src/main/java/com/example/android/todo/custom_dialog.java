package com.example.android.todo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class custom_dialog extends AppCompatDialogFragment {
    private EditText editTextTask;
    private EditText editTextdate;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view= inflater.inflate(R.layout.custom, null);
        builder.setView(view)
                .setTitle("Add Task")
                .setNegativeButton("cancel" ,new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i)
        {}
    })
                .setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });


        editTextTask=view.findViewById(R.id.edit_task);
        editTextdate=view.findViewById(R.id.edit_date);


        return  builder.create();
    }
}
