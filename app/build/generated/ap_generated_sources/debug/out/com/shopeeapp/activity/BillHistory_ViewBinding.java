// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.activity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BillHistory_ViewBinding implements Unbinder {
  private BillHistory target;

  @UiThread
  public BillHistory_ViewBinding(BillHistory target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BillHistory_ViewBinding(BillHistory target, View source) {
    this.target = target;

    target.btnBack = Utils.findRequiredViewAsType(source, R.id.btnBack, "field 'btnBack'", ImageButton.class);
    target.swViewAll = Utils.findRequiredViewAsType(source, R.id.swViewAll, "field 'swViewAll'", SwitchMaterial.class);
    target.rvBillHistory = Utils.findRequiredViewAsType(source, R.id.rvBillHistory, "field 'rvBillHistory'", RecyclerView.class);
    target.noMoreBills = Utils.findRequiredViewAsType(source, R.id.noMoreBills, "field 'noMoreBills'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BillHistory target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnBack = null;
    target.swViewAll = null;
    target.rvBillHistory = null;
    target.noMoreBills = null;
  }
}
