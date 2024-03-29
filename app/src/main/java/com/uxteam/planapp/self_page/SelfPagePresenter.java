package com.uxteam.planapp.self_page;

import android.view.View;
import android.widget.Toast;

import com.uxteam.planapp.R;

import java.util.ArrayList;
import java.util.List;

public class SelfPagePresenter {
    private SelfPage selfPage;

    public SelfPagePresenter(SelfPage selfpage) {
        this.selfPage = selfpage;
    }
    public void load(){
        selfPage.refreshView(
                getUserName(), 
                getRecItem(),
                loginOut()
        );
    }
    private View.OnClickListener loginOut(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(selfPage.getContext(), "退出登录", Toast.LENGTH_SHORT).show();
            }
        };
    }
    private SelfPageRecAdt getRecItem() {
        List<SelfPageRecItem> items=new ArrayList<>();
        SelfPageRecAdt selfPageRecAdt;

        items.add(new SelfPageRecItem(R.mipmap.list,"监督列表"));
        items.add(new SelfPageRecItem(R.mipmap.frends,"朋友列表"));
        selfPageRecAdt = new SelfPageRecAdt(selfPage.getContext(),items);
        return selfPageRecAdt;
    }
    private String getUserName(){
        
        return "AAA";
    }

}
