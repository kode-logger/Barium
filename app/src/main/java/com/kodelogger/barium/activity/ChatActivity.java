package com.kodelogger.barium.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kodelogger.barium.databinding.ActivityChatBinding;
import com.kodelogger.barium.model.User;
import com.kodelogger.barium.util.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners() {
        binding.backImage.setOnClickListener(v -> onBackPressed());
    }
}