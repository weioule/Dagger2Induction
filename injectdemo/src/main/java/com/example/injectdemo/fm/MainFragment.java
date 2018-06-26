package com.example.injectdemo.fm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.injectdemo.R;
import com.example.injectdemo.act.MainActivity;
import com.example.injectdemo.contact.MainFragmentContact;
import com.example.injectdemo.utils.ToastUtil;

import javax.inject.Inject;

/**
 * author weioule
 * Create on 2018/6/25.
 */
public class MainFragment extends Fragment implements MainFragmentContact.MainView, View.OnClickListener {

    @Inject
    protected MainFragmentContact.Presenter mPresenter;

    @Inject
    ToastUtil mToastUtil;
    private TextView mUserName;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).getMainComponent().getMainFragmentComponent().inject(this);
        }

        mPresenter.setView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUserName = (TextView) view.findViewById(R.id.user_name);
        view.findViewById(R.id.btn_toast).setOnClickListener(this);
        view.findViewById(R.id.btn_set_user_name).setOnClickListener(this);
    }

    @Override
    public void setUserName(String name) {
        mUserName.setText(name);
    }

    @Override
    public void showToast(String msg) {
        mToastUtil.showToast(msg);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_set_user_name:
                mPresenter.setUserNameBtnClick();
                break;
            case R.id.btn_toast:
                mPresenter.showToastBtnClick();
                break;
        }
    }
}
