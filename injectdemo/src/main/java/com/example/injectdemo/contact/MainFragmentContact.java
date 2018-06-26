package com.example.injectdemo.contact;

import com.example.injectdemo.mode.UserRepostory;

import javax.inject.Inject;

/**
 * author weioule
 * Create on 2018/6/25.
 */
public class MainFragmentContact {
    public interface MainView {
        void setUserName(String name);

        void showToast(String msg);
    }

    public static class Presenter {
        private UserRepostory userRepostory;
        private MainView mainView;
        private String userName;

        @Inject
        public Presenter(UserRepostory userRepostory) {
            this.userRepostory = userRepostory;
            userName = this.userRepostory.getUser().getName();
        }

        public void setView(MainView mainView) {
            this.mainView = mainView;
        }

        public void showToastBtnClick() {
            String msg = "hello " + userName;
            mainView.showToast(msg);
        }

        public void setUserNameBtnClick() {
            this.mainView.setUserName(userName);
        }
    }

}
