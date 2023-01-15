package com.example.anime_db.homeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.example.anime_db.R;
import com.example.anime_db.adapter.UserAdapter;
import com.example.anime_db.model.user.DataUser;
import com.example.anime_db.model.user.ResponseUser;
import com.example.anime_db.rest.ApiClient;
import com.example.anime_db.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class UserFragment extends Fragment {
    private String userNameData;

    public UserFragment(String userNameData){
        this.userNameData = userNameData;
    }

    private void setDataUser(DataUser dataUser, View view){
        UserAdapter userAdapter = new UserAdapter(getContext(), dataUser, view);
        userAdapter.showImageUser();
        userAdapter.showUserName();
        userAdapter.showJoined();
        userAdapter.showLastOnline();
        userAdapter.showDaysWatch();
        userAdapter.showMeanScore();
        userAdapter.showWatching();
        userAdapter.showComplete();
        userAdapter.showOnHold();
        userAdapter.showDropped();
        userAdapter.showPlanToWatch();
        userAdapter.showTotalEntries();
        userAdapter.showRewatched();
        userAdapter.showEpisodeWatch();
    }

    private void callRetrofit(String userNameData, View view){
        RelativeLayout displayProfile = view.findViewById(R.id.layoutProfile);
        RelativeLayout displayNoUserFound = view.findViewById(R.id.layoutNoUserFound);
        RelativeLayout displayLoading = view.findViewById(R.id.layoutLoading);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<ResponseUser> call = apiInterface.getUserProfile(userNameData);
        call.enqueue(new Callback<ResponseUser>() {
            @Override
            public void onResponse(Call<ResponseUser> call, Response<ResponseUser> response) {
                if(response.isSuccessful()){
                    DataUser dataUser = response.body().getData();
                    displayProfile.setVisibility(View.VISIBLE);
                    displayNoUserFound.setVisibility(View.GONE);
                    setDataUser(dataUser, view);
                    displayLoading.setVisibility(View.GONE);
                } else{
                    displayProfile.setVisibility(View.GONE);
                    displayNoUserFound.setVisibility(View.VISIBLE);
                    displayLoading.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<ResponseUser> call, Throwable t) {
                displayProfile.setVisibility(View.GONE);
                displayNoUserFound.setVisibility(View.VISIBLE);
                displayLoading.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        callRetrofit(userNameData, view);

        return view;
    }
}