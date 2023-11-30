// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.fragment;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationFragment_ViewBinding implements Unbinder {
  private NotificationFragment target;

  @UiThread
  public NotificationFragment_ViewBinding(NotificationFragment target, View source) {
    this.target = target;

    target.rvNotifications = Utils.findRequiredViewAsType(source, R.id.rvNotifications, "field 'rvNotifications'", RecyclerView.class);
    target.noMoreNotifications = Utils.findRequiredViewAsType(source, R.id.noMoreNotifications, "field 'noMoreNotifications'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvNotifications = null;
    target.noMoreNotifications = null;
  }
}
