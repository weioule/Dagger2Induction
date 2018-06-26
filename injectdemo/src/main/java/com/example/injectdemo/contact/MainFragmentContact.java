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
       
        private MainView mainView;
        
        @Inject
        protected UserFactory mUserFactory;

        @Inject
        public Presenter() {
        }

        public void setView(MainView mainView) {
            this.mainView = mainView;
        }

        public void showToastBtnClick() {
            String msg = "hello " + userRepostory.getUser().getName();
            mainView.showToast(msg);
        }

        public void setUserNameBtnClick() {
            this.mainView.setUserName(userRepostory.getUser().getName());
        }
    }

}
