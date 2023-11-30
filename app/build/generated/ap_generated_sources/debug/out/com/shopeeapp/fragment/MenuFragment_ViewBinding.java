// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MenuFragment_ViewBinding implements Unbinder {
  private MenuFragment target;

  @UiThread
  public MenuFragment_ViewBinding(MenuFragment target, View source) {
    this.target = target;

    target.menuAvatar = Utils.findRequiredViewAsType(source, R.id.menuAvatar, "field 'menuAvatar'", ImageView.class);
    target.menuFullName = Utils.findRequiredViewAsType(source, R.id.menuFullName, "field 'menuFullName'", TextView.class);
    target.menuUsername = Utils.findRequiredViewAsType(source, R.id.menuUsername, "field 'menuUsername'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MenuFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.menuAvatar = null;
    target.menuFullName = null;
    target.menuUsername = null;
  }
}
